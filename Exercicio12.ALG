Algoritmo "Exercicio12"
// O custo ao consumidor de um carro novo � a soma do pre�o de f�brica
//com o percentual de lucro do distribuidor e dos impostos aplicados ao
//pre�o de f�brica. Fa�a um programa que receba o pre�o de f�brica de
//um ve�culo, o percentual de lucro do distribuidor e o percentual de
//impostos, calcule e mostre:
//a. o valor correspondente ao lucro do distribuidor;
//b. o valor correspondente aos impostos;
//c. o pre�o final do produto.
//
  
//Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
carro,lucroD,Imp,priceF: real


Inicio
escreval ("Valor do Carro na fabrica:")
leia(carro)
lucroD <- carro*0.2 //digamos que o lucro seja de 20%
Imp<- carro*0.2 //digamos que o imposto tamb�m seja de 20%
priceF<- carro + lucroD + Imp
escreval("O valor do lucro do distribuidor �: ", lucroD)
escreval("O governo gaiato quer um imposto de: ",Imp)
escreval("Com isso o trabalhador pagar� um total de:",priceF)


Fimalgoritmo