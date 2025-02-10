public class ex9 {
    public static void main(String [] args){
        double n1,n2;
            System.out.print("Digite o 1º Numero:");
                n1=Double.parseDouble(System.console().readLine());
            System.out.print("Digite o 2º Número:");
                n2=Double.parseDouble(System.console().readLine());
        if (n1>n2) {
            System.out.printf("Maior número :%.1f\n",n1);
        } else if (n1<n2) {
            System.out.printf("Maior número :%.1f\n",n2);
        } else if (n1==n2) {
            System.out.printf("Os números são iguais");
        }

    }
    }

