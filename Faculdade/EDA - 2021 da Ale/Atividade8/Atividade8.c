#include <stdio.h>
#include <stdlib.h>

/*
============
Alessandra de Lima Leria - 760884
============
*/

struct _node
{
    int indice;
    int dist;
    struct _node *prox;
};
typedef struct _node node;

struct _fila
{
    node *comeco;
    node *fim;
};
typedef struct _fila fila;

struct _grafo
{
    int vertices;
    int **matriz;
};
typedef struct _grafo Grafo;

void inicializar(Grafo *g, int v);

void adicionar(Grafo *g, int v, int a);

void percorrerGrafo(Grafo *g, int comeco);

void percorrerGrafoPrivado(Grafo *g, int *visitas, fila *f);

void destruir(Grafo *g);

int main()
{
    Grafo g;
    int vertices = 0;
    int comeco = 0;

    scanf("%d", &vertices);

    inicializar(&g, vertices);

    int v, a;
    scanf("%d, %d", &v, &a);
    
    while(v != 0 && a != 0)
    {
        adicionar(&g, v, a);
        scanf("%d, %d", &v, &a);
    }

    scanf("%d", &comeco);
    percorrerGrafo(&g, comeco);

    destruir(&g);
    return 0;
}

void inicializar(Grafo *g, int v)
{
    g->vertices = v;
    g->matriz = (int**)malloc(sizeof(int*)* v);
    for(int i = 0; i < v; i++)
    {
        g->matriz[i] = (int*)malloc(sizeof(int)* v);
    }
}

void adicionar(Grafo *g, int v, int a)
{
    v = v - 1;
    a = a - 1;
    g->matriz[v][a] = 1;
    g->matriz[a][v] = 1;
}

void percorrerGrafo(Grafo *g, int comeco)
{
    int *visitas = malloc(sizeof(int) * g->vertices);
    printf("Origem da busca: %d\nVertices alcancados e distancias:\n", comeco);
    fila *f = malloc(sizeof(fila));
    f->comeco = malloc(sizeof(node));
    f->comeco->prox = 0;
    f->comeco->dist = 0;
    f->comeco->indice = comeco - 1;
    f->fim = f->comeco;
    visitas[comeco - 1] = 1;
    percorrerGrafoPrivado(g, visitas, f);
    free(visitas);
}

void percorrerGrafoPrivado(Grafo *g, int *visitas, fila *f)
{
    if(f->comeco == 0)
        return;
    
    for (int i = 0; i < g->vertices; i++)
    {
        if(visitas[i] != 1 && g->matriz[f->comeco->indice][i] == 1)
        {
            node *aux = malloc(sizeof(node));
            aux->dist = f->comeco->dist + 1;
            aux->prox = 0;
            aux->indice = i;
            f->fim->prox = aux;
            f->fim = aux;
            visitas[i] = 1;
        }
    }
    //printf("%d %d\n", f->comeco->indice, f->comeco->prox->indice);
    node *rem = f->comeco;
    f->comeco = rem->prox;
    printf("%d %d\n", rem->indice + 1, rem->dist);
    free(rem);
    percorrerGrafoPrivado(g, visitas, f);
}

void destruir(Grafo *g)
{
    for(int i = 0; i < g->vertices; i = i + 1)
    {
        free(g->matriz[i]);
    }
    free(g->matriz);
}
