#include <stdio.h>

int main()
{
    int cont = 0;
    int a = 89;
    int b = 119;
    while (a < 1501 || b < 1051)
    {
        if(a > 1000 && a < 1500)
            cont++;
        if(b > 1000 && b < 1500)
            cont++;
            
        b = b + 8;
        a = a + 7;
    }
    printf("%d", cont);
    return 0;
}