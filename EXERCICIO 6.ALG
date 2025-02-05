Algoritmo "Exercicio 6"
//Um funcionário recebe um salário fixo mais 4% de comissão sobre as
//vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
//programa que receba o salário fixo do funcionário e o valor de suas
//vendas, calcule e mostre a comissão e seu salário fina

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
fixo, vendas, comis, totSal: real


Inicio
escreval ("Seu salário fixo é: ")
leia (fixo)
escreval ("Quanto você conseguiu vender este mes?")
leia(vendas)
comis <- vendas /100 * 0.4
escreval ("Sua comissão total é R$",comis)
totSal  <- fixo + comis
escreval ("Seu pagamento este mês será de R$:",totSal," reais")


Fimalgoritmo