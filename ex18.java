/* Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. 
Escreva um programa que possa ser utilizado para efetuar o cálculo do salário reajustado de um funcionário, 
a partir do valor do salário informado pelo usuário. */


public class ex18 {
    public static void main(String[] args) {
        double salario;

            System.out.println("Qual seu salário: ");
                salario = Double.parseDouble(System.console().readLine());

                    if (salario < 5000) {
                        salario = salario + salario * 0.3;
                    }
            
            System.out.printf("Seu novo salário é : %.1f\n", salario);
    }    
}
