#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n = 0;
    int *sequencia = malloc(1000000 * sizeof(int));
    scanf("%d", &n);
    for(int i = 0; i < n; i = i + 1)
    {
        scanf("%d", &sequencia[i]);
    }
    int maxSeq, maxSuf = 0;
    if(sequencia[0] < 0)
    {
        maxSeq = 0;
        maxSuf = 0;
    }
    else
    {
        maxSeq = sequencia[0];
        maxSuf = sequencia[0];
    }
    for(int i = 1; i < n; i = i + 1)
    {
        maxSuf = maxSuf + sequencia[i];
        if(maxSuf > maxSeq)
        {
            maxSeq = maxSuf;
        }
        else if(maxSuf < 0)
        {
            maxSuf = 0;
        }
    }
    printf("%d\n", maxSeq);
}