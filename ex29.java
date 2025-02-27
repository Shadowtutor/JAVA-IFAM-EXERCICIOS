public class ex29 {
    public static void main(String[] args) {
        int numero;
        System.out.print("Informe um numero inteiro de 0 a 10:  ");
        numero = Integer.parseInt(System.console().readLine());
        switch (numero) {
            case 0:System.out.println("Zero");break;
            case 1:System.out.println("Um");break;
            case 2:System.out.println("Dois");break;
        
            default:System.out.println("Numero inválido!");
        }
    }
}
