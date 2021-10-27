#include <stdio.h>

int main()
{
    int total = 0;
    int nivelAtual = 56300;
    int aumento = 500;
    for(int i = 0; i < 200; i++)
    {
        total = total + nivelAtual;
        nivelAtual = nivelAtual + aumento;
    }
    printf("%d\n", total);
    return 0;
}