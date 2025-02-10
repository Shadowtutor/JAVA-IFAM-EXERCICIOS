public class ex7 {
    public static void main (String[] args) {
        double N1,N2,N3,N4,RES;
            System.out.print("informe a nota do 1º Bimestre:");
                N1=Double.parseDouble(System.console().readLine());
                    System.out.print("Informe a nota do 2º Bimestre:");
                N2=Double.parseDouble(System.console().readLine());
                    System.out.print("Informe a nota do 3º Bimestre:");
                N3=Double.parseDouble(System.console().readLine());
                    System.out.print("Informe a nota do 4º Bimestre:");
                N4=Double.parseDouble(System.console().readLine());
        
                RES = (N1+N2+N3+N4)/4;
                System.out.printf("Media das notas = %.1f\n", RES);
        
        if (RES>=7) {
            System.out.println("Aluno Aprovado");
                    System.out.println("Parabéns");
        } else {
            System.out.println("Aluno Reprovado");
            System.out.println("Você precisará repetir a matéria.");
        }

                    
        


    }
}
