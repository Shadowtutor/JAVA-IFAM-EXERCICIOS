Algoritmo "Exercicio13"
//Fa�a um programa que receba o n�mero de horas trabalhadas e o valor
//do sal�rio m�nimo, calcule e mostre o sal�rio a receber seguindo estas
//regras:
//

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
horaT, salM, valorH, diasT: real


Inicio
escreval ("Quantas horas voce trabalha por dia?")
leia(horaT)
escreval ("Qual valor do sal�rio minimo?")
leia(salM)
escreval ("Quantos dias voce trabalha por mes?")
leia (diasT)
escreval ("Ol�, sua hora � equivalente �: ", salM/(horaT*diasT))
valorH <- salM/(horaT*diasT)
escreval ("Por dia voce ganha em m�dia: ",valorH*horaT)


Fimalgoritmo