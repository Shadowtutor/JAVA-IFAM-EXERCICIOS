/* Desenvolva um programa que leia três valores numéricos inteiros, 
identifique e apresente o maior valor informado.*/
public class ex16 {
    public static void main (String[] args) {
        double n1,n2,n3, maior;

            System.out.println("Digite o 1º numero: ");
                n1=Double.parseDouble(System.console().readLine());
            System.out.println("Digite o 2º numero: ");
                n2=Double.parseDouble(System.console().readLine());
            System.out.println("Digite o 3º numero: ");
                n3=Double.parseDouble(System.console().readLine());
            
                maior = n1;

            if (n2>maior) {
                maior=n2;
            }
            if (n3>maior) {
                maior = n3;
            }
           
            System.out.println(maior + " Será o valor atribuido á variavel MAIOR, por ser o valor mais alto, dentre os numeros digitados.");
    }
}
