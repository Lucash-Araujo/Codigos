#include <stdlib.h>
#include "avl.h"

/*
============
Alessandra de Lima Leria - 760884
============
*/

void inicializar( avl* arvore ) {
	arvore->raiz = 0;
}

void destruir_privado( node *p ) {
    if(p)
    {
        destruir_privado(p->esq);
        destruir_privado(p->dir);
        free(p);
    }
}

void destruir( avl* arvore ) {
    destruir_privado(arvore->raiz);
}

node* rotEE( node* A ) { 
       // implementar
	node* B = A->esq;
	A->esq = B->dir;
	B->dir = A;
	A->bal = 0;
	B->bal = 0;
	return B;
}

node* rotDD( node* A ) {
	    // implementar
	node* B = A->dir;
	A->dir = B->esq;
	B->esq = A;
	A->bal = 0;
	B->bal = 0;
	return B;
}

node* rotED( node* A ) {
	    // implementar
	node* B = A->esq;
	node* C = B->dir;
	A->esq = C->dir;
	B->dir = C->esq;
	C->esq = B;
	C->dir = A;

	if(C->bal == 1)
	{
		A->bal = 2;
		B->bal = 0;
		C->bal = 0;
	}
	else if(C->bal == 2)
	{
		A->bal = 0;
		B->bal = 1;
		C->bal = 0;
	}
	else
	{
		A->bal = 0;
		B->bal = 0;
	}
	return C;
}

node* rotDE( node* A ) {
	    // implementar
	node* B = A->dir;
	node* C = B->esq;
	A->dir = C->esq;
	B->esq = C->dir;
	C->esq = A;
	C->dir = B;

	if(C->bal == 2)
	{
		A->bal = 1;
		B->bal = 0;
		C->bal = 0;
	}
	else if(C->bal == 1)
	{
		A->bal = 0;
		B->bal = 2;
		C->bal = 0;
	}
	else
	{
		A->bal = 0;
		B->bal = 0;
	}
	return C;
}

node* inserir_privado( node* p, int data, int *mudouAltura) {
	
	if(!p) {
		node* novo = (node*)malloc(sizeof(node));
		novo->data = data;
		novo->bal = 0;
		novo->dir = novo->esq = 0;
		*mudouAltura = 1;
		return novo;
	}
    // implementar
	
	if(p->data > data)
	{
		p->esq = inserir_privado(p->esq, data, mudouAltura);
        if((*mudouAltura) == 1)
        {
            if(p->bal == 2)
            {
                p->bal = 0;
                *mudouAltura = 0;
            }
            else if(p->bal == 1)
            {
                if(p->esq->bal == 1)
                {
                    *mudouAltura = 0;
                    return rotEE(p);
                }
                else if(p->esq->bal == 2)
                {
                    *mudouAltura = 0;
                    return rotED(p);
                }
            }
            else
            {
                p->bal = 1;
            }
        }
	}
    else if(p->data < data)
	{
		p->dir = inserir_privado(p->dir, data, mudouAltura);
        if((*mudouAltura) == 1)
        {
            if(p->bal == 1)
            {
                p->bal = 0;
                *mudouAltura = 0;
            }
            else if(p->bal == 2)
            {
                if(p->dir->bal == 2)
                {
                    *mudouAltura = 0;
                    return rotDD(p);
                }
                else if(p->dir->bal == 1)
                {
                    *mudouAltura = 0;
                    return rotDE(p);
                }
            }
            else
            {
                p->bal = 2;
            }
        }
	}

	return p;
}


void inserir( avl* arvore, int data) {
	
	int mudouAltura = 0;
	
	arvore->raiz = inserir_privado( arvore->raiz, data, &mudouAltura );
}
    
node* teto_privado(node* p, int dado) {
    // implementar
    if(!p)
        return NULL;
    node* retorno = NULL;
    if(p->data > dado)
        retorno = teto_privado(p->esq, dado);
    else if(p->data < dado)
        retorno = teto_privado(p->dir, dado);
    
    if((retorno == NULL || p->data < retorno->data) && p->data >= dado )
        retorno = p;

    return retorno;
}

node* piso_privado(node* p, int dado) {
   // implementar
    if(!p)
        return NULL;

    node* retorno = NULL;
    if(p->data > dado)
        retorno = piso_privado(p->esq, dado);
    else if(p->data< dado)
        retorno = piso_privado(p->dir, dado);
    
    if((retorno == NULL || p->data > retorno->data) && p->data <= dado )
        retorno = p;

    return retorno;
}


int teto( avl* arvore, int dado, int *teto_dado ) {
    node* c = teto_privado(arvore->raiz, dado);
    if(c) {
        *teto_dado = c->data;
        return 1;
    }
    return 0;
}

int piso( avl* arvore, int dado, int *piso_dado ) {
    node* f = piso_privado(arvore->raiz, dado);
    if(f) {
        *piso_dado = f->data;
        return 1;
    }
    return 0;
}

