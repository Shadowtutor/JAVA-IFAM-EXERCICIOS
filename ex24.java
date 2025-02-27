/*Faça um programa que calcule a soma de dez números quaisquer
fornecidos pelo usuário
*/
public class ex24 {
    public static void main(String[] args){
        double nx, soma;
        int contador;

        contador = 0;
        soma=0;

            while (contador<10) {
                System.out.println("Digite um numero: ");
                nx=Double.parseDouble(System.console().readLine());
                soma=soma+nx;
                contador = contador+1;
            }
        
        System.out.printf("Soma total:%.2f\n",soma);
    }

}
