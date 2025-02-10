/*Faça um programa que leia dois valores
numericos inteiros e apresente o resultado
da diferença do maior valor pelo menor valor
Se os valores forem iguais, o programa deve
mostrar zero.
*/
public class ex10 { // torna a classe publica, serve para nomear o algoritmo
    public static void main(String[] args) { 
        double n1,n2,res;
            System.out.print("Valor do primeiro numero: ");
                n1 = Double.parseDouble(System.console().readLine());
            System.out.print("Valor do segundo numero: ");
                n2 = Double.parseDouble(System.console().readLine());
        if (n1 == n2) {
            System.out.println("A diferença entre os numeros é 0");
        } else if ( n1 > n2) {
            res = n1-n2;
            System.out.printf("A diferenca entre os dois numeros é: %.1f\n", res);
        } else if (n2 > n1) {
            res = n2-n1;
            System.out.printf("A diferenca entre os doi numeros é: %.1f\n ", res);
        }
    }
}
