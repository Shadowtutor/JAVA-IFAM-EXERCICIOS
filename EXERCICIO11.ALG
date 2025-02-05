Algoritmo "Exercicio11"
//Faça um programa que receba o ano de nascimento de uma pessoa e o
//ano atual, calcule e mostre:
//a. a idade dessa pessoa em anos;
//b. a idade dessa pessoa em meses;
//c. a idade dessa pessoa em dias (considerando que cada ano
//possui 365 dias);
//d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).
//  

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
idade,anoN,anoA: inteiro


Inicio
escreval ("Quando você nasceu?")
leia(anoN)
escreval ("Qual ano atual?")
leia(anoA)
idade <- anoA - anoN
escreval ("Sua idade em anos é: ",idade)
escreval ("Sua idade em meses é:", idade*12)
escreval ("Sua idade em semanas é:",idade*52)
escreval ("Sua idade em dias é:", idade*365)


Fimalgoritmo