Algoritmo "Exercicio 5"
// Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule
//e mostre o sal�rio a receber, sabendo-se que o funcion�rio tem
//gratifica��o de 5% sobre o sal�rio base (que ser� acrescentado ao
//sal�rio) e paga imposto de 7% sobre este sal�rio (o que ser�
//descontado do sal�rio).

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
salario, acresc, descont: real


Inicio
escreval ("Voce estuda tanto para ganhar quanto?")
leia (salario)
acresc <- salario + salario * 0.05
descont <- acresc - acresc * 0.07
escreval ("Voce receber� oque deseja mais um acrescimo de 5% totalizando: ", acresc)
escreval ("Mas tamb�m precisar� contribuir com o governo com 7%,com isso seu salario final ser�: ", descont)


Fimalgoritmo