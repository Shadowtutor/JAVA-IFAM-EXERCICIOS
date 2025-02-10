public class ex8 {
      public static void main(String[] args) {
        char conceit;
            System.out.print("Conceito do Aluno: ");
            conceit = System.console().readLine().charAt(0);

        if(conceit !='A' && conceit!='B' && conceit !='C') {
            System.out.println("Conceito invalido");}

        else if (conceit == 'A' || conceit =='B') { 
            System.out.println("Aluno Aprovado");}

        else if(conceit == 'C') {
            System.out.println("Aluno Reprovado");}
        
        
      }
}
