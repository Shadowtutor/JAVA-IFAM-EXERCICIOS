Algoritmo "Exercicio15"
//Faça um programa que receba uma temperatura em Celsius, calcule e
//mostre essa temperatura em Fahrenheit.Sabe-se que
//o simbolo do exercicio nao entra aqui no visual g, por isos vou transcrever
//a formula é 9xCelsio / 5 +32, entao basta receber o valor em celsius, multiplicar por 9
//dividir por 5 e logo apos acrescentar o 32
//também podemos simplificar e dividir o 9 por 5, que retornará 1,8
//vamos nessa.
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/02/2025
Var
cels, faren: real


Inicio
escreval ("Qual temperatura celsius:")
leia(cels)
faren <- cels * 1.8 + 32
escreval ("A temperatura em Fahrenheit é ", faren)


Fimalgoritmo