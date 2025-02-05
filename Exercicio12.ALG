Algoritmo "Exercicio12"
// O custo ao consumidor de um carro novo é a soma do preço de fábrica
//com o percentual de lucro do distribuidor e dos impostos aplicados ao
//preço de fábrica. Faça um programa que receba o preço de fábrica de
//um veículo, o percentual de lucro do distribuidor e o percentual de
//impostos, calcule e mostre:
//a. o valor correspondente ao lucro do distribuidor;
//b. o valor correspondente aos impostos;
//c. o preço final do produto.
//
  
//Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
carro,lucroD,Imp,priceF: real


Inicio
escreval ("Valor do Carro na fabrica:")
leia(carro)
lucroD <- carro*0.2 //digamos que o lucro seja de 20%
Imp<- carro*0.2 //digamos que o imposto também seja de 20%
priceF<- carro + lucroD + Imp
escreval("O valor do lucro do distribuidor é: ", lucroD)
escreval("O governo gaiato quer um imposto de: ",Imp)
escreval("Com isso o trabalhador pagará um total de:",priceF)


Fimalgoritmo