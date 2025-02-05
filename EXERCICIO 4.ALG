Algoritmo "Exercicio 4"
// Faça um programa que receba o preço de um produto, calcule e mostre
//o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
//exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
//10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
//novo preço R$ 90,00.

// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
result, price : real


Inicio
escreval ("Valor de um televisor 50' é : ")
leia (price)
result <- price - price * 0.10
escreval ("Como voce está levando usando pagamento á vista, o valor final será: ",result)


Fimalgoritmo