#include<stdio.h>
#include<math.h>

double f(double x);

double phi(double x);

int main()
{
    double a, b;
    //valores inicias da busca
    a = -2;
    b = 0;

    //epsilon
    double eps = 0.01;

    double x = (a + b) / 2;
    double ant = x;
    int k = 0;

    while(((phi(ant) - ant) >= eps || ((phi(ant) - ant) * -1) >= eps) && (f(x) >= eps || (f(x) * -1) >= eps))
    {
        ant = x;
        x = phi(x);
        printf("x = %.6lf phi(x) = %.6lf f(x) = %.6lf\n", x, phi(x), f(x));
        k = k + 1;
    }
    printf("x = %.6lf\nf(x) = %.6lf\nk = %d\n", x, f(x), k);

    return 0;
}

//funcao psi(x)
double phi(double x)
{
    return ((7/2) * pow(x, 3) + 3 * pow(x, 2) - 4)/5;
}

//funcao f(x)
double f(double x)
{
    return (7/2) * pow(x, 3) + 3 * pow(x, 2) -5 * x - 4;
}