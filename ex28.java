/*Para cada uma das mercadorias com que um armazém trabalha dispõese dos seguintes dados:
− o nome da mercadoria;
− o seu preço unitário;
− a quantidade total vendida no mês.
Elabore um programa para calcular o faturamento total mensal do armazém. O
faturamento total do armazém será calculado somando-se o total faturado por
cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
preço unitário. O número de mercadorias comercializadas pelo armazém deve
ser informado pelo usuário.
 */

 public class ex28 {
    public static void main(String [] args){
        double preco, qtdTotal, faturamentoTotal=0;
        int numMercadorias, contador = 0;
        String nome;

        System.out.println("Este programa calcula o faturamento mensal do armazem.");

        //Solicita ao usuário o número de mercadorias
        System.out.print("Digite o número de mercadorias comecializadas: ");
        numMercadorias = Integer.parseInt(System.console().readLine());

        //Loop para registrar os dados de cada mercadoria;

            while (contador < numMercadorias) {
                System.out.print("Digite o nome da mercadoria: ");
                nome = System.console().readLine();

                System.out.print("Digite o preço unitário de "+nome+":");
                preco=Double.parseDouble(System.console().readLine());

                System.out.print("Digite a quantidade total vendida de "+nome+": ");
                qtdTotal=Double.parseDouble(System.console().readLine());

        //Calcula o faturamento de mercadoria e soma ao faturamento total;
        faturamentoTotal += preco*qtdTotal;

        //Incremento do contador;
        contador++;

            }
        //Exibe o faturamento total do armazén;
        System.out.printf("O faturamento total do armazém foi de R$ %.2f\n", faturamentoTotal);
            
        }
}
