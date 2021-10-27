#include<stdio.h>
#include<stdlib.h>

/*
============
Alessandra de Lima Leria - 760884
============
*/

struct queueno_struct
{
    char dado;
    int peso;
    struct queueno_struct *filhoEsq;
    struct queueno_struct *filhoDir;
};
typedef struct queueno_struct no;

struct queue_struct
{
    int tamanho;
    no *prioridade[28];
};
typedef struct queue_struct queue;

void insereHeap(queue *q, no *n);

no* removeHeap(queue *q);

void fixUp(queue *q, int pos);

void fixDown(queue *q, int pos);

void swap(queue *q, int a, int b);

int contar(no *n, int dist);

int main()
{
    char frase;
    int frequencia[28] = {0};
    queue lista;
    lista.tamanho = 0;
    
    while(scanf("%c", &frase) != EOF) {
        /*for (int i = 0; frase[i] != '\0'; i++)
        {
            if(frase[i] == ' ')
            {
                frequencia[26] = frequencia[26] + 1;
            }
            else if(frase[i] == '\n')
            {
                frequencia[27] = frequencia[27] + 1;
            }

            frequencia[frase[i] - 'a'] = frequencia[frase[i] - 'a'] + 1;
            printf("%d, ", i);
        }*/
        if(frase == ' ')
            {
                frequencia[26] = frequencia[26] + 1;
            }
            else if(frase == '\n')
            {
                frequencia[27] = frequencia[27] + 1;
            }

            frequencia[frase - 'a'] = frequencia[frase - 'a'] + 1;
    }

    for (int i = 0; i < 28; i++)
    {
        if(frequencia[i] > 0)
        {
            no *novo = (no*)malloc(sizeof(no));
            novo->dado = 'a' + i;
            novo->peso = frequencia[i];
            novo->filhoDir = NULL;
            novo->filhoEsq = NULL;
            insereHeap(&lista, novo);
        }
    }
    while(lista.tamanho > 1)
    {
        no *aux1 = removeHeap(&lista);
        no *aux2 = removeHeap(&lista);
        no *novo = (no*)malloc(sizeof(no));
        novo->filhoDir = aux1;
        novo->filhoEsq = aux2;
        novo->peso = aux1->peso + aux2->peso;
        novo->dado = '\0';
        insereHeap(&lista, novo);
    }
    if(lista.tamanho > 0)
        printf("%d\n", contar(lista.prioridade[0], 0));

    return 0;
}

void insereHeap(queue *q, no *n)
{
    if(q->tamanho == 0)
    {
        q->prioridade[0] = n;
    }
    else
    {
        q->prioridade[q->tamanho] = n;
        fixUp(q, q->tamanho);
    }
    q->tamanho++;
}

no* removeHeap(queue *q)
{
    no *n = q->prioridade[0];

    q->prioridade[0] = q->prioridade[q->tamanho - 1];
    q->tamanho--;
    fixDown(q, 0);

    return n;
}

void fixUp(queue *q, int pos)
{
    if(pos == 0)
    {
        return;
    }
    int pai = 0;
    if(pos % 2 == 1)
    {
        pai = (pos - 1)/2;
    }
    else
    {
        pai = (pos - 2)/2;
    }
    if(q->prioridade[pai]->peso > q->prioridade[pos]->peso)
    {
        swap(q, pai, pos);
        fixUp(q, pai);
    }
}

void fixDown(queue *q, int pos)
{
    if(pos*2 + 1 >= q->tamanho)
    {
        return;
    }
    else if(pos*2 + 2 >= q->tamanho)
    {
        if(q->prioridade[pos]->peso > q->prioridade[pos*2 + 1]->peso)
        {
            swap(q, pos*2 + 1, pos);
            fixDown(q, pos*2 + 1);
        }
    }
    else
    {
        if(q->prioridade[pos*2 + 2]->peso < q->prioridade[pos*2 + 1]->peso)
        {
            if(q->prioridade[pos]->peso > q->prioridade[pos*2 + 2]->peso)
            {
                swap(q, pos*2 + 2, pos);
                fixDown(q, pos*2 + 2);
            }
        }
        else
        {
            if(q->prioridade[pos]->peso > q->prioridade[pos*2 + 1]->peso)
            {
                swap(q, pos*2 + 1, pos);
                fixDown(q, pos*2 + 1);
            }
        }
    }
}

void swap(queue *q, int a, int b)
{
    no *aux = q->prioridade[a];
    q->prioridade[a] = q->prioridade[b];
    q->prioridade[b] = aux;
}

int contar(no *n, int dist)
{
    if(!n)
        return 0;
    if(n->dado != '\0')
    {
        if(dist == 0)
            dist = 1;
        return n->peso * dist;
    }

    return contar(n->filhoEsq, dist + 1) + contar(n->filhoDir, dist + 1);
}

