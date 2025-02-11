/* Desenvolva um programa que leia três valores numéricos inteiros, 
identifique e apresente o menor valor informado.*/
public class ex17 {
    public static void main (String[] args) {
        double n1,n2,n3, menor;

            System.out.println("Digite o 1º numero: ");
                n1=Double.parseDouble(System.console().readLine());
            System.out.println("Digite o 2º numero: ");
                n2=Double.parseDouble(System.console().readLine());
            System.out.println("Digite o 3º numero: ");
                n3=Double.parseDouble(System.console().readLine());
            
                menor = n1;

            if (n2<menor) {
                menor=n2;
            }
            if (n3<menor) {
                menor = n3;
            }
           
            System.out.println(menor + " Será o valor atribuido á variavel MENOR, por ser o valor mais baixo, dentre os numeros digitados.");
    }
}
