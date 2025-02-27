public class ex21 {
    public static void main(String [] args) {
        int notaslidas,soma,nota;
        double media;
        soma=0;
        notaslidas=0;
        System.out.printf("Nota 1:");
        nota=Integer.parseInt(System.console().readLine());

            while(nota>=0) {
                soma=soma+nota;
                notaslidas=notaslidas+1;
                System.out.printf("Nota %d:", notaslidas+1);
                nota=Integer.parseInt(System.console().readLine());
            }
        media=(double)soma/notaslidas;
        System.out.printf("Media das notas = %.1f\n", media);

    }

}
