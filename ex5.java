public class ex5 {
    public static void main(String[] args) {
        double N1,N2,N3,N4,RES;
        System.out.print("Informe anota do primeiro bimestre:");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Informe anota do segundo bimestre:");
        N2 = Double.parseDouble(System.console().readLine());
        System.out.print("Informe anota do terceiro bimestre:");
        N3 = Double.parseDouble(System.console().readLine());
        System.out.print("Informe anota do quarto bimestre:");
        N4 = Double.parseDouble(System.console().readLine());
        RES = (N1+N2+N3+N4) / 4;
        System.out.printf("Media das notas=%.1f\n",RES);
    }
}
