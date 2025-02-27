/*Crie um programa para ler a quantidade de litros de combustível e a
distância percorrida por um carro em várias viagens. O programa deve
calcular o consumo médio do carro, que é igual a média de quilômetros
por litro de todas as viagens. O número de viagens realizado deve ser
informado pelo usuário.
 */
public class ex26 {
    public static void main(String[] args) {
        double qtdLt,qtdDist,csmMedio,somaDist=0, somaLitros=0;
        int qtdViagem, contador=0;

        System.out.println("Esse programa calcula o consumo de uma rota industrial");
        

        //Solicita ao usuario o numero de viagens;
        System.out.print("Digite o numero de viagens realizadas: ");
        qtdViagem=Integer.parseInt(System.console().readLine());


        //Loop para registrar os dados de cada viagem;
            while (contador <qtdViagem) {
                System.out.print("Digite a distancia percorrida na "+ (contador+1) + "ª viagem:");
                qtdDist = Double.parseDouble(System.console().readLine());

                System.err.print("Digite a quantidade de litros consumido na" + (contador+1)+"ª viagem: ");
                qtdLt = Double.parseDouble(System.console().readLine());

                somaDist += qtdDist; //Soma todas as distancias;
                somaLitros +=qtdLt; //Soma todos os Litros;
                contador ++; //incrementa o contador de viagens
            }

            //Calcula o consumo medio (evita divisao por zero);
            if (somaLitros > 0) {
                csmMedio = somaDist / somaLitros;
                System.out.printf("O consumo médio do carro foi de %.2f km/l\n", csmMedio);
            } else {
                System.out.println("Erro: Nenhum litro de combustivel foi registrado.");
            }

    }    
}
