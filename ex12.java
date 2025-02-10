/*Construa um programa que leia três valores numéricos (representados
pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
quantas raízes reais a equação possui (delta < 0 – mostrar uma
mensagem dizendo que a equação não possui raízes reais, delta > 0 –
mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
uma única raiz real).*/
public class ex12 {
    public static void main( String[] args) {
        //Declarando as variaveis
        double a,b,c,delta;

        System.out.print("Informe o valor de A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o valor de b: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o valor de C: ");
        c= Double.parseDouble(System.console().readLine());

        //Calculando Delta
        delta = (b*b)-(4*a*c);

        //Verificando o numero de raízes;
        if (delta <0) {
            System.out.println("A equação não possui raízes reais");
        } else if (delta  == 0 ) {
            System.out.println("A equação possui uma unica raiz real.");
        } else {
            System.out.println("A equação possui duas raízes reais.");
        }
    }
}
