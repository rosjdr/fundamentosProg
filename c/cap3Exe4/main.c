/*
* Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

ALGORITMO
    DECLARE sal, novosal NUMÉRICO 
    LEIA sal
    novosal ← sal + sal * 25/100
    ESCREVA novosal
FIM_ALGORITMO.


*/
#include <stdio.h>

int main(){
    float salario, novoSalario;

    printf("%s", "INFORME O SALARIO DO FUNCIONÁRIO: ");
    scanf("%f", &salario);

    novoSalario = salario * 1.25;
    printf("NOVO SALARIO = %6.2f", novoSalario);

    return 0;
}