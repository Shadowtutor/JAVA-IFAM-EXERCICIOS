/*Faça um programa que leia um valor numérico inteiro. O programa deve
apresentar a mensagem “O valor está na faixa permitida”, caso o valor
informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
deve apresentar a mensagem “O valor está fora da faixa permitida”. */

public class ex11 {
    public static void main(String[] args) {
        double n1;

            System.out.println("Informe um numero: ");
                n1 = Double.parseDouble(System.console().readLine());
        if ( n1>0 && n1<=9 ) {
            System.out.printf("O valor está dentro da media.");
        } else { 
            System.out.println("Valor fora dos padrões! Reescreva um valor válido!");
        }
    }
}
