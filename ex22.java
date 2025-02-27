public class ex22 {
    public static void main(String[] args){
        int numero,valor,fatorial;
        

        System.out.print("Informe um numero inteiro:\n ");
        numero=Integer.parseInt(System.console().readLine());
        valor=2;
        fatorial=1;

            while(valor<=numero) {
                fatorial = fatorial*valor;
                valor=valor+1;
            }
        
        System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);

    }
}
