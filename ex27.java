/*. Faça um programa que apresente os quadrados dos números inteiros de
15 a 200. */

public class ex27 {
   public static void main(String[] args){
    int x = 15;

    //Apresentando o programa:
    System.out.print("Este programa vai calcular os quadrados dos numeros inteiros de 15 a 200\n");

    while (x <= 200) {
        System.err.println("O quadrado de "+x+" é "+(x*x));
        x = x+1;

    }
   } 
}
