int abb(struct no* raiz)
{
    if(raiz->esq)
    {
        if(raiz->data > raiz->esq->data && abb(raiz->esq))
        {
            no *aux = aux->esq;
            while (aux->dir)
            {
                aux = aux->dir;
            }
            if(raiz->data <= aux->data)
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    if(raiz->dir)
    {
        if(raiz->data < raiz->dir->data && abb(raiz->dir))
        {
            no *aux = aux->dir;
            while (aux->esq)
            {
                aux = aux->esq;
            }
            if(raiz->data >= aux->data)
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    return 1;
}