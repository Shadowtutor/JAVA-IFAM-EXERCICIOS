Algoritmo "Exercicio 6"
//Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as
//vendas (4% do valor das vendas efetuadas pelo funcion�rio). Fa�a um
//programa que receba o sal�rio fixo do funcion�rio e o valor de suas
//vendas, calcule e mostre a comiss�o e seu sal�rio fina

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
fixo, vendas, comis, totSal: real


Inicio
escreval ("Seu sal�rio fixo �: ")
leia (fixo)
escreval ("Quanto voc� conseguiu vender este mes?")
leia(vendas)
comis <- vendas /100 * 0.4
escreval ("Sua comiss�o total � R$",comis)
totSal  <- fixo + comis
escreval ("Seu pagamento este m�s ser� de R$:",totSal," reais")


Fimalgoritmo