#include <stdio.h>
#include <stdlib.h>

int main()
{
    int flag = 0;
    int piscina1[5000];
    int piscina2[5000];
    int n;
    long int m;
    scanf("%d %ld", &n, &m);
    for(int i = 0; i < n; i = i + 1)
    {
        scanf("%d", &piscina1[i]);
    }
    for(int i = 0; i < n; i = i + 1)
    {
        scanf("%d", &piscina2[i]);
    }

    for (int i = 1; i < n; i++)
    {
        int c = i;
        while (c != 0)
        {
            int raiz = (c - 1) / 2;
            if (piscina2[raiz] < piscina2[c])
            {
                int aux = piscina2[raiz];
                piscina2[raiz] = piscina2[c];
                piscina2[c] = aux;
            }
            c = raiz;
        }
    }

    for (int i = n - 1; i >= 0; i--)
    {
        int aux = piscina2[0];
        piscina2[0] = piscina2[i];
        piscina2[i] = aux;
        int raiz = 0;
        int c = i - 1;
        while (c < i)
        {
            c = 2 * raiz + 1;
            if (c < i - 1 && piscina2[c] < piscina2[c + 1])
                c++;
            if (c < i && piscina2[raiz] < piscina2[c])
            {
                aux = piscina2[raiz];
                piscina2[raiz] = piscina2[c];
                piscina2[c] = aux;
            }
            raiz = c;
        }
    }
    //printf("%d, ", piscina2[2]);

    for(int i = 0; i < n && !flag; i = i + 1)
    {
        //printf("i = %d, piscina1[%d] = %d, m %% piscina1[%d] = %d\n", i, i, piscina1[i], i, m%piscina1[i]);
        if(piscina1[i] != 0 && m % piscina1[i] == 0)
        {
            long int encontrar = m / piscina1[i];
            int com = 0;
            int fim = n - 1;
            while(com <= fim && !flag)
            {
                int meio = (com + fim) / 2;
                
                if(piscina2[meio] > encontrar)
                {
                    fim = meio - 1;
                }
                else if(piscina2[meio] < encontrar)
                {
                    com = meio + 1;
                }
                else
                {
                    flag = piscina2[meio];
                }
            }
        }
    }

    if(flag)
        printf("SIM\n");
    else
        printf("NAO\n");
}