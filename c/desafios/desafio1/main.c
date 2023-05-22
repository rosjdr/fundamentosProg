#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
    float comprimento;
    float alturaHaste;
    float meioPonte;
    float alturaCabo1, alturaCabo2, alturaCabo3, alturaCabo4, alturaCabo5;
    float baseCabo1, baseCabo2, baseCabo3, baseCabo4, baseCabo5;
    float cabo1, cabo2, cabo3, cabo4, cabo5;
    float totalCabos;

    //ler o comprimento da ponte
    printf("INFORME O COMPRIMENTO DA PONTE: ");
    scanf("%f", &comprimento);

    //verificar se o comprimento da ponte é válido de acordo com o enunciado do trabalho
    if(comprimento < 2 || comprimento > 4){
        printf("ERRO: O COMPRIMENTO DA PONTE DEVE SER MAIOR OU IGUAL A 2 E MENOR OU IGUAL A 4!");
    } else { //calcular a quantidade de cabos
        alturaHaste = comprimento/20; //calcular a altura das hastes de sustentação
        meioPonte = comprimento/2; //calcular o meio da ponte

        //calcular a altura de cada cabo em sua haste de sustentação
        alturaCabo1 = alturaHaste;
        alturaCabo2 = alturaHaste-(alturaHaste/5);
        alturaCabo3 = alturaHaste-((alturaHaste/5)*2);
        alturaCabo4 = alturaHaste-((alturaHaste/5)*3);
        alturaCabo5 = alturaHaste-((alturaHaste/5)*4);

        printf("ALTURA DOS CABOS: \tC1:%.2fkm\tC2:%.2fkm\tC3:%.2fkm\tC4:%.2fkm\tC5:%.2fkm\n",
               alturaCabo1,
               alturaCabo2,
               alturaCabo3,
               alturaCabo4,
               alturaCabo5);

        //calcular o local da base onde os cabos serão fixados
        baseCabo1 = meioPonte;
        baseCabo2 = meioPonte-(meioPonte/5);
        baseCabo3 = meioPonte-((meioPonte/5)*2);
        baseCabo4 = meioPonte-((meioPonte/5)*3);
        baseCabo5 = meioPonte-((meioPonte/5)*4);

        printf("BASE DOS CABOS: \tC1:%.2fkm\tC2:%.2fkm\tC3:%.2fkm\tC4:%.2fkm\tC5:%.2fkm\n",
               baseCabo1,
               baseCabo2,
               baseCabo3,
               baseCabo4,
               baseCabo5);

        //calcular o comprimento de cada cabo usando a fórmula da hipotenusa
        cabo1 = sqrt(pow(baseCabo1,2.0) + pow(alturaCabo1,2.0));
        cabo2 = sqrt(pow(baseCabo2,2.0) + pow(alturaCabo2,2.0));
        cabo3 = sqrt(pow(baseCabo3,2.0) + pow(alturaCabo3,2.0));
        cabo4 = sqrt(pow(baseCabo4,2.0) + pow(alturaCabo4,2.0));
        cabo5 = sqrt(pow(baseCabo5,2.0) + pow(alturaCabo5,2.0));

        printf("COMPRIMENTO DOS CABOS: \tC1:%.2fkm\tC2:%.2fkm\tC3:%.2fkm\tC4:%.2fkm\tC5:%.2fkm\n",
               cabo1,
               cabo2,
               cabo3,
               cabo4,
               cabo5);

        //calcular o total de cabos usado em cada haste e multiplicar por 4 hastes
        totalCabos = (cabo1+cabo2+cabo3+cabo4+cabo5)*4;

        printf("TOTAL DE CABOS: %.2fkm\n", totalCabos);
    }
    return 0;
}
