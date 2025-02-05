Algoritmo "Exercicio 5"
// Faça um programa que receba o salário base de um funcionário, calcule
//e mostre o salário a receber, sabendo-se que o funcionário tem
//gratificação de 5% sobre o salário base (que será acrescentado ao
//salário) e paga imposto de 7% sobre este salário (o que será
//descontado do salário).

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
salario, acresc, descont: real


Inicio
escreval ("Voce estuda tanto para ganhar quanto?")
leia (salario)
acresc <- salario + salario * 0.05
descont <- acresc - acresc * 0.07
escreval ("Voce receberá oque deseja mais um acrescimo de 5% totalizando: ", acresc)
escreval ("Mas também precisará contribuir com o governo com 7%,com isso seu salario final será: ", descont)


Fimalgoritmo