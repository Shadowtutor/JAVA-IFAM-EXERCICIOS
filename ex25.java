/*Crie um programa Java para exibir os quadrados de números digitados
pelo usuário, até que ele digite um número negativo*/

public class ex25 {
    public static void main(String[] args) {
        double nx,quad;
        quad = 0;
        nx=0;
            while (nx>=0) {
                System.out.println("\nDigite um numero: \n");
                nx=Double.parseDouble(System.console().readLine());
                quad = nx*nx;
                System.err.printf(" %.1f Ao quadrado é: %.1f \n ", nx,quad);
                
                if (nx < 0) {
                    System.out.println("Programa encerrado.");
                    }
            }

    }
}
