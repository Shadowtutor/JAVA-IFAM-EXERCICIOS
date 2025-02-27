public class ex20 {
    public static void main (String[] args) {
        int nro_estudantes,soma,nota,notaslidas;
        double media;
        System.out.print("Numero de estudantes da turma: ");
        nro_estudantes=Integer.parseInt(System.console().readLine());
        soma=0;
        notaslidas=0;

        while(notaslidas<nro_estudantes) {
            System.out.printf("Nota %d:",notaslidas+1);
            nota=Integer.parseInt(System.console().readLine());
            soma = soma+nota;
            notaslidas=notaslidas+1;
        }

        media=(double)soma/nro_estudantes;
        System.out.printf("Media das notas = %1f\n",media);
    }
}
