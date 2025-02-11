/*Desenvolva um programa que leia quatro valores numéricos inteiros 
e mostre os valores que são divisíveis por 2 e 3. */

//Declarando o nome do programa e suas variáveis
public class ex14 {
    public static void main(String [] args){
        double n1,n2,n3,n4;

//Interassão entre sistema e usuario, sistema solicita valores e o usuario as dá, e teste do sistema:
            System.out.println("Digite o 1º numero: "); //sistema solicita valores para variavel n1
            n1 = Double.parseDouble(System.console().readLine()); //apos o usuario digitar o valor o sistema le e faz a conversão
                if (n1%2==0 && n1%3==0) { //condicional que verifica se o resto da divisao do valor dado é zero, tanto para /2 qt para /3
                    System.out.println(n1+" É divisivel por 2 e 3");//se for zero o sistema alerta dizendo que é divisivel
                }   else { //senão, o sistema alerta dizendo que não é divisivel
                    System.out.println("Não é divisivel por 2 e 3");
                }
            //o mesmo processo se repetirá em todos os numeros abaixo, claro que um loop ajudaria, mas ainda nao aprendi essa parte.
            System.out.println("Digite o 2º numero: ");
            n2 = Double.parseDouble(System.console().readLine());
                if (n2%2==0 && n2%3==0) {
                    System.out.println(n2+" É divisivel por 2 e 3");
                }   else {
                    System.out.println("Não é divisivel por 2 e 3");
                }
            
                System.out.println("Digite o 3º numero: ");
            n3 = Double.parseDouble(System.console().readLine());
                if (n3%2==0 && n3%3==0) {
                    System.out.println(n3+" É divisivel por 2 e 3");
                }  else {
                    System.out.println("Não é divisivel por 2 e 3");
                }
            
            System.out.println("Digite o 4º numero: ");
            n4 = Double.parseDouble(System.console().readLine());
                if (n4%2==0 && n4%3==0) {
                    System.out.println(n3+" É divisivel por 2 e 3");
                }  else {
                    System.out.println("Não é divisivel por 2 e 3");
                }
    }
}
