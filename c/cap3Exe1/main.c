/*
* Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números. 
*/
#include <stdio.h>

int main(){
    int n1, n2, sub;

    scanf("%d", &n1);
    scanf("%d", &n2);

    sub = n1 - n2;

    printf("Sub = %d", sub);

    return 0;
}