Algoritmo "Exercicio13"
//Faça um programa que receba o número de horas trabalhadas e o valor
//do salário mínimo, calcule e mostre o salário a receber seguindo estas
//regras:
//

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
horaT, salM, valorH, diasT: real


Inicio
escreval ("Quantas horas voce trabalha por dia?")
leia(horaT)
escreval ("Qual valor do salário minimo?")
leia(salM)
escreval ("Quantos dias voce trabalha por mes?")
leia (diasT)
escreval ("Olá, sua hora é equivalente á: ", salM/(horaT*diasT))
valorH <- salM/(horaT*diasT)
escreval ("Por dia voce ganha em média: ",valorH*horaT)


Fimalgoritmo