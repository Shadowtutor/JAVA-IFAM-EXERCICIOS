
public class ex19 {
    public static void main(String[] args) {
        double n1,n2,n3,media;
        char conceito;

            System.out.println("De 0 á 2 qual nota do trabalho: ");
                n1=Double.parseDouble(System.console().readLine());

            System.out.println("De 0 á 3 qual nota da prova semestral: ");
                n2=Double.parseDouble(System.console().readLine());

            System.out.println("De 0 á 5 qual nota da prova final: ");
                n3=Double.parseDouble(System.console().readLine());
            
                media = n1+n2+n3;
                conceito = 0;

                    if (media == 0) {
                        conceito='E'; 
                    } else if (media>5 && media<=6) {
                        conceito = 'D';
                    } else if (media>6 && media<=7) {
                        conceito = 'C';
                    } else if (media>7 && media<=8) {
                        conceito = 'B';
                    } else {
                        conceito = 'A';
                    }
            System.out.println("A média ponderada é: "+media+" e o conceito desse aluno é "+conceito);
        
    }       
}
