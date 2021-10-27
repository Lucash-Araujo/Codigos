#include <stdlib.h>
#include "lista.h"

void inicializa( lista* l, int (*cmp)( lista_item i1, lista_item i2)) {
	// implementar
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
}

void retira(lista* l, lista_item item) {
	// implementar

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
}
