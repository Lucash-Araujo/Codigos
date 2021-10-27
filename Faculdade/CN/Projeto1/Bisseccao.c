#include <stdio.h>
#include <math.h>

double f(double x);

int main()
{
    double a, b;
    //valores inicias da busca
    a = 5;
    b = 6;

    //epsilon
    double epsilon = 0.000001;

    int k = 0;

    double x = (a + b) / 2;
    while((b - a) >= epsilon)
    {
        if(f(a)*f(x) > 0)
        {
            a = x;
        }
        else
        {
            b = x;
        }
        x = (a + b) / 2;
        k = k + 1;
    }
    
    printf("x = %.12f\nf(x) = %.12f\nk = %d\n", x, f(x), k);

    return 0;
}

//funcao f(x)
double f(double x)
{
    return x * sin(x) + 3;
}