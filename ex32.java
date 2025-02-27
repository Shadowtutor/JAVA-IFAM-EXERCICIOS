/*Escreva um algoritmo (utilizando escolha) e um programa em Java
(utilizando switch) que leiam três números inteiros que representam uma data
com dia, mês e ano respectivamente. O programa deve escrever esta data da
seguinte forma: dia de nome do mês de ano */
public class ex32 {
 public static void main(String [] args) {
    //Variáveis:
    int dia,mes,ano;
    String nomeMes;
    

    //Entrada e processamento de dados:
    System.out.println("Dia: ");
    dia = Integer.parseInt(System.console().readLine());
    
    System.out.println("Mes: ");
    mes = Integer.parseInt(System.console().readLine());

    
    System.out.println("Ano: ");
    ano = Integer.parseInt(System.console().readLine());
    

    //Estrutura de repetição Caso
    switch (mes) {
    case 1: 
        nomeMes= "Janeiro"; 
            break;
    case 2: 
        nomeMes="Fevereiro"; 
            break;
    case 3: 
        nomeMes="Março"; 
            break;
    case 4: 
        nomeMes="Abril";
            break;
    case 5: 
        nomeMes="Maio"; 
            break;
    case 6: 
        nomeMes="Junho"; 
            break;
    case 7: 
        nomeMes="Julho"; 
            break;
    case 8:
        nomeMes="Agosto"; 
            break;
    case 9: 
        nomeMes="Setembro"; 
            break;
    case 10:
        nomeMes="Outubro"; 
            break;
    case 11:
        nomeMes="Novembro"; 
            break;
    case 12:
        nomeMes="Dezembro"; 
            break;
        

    default:
        nomeMes="Mes invalido";
}
    //Condicional, caso o usuario tenha digitado um valor diferente ao resultado default;
    if (nomeMes.equals("Mes invalido")) {
        System.out.println("ERRO! Mês inválido!"); 
    } else{
        System.out.println("Você digitou a data: "+dia+" de "+nomeMes+" de "+ano);
    }    
    }

 }

