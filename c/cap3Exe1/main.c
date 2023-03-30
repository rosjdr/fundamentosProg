#include <stdio.h>

int main(){
    int n1, n2, sub;

    printf("%s", "Informe o valor de n1: ");
    scanf("%d", &n1);
    printf("%s", "Informe o valor de n2: ");
    scanf("%d", &n2);

    sub = n1 - n2;

    printf("Resultado = %d", sub);

    return 0;
}