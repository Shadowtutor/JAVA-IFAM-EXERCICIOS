Algoritmo "Exercicio14"
//Sabe-se que o quilowatt de energia custa um quinto do sal�rio m�nimo.
//Fa�a um programa que receba o valor do sal�rio m�nimo e a quantidade
//de quilowatts consumida por uma resid�ncia, calcule e mostre:
//a. o valor de cada quilowatt;
//b. o valor a ser pago por essa resid�ncia;
//c. o valor a ser pago com desconto de 15%.
Var
salM,consumo,qwat,valorP: real


Inicio
escreval ("Salario minimo atual: ")
leia (salM)
qwat <- salM/5
escreval ("Qts quilovates vc consumiu: ")
leia(consumo)
valorP <- consumo * qwat
escreval ("Voce pagar� :", valorP)
valorP <- valorP - valorP*0.15
escreval ("Como hoje eu sou o gerente voce recebera um desconto de 15% e pagar�: ", valorP)




Fimalgoritmo