/*
* Faça um programa que receba três notas, calcule e mostre a média aritmética.
*/
#include <stdio.h>

int main(){
    int n1, n2, n3, mult;

    scanf("%d", &n1);
    scanf("%d", &n2);
    scanf("%d", &n3);

    mult = n1*n2*n3;

    printf("Mult = %d", mult);

    return 0;
}