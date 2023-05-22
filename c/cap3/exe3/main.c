/*
* Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

ALGORITMO
    DECLARE nota1, nota2, nota3, peso1, peso2, peso3 NUMÉRICO
        soma1, soma2, soma3, total, media NUMÉRICO
    LEIA nota1, nota2, nota3, peso1, peso2, peso3 
    soma1 ← nota1 * peso1
    soma2 ← nota2 * peso2 
    soma3 ← nota3 * peso3
    total ← peso1 + peso2 + peso3
    media ←(soma1 + soma2 + soma3)/total 
    ESCREVA media
FIM_ALGORITMO.

*/
#include <stdio.h>

int main(){
    float n1, n2, n3, p1, p2, p3, s1, s2, s3, total, media;

    printf("INFORME A NOTA 1: "); //forma de usar o printf menos seguro e não recomendada
    scanf("%f", &n1);
    printf("%s", "INFORME A NOTA 2: "); //forma recomendada de acordo com boas práticas e segurança na linguagem
    scanf("%f", &n2);
    printf("%s", "INFORME A NOTA 3: ");
    scanf("%f", &n3);

    printf("%s", "INFORME O PESO 1: "); 
    scanf("%f", &p1);
    printf("%s", "INFORME O PESO 2: "); //forma recomendada de acordo com boas práticas e segurança na linguagem
    scanf("%f", &p2);
    printf("%s", "INFORME O PESO 3: ");
    scanf("%f", &p3);

    s1 = n1 * p1;
    s2 = n2 * p2;
    s3 = n3 * p3;

    total = p1 + p2 + p3;
    media = (s1+s2+s3)/total;

    printf("MEDIA PONDERADA = %6.2f\n", media);

    return 0;
}