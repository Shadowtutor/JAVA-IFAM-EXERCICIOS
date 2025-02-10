/*Construa um programa que leia três valores para os lados de um
triângulo (A, B e C). O programa deve verificar se os lados fornecidos
formam realmente um triângulo. Em caso positivo, deve mostrar a
mensagem “Os lados formam um triângulo” e caso contrário “Os valores
informados não podem formar um triângulo”. Para que três valores de
lados formem um triângulo, cada par de lados somados não pode ser
menor ou igual ao terceiro lado.*/
public class ex13 {
    public static void main (String[] args) {
        double l1,l2,l3;
            System.out.print("Informe o valor do 1º lado: ");
            l1 = Double.parseDouble(System.console().readLine()); 
        do {   
            System.out.print("Repita o valor digitado em Lado 1 abaixo: ");
            l2 = Double.parseDouble(System.console().readLine());
        if ( l2 != l1) {
            System.out.println("Erro");
        } 
    } while (l2!=l1);
            System.out.print("Informe o valor do 3º Lado: ");
            l3 = Double.parseDouble(System.console().readLine());

        do {
        if (l3 < l2 && l3 < l1 ) {
            System.out.println("Erro! Digite um valor que seja maior que os valores de l1 e l2");
        }
    } while (l3 <l2 && l3<l1);
        
        System.out.println("Valores fornecidos são:" + l1 + "+" + l2 + "+" + l3);
    }

}
