Algoritmo "Exercicio7"
//. Faça um programa que receba três notas e seus respectivos pesos,
//calcule e mostre a média ponderada dessas notas. Para calcular a
//média ponderada, multiplique cada nota por seus respectivos pesos,
//some todos os resultados e divida pela soma dos pesos. Por exemplo,
//se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
//estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.


//basicamente preciso gerar 3 notas, multiplica cada uma delas por 3 pesos(1,2,3)
//e depois dividir elas pela soma de todos os pesos, e entao adquirir a media..
// Autor(a)    : Gilvan Daniel da Silva
// Data atual  : 04/02/2025
Var
n1,n2,n3,SomaN: real
p1,p2,p3,SomaP: inteiro
mp1,mp2,mp3,mpF:real

Inicio
p1<-1
p2<-2
p3<-3
escreval("Digite o valor da 1ª nota: ")
   leia (n1)
     mp1 <- n1*p1
      escreval("Essa nota tem peso 1 logo seu valor é igual á:", mp1)

escreval("Digite o valor da 2ª nota: ")
   leia (n2)
     mp2 <- n2*p2
      escreval("Essa nota tem peso 2 logo seu valor é igual á:", mp2)
      
escreval("Digite o valor da 3ª nota: ")
    leia (n3)
     mp3 <- n3*p3
      escreval("Essa nota tem peso 3 logo seu valor é igual á:", mp3)
SomaP <- p1+p2+p3
SomaN <- mp1+mp2+mp3
mpF <- SomaN/SomaP
escreval ("")
escreval ("A soma das notas multiplicadas por seus respectivos pesos e dividia pela soma destes pesos é: ",mpF)



Fimalgoritmo