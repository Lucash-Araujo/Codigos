#include <stdlib.h>
#include "lista.h"

void inicializa( lista* l, int (*cmp)( lista_item i1, lista_item i2)) {
	// implementar
	lista_no* sentinela = (lista_no*) malloc (sizeof (lista_no));
	sentinela->prox = sentinela;
	sentinela->ant = sentinela;
	l->sentinela = sentinela;
	l->compara = cmp;
	l->quantidade = 0;
}

void destroi(lista* l) {
	while(!vazia(l))
		retira(l, elemento(primeiro(l)));
	free(l->sentinela);
}

int vazia(lista* l) {
	return l->sentinela->prox == l->sentinela;
}

void insere(lista* l, lista_item item) {
	// implementar
	lista_iterador it = primeiro(l);
	while(l->compara(elemento(it), item) == -1 && !acabou(it))
		proximo(&it);
	lista_no* novo = (lista_no*)malloc(sizeof(lista_no));
	novo->item = item;
	novo->prox = it.p;
	novo->ant = it.p->ant;
	it.p->ant = novo;
	novo->ant->prox = novo;
	l->quantidade++;
}

void retira(lista* l, lista_item item) {
	// implementar
	lista_iterador it = primeiro(l);
	while(l->compara(elemento(it), item) != 0 && !acabou(it))
		proximo(&it);
	if (acabou(it))
		return;
	while(l->compara(elemento(it), item) == 0){
		it.p->ant->prox = it.p->prox;
		it.p->prox->ant = it.p->ant;
		lista_iterador aux = it;
        proximo(&aux);
        free(it.p);
        it = aux;
        l->quantidade--;
	}
}

lista_iterador primeiro(lista* l) {
	lista_iterador it;
	it.l = l;
	it.p = l->sentinela->prox;
	return it;
}

lista_iterador ultimo(lista* l) {
	lista_iterador it;
	it.l = l;
	it.p = l->sentinela->ant;
	return it;
}
lista_item elemento(lista_iterador i) {
	// implementar
	return i.p->item;
}

int proximo(lista_iterador* i) {
	if( !acabou(*i) ) {
		i->p = i->p->prox;
		return 1;
	}
	return 0;
}

int anterior(lista_iterador* i) {
	if( !acabou(*i) ) {
		i->p = i->p->ant;
		return 1;
	}
	return 0;
}

int acabou(lista_iterador i) {
	// implementar
	return i.p == i.l->sentinela;
}
