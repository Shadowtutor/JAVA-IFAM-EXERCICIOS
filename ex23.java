public class ex23 {
    public static void main(String[] args) {
        double x, fx;


        System.out.print("Valor de X: ");
        x=Double.parseDouble(System.console().readLine());

            while (x!=0) {
                fx=x*x -5*x+6;
                System.out.printf("F(x) = %.2f\n", fx);
                System.out.print("Valor de X: ");
                x= Double.parseDouble(System.console().readLine());

            }
    }
}
