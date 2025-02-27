public class ex34 {
    public static void main(String[] args) {
        
        //Variáveis
        double n1,n2,soma;
        int acum;
        soma=0;

        //Inicializando o Loop que repetirá as instruções 10 vezes;
        for (acum=1; acum<=10; acum++) {
        System.out.println("\n"+acum+"º Teste Iniciando....\n"); //mensagem que avisa que o sistema está iniciando;

        System.out.print("Digite 1ºNum: "); //solicita o 1 numero
        n1=Double.parseDouble(System.console().readLine());
            
        System.out.print("Digite 2ºNum: "); //solicita o 2 numero
        n2=Double.parseDouble(System.console().readLine());    
        soma = n1+n2; //realiza a soma entre os numeros digitados
        System.out.println("\n"+acum+"º Teste, resultado é: "+soma+".\n"); // mostra o resultado
        }
    }
}
