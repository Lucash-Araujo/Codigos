#include <stdio.h>
#include <stdlib.h>

/*
============
Alessandra de Lima Leria - 760884
============
*/

//struct pra não precisar inicializar timestamp e visitado a cada arco novo inserido já que não seriam utilizados
struct _ligacao
{
    int info;
    struct _ligacao *prox;
};
typedef struct _ligacao Ligacao;

struct _node
{
    int info;
    Ligacao *comeco;
    int timestamp[2];
    char visitado;
};
typedef struct _node Node;

struct _grafo
{
    int vertices;
    Node **lista;
};
typedef struct _grafo Grafo;

void inicializar(Grafo *g, int v);

void adicionar(Grafo *g, int v, int a);

void percorrerGrafo(Grafo *g);

//O atual serve pra mostrar onde comeca a busca
//Retorna 1 pra clico e 0 pra aciclico
int percorrerGrafoPrivado(Grafo *g, Node *n, int *visitas);

//A função exibirTimestamp e verificarCiclo foram mescladas com o percorrerGrafoPrivados
//Igual o percorrerGrafoPrivado mas com printf
void exibirTimestamp(Grafo *g, Node *n);

//Igual o percorrerGrafoPrivado mas 'desvisita' na saída
//Retorna 1 pra clico e 0 pra aciclico
int verificarCiclo(Grafo *g, Node *n);

void destruir(Grafo *g);

int main()
{
    Grafo g;
    int vertices = 0;

    scanf("%d", &vertices);

    inicializar(&g, vertices);

    int v, a;
    scanf("%d, %d", &v, &a);
    
    while(v != 0 && a != 0)
    {
        adicionar(&g, v, a);
        scanf("%d, %d", &v, &a);
    }

    percorrerGrafo(&g);

    destruir(&g);
    return 0;
}

void inicializar(Grafo *g, int v)
{
    g->vertices = v;
    g->lista = malloc(sizeof(Node*)* (v + 1));
    for(int i = 0; i < v + 1; i++)
    {
        g->lista[i] = malloc(sizeof(Node));
        g->lista[i]->info = i;
        g->lista[i]->comeco = NULL;
        g->lista[i]->timestamp[0] = 0;
        g->lista[i]->timestamp[1] = 0;
        g->lista[i]->visitado = 0;
    }
}

void adicionar(Grafo *g, int v, int a)
{
    Ligacao *aux = malloc(sizeof(Ligacao));
    aux->info = a - 1;
    aux->prox = g->lista[v - 1]->comeco;
    g->lista[v - 1]->comeco = aux;
}

void percorrerGrafo(Grafo *g)
{
    int visitas = 1;
    int resultado = 0;
    for(int i = 0; i < g->vertices; i++)
    {
        if(g->lista[i]->visitado == 0)
        {
            if(percorrerGrafoPrivado(g, g->lista[i], &visitas))
            {
                resultado = 1;
            }
        }
    }

    Ligacao *l = g->lista[g->vertices]->comeco;
    while(l)
    {
        printf("%d [%d,%d]\n", l->info + 1, g->lista[l->info]->timestamp[0], g->lista[l->info]->timestamp[1]);
        l = l->prox;
    }

    /*for(int i = 0; i < g->vertices; i++)
    {
        if(g->lista[i]->visitado == 1)
        {
            exibirTimestamp(g, g->lista[i]);
        }
    }*/

    /*int resultado = 0;
    for(int i = 0; i < g->vertices; i++)
    {
        if(g->lista[i]->visitado == 1)
        {
            if(verificarCiclo(g, g->lista[i]))
            {
                resultado = 1;
            }
        }
    }*/

    if(resultado)
    {
        printf("aciclico: nao");
    }
    else
    {
        printf("aciclico: sim");
    }
}

int percorrerGrafoPrivado(Grafo *g, Node *n, int *visitas)
{
    int resultado = 0;
    if(n)
    {
        Ligacao *l = g->lista[g->vertices]->comeco;
        if(!l)
        {
            Ligacao *aux = malloc(sizeof(Ligacao));
            aux->info = n->info;
            aux->prox = NULL;
            g->lista[g->vertices]->comeco = aux;
        }
        else
        {
            while(l->prox)
            {
                l = l->prox;
            }
            Ligacao *aux = malloc(sizeof(Ligacao));
            aux->info = n->info;
            aux->prox = NULL;
            l->prox = aux;
        }

        n->visitado = 1;
        n->timestamp[0] = (*visitas);
        (*visitas) = (*visitas) + 1;
        l = n->comeco;
        while(l != NULL)
        {
            if(g->lista[l->info]->visitado == 0)
            {
                if(percorrerGrafoPrivado(g, g->lista[l->info], visitas))
                {
                    resultado = 1;
                }
            }
            else if(g->lista[l->info]->visitado == 1)
            {
                resultado = 1;
            }
            l = l->prox;
        }
        n->visitado = 2;
        n->timestamp[1] = (*visitas);
        (*visitas) = (*visitas) + 1;
    }
    return resultado;
}

void exibirTimestamp(Grafo *g, Node *n)
{
    if(n)
    {
        printf("%d [%d,%d]\n", n->info + 1, n->timestamp[0], n->timestamp[1]);
        Ligacao *l = n->comeco;
        n->visitado = 0;
        while(l != NULL)
        {
            if(g->lista[l->info]->visitado == 1)
            {
                exibirTimestamp(g, g->lista[l->info]);
            }
            l = l->prox;
        }
    }
}

int verificarCiclo(Grafo *g, Node *n)
{
    int resultado = 0;
    if(n)
    { 
        if(n->visitado == 1)
        {
            //printf("%d [%d,%d]\n", n->info + 1, n->timestamp[0], n->timestamp[1]);
        }
        n->visitado = 0;
        Ligacao *l = n->comeco;
        while(l != NULL)
        {
            if(g->lista[l->info]->visitado == 1 || g->lista[l->info]->visitado == 2)
            {
                if(verificarCiclo(g, g->lista[l->info]))
                {
                    resultado = 1;
                }
            }
            else
            {
                resultado = 1;
            }
            l = l->prox;
        }
        n->visitado = 2;
    }
    return resultado;
}

void destruir(Grafo *g)
{
    for(int i = 0; i < g->vertices + 1; i = i + 1)
    {
        Ligacao *l = g->lista[i]->comeco;
        while(l)
        {
            Ligacao *aux = l;
            l = l->prox;
            free(aux);
        }
    }
    free(g->lista);
}
