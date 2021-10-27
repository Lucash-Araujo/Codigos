#include <stdio.h>
//#include <stdlib.h>
#include <string.h>

/*
============
Alessandra de Lima Leria - 760884
============
*/

typedef struct _bst 
{
    struct _bst* l;
    struct _bst* r;
    char* str;
} bst;

bst* get(bst* root, char* str) {
    // implementar iterativo! retornando NULL caso não encontre a str
    while(root != NULL)
    {
        int cmp = strcmp(root->str, str);
        if(cmp > 0)
            root = root->l;
        else if (cmp < 0)
            root = root->r;
        else
            return root;
    }
    return root;
}

bst* put(bst* root, char* str) {
    if(root) {
        int cmp = strcmp(root->str, str);
        if(cmp > 0)
            root->l = put(root->l,str);
        else if (cmp < 0)
            root->r = put(root->r,str);
        return root;
    } else {
        bst* novo = (bst*)malloc(sizeof(bst));
        novo->str = (char*)malloc(sizeof(char)*(strlen(str)+1));
        strcpy(novo->str,str);
        novo->l = novo->r = NULL;
        return novo;
    }
}

bst* max(bst* root) {
    if(root->r)
        return max(root->r);
    return root;
}

bst* min(bst* root) {
    if(root->l)
        return min(root->l);
    return root;
}

bst* rem(bst* root, char* str) {
    // implementar recursivo, não esqueça de remover o espaço da string!
    if(root) 
    {
        int cmp = strcmp(root->str, str);
        if(cmp > 0)
            root->l = rem(root->l,str);
        else if (cmp < 0)
            root->r = rem(root->r,str);
        else
        {
            bst *aux = NULL;
            if(root->l && root->r)
            {
                bst *aux2 = (bst*)malloc(sizeof(bst));
                
                aux = max(root->l);
                aux2->str = (char*)malloc(sizeof(char)*(strlen(aux->str)+1));
                strcpy(aux2->str, aux->str);
                aux2->r = root->r;
                aux2->l = rem(root->l, aux->str);
                aux = aux2;
            }
            else if(root->l)
            {
                aux = root->l;
            }
            else if(root->r)
            {
                aux = root->r;
            }
            free(root->str);
            free(root);
            root = aux;
        }
    }
    
    return root;
}

void del(bst* root) {
    if(root) {
        del(root->l);
        del(root->r);
        free(root->str);
        free(root);
    }
}

int main() {

    char comando[2], palavra[255];

    bst* raiz = NULL;

    while(scanf("%s", comando) != EOF) {
        scanf("%s", palavra);
        if( comando[0] == 'P' ) 
            raiz = put(raiz,palavra);
        else if( comando[0] == 'R' ) 
            raiz = rem(raiz,palavra);
        else if( comando[0] == 'G' ) {
            bst* result = get(raiz,palavra);
            if( result )
                printf("%s encontrada\n", result->str);
            else
                printf("%s nao foi encontrada\n", palavra);
        }
    }

    del(raiz);

    return 0;
}