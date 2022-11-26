
package Projetosemana6;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);
        int opcaoTemp = 0, opcaoMoeda = 0, opcaoMenu = 0;
        float temperaturaC, temperaturaF, cotacaoDolar, moedaReal, moedaDolar;
        char opcao;
        
        do {
            System.out.println("Menu Inicial do Conversor");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Converter Temperatura");
            System.out.println("2 - Converter Moeda");
            System.out.println("3 - Sair do Programa");
            opcaoMenu = leia.nextInt();
            System.out.print("\n");
            switch (opcaoMenu) {

                case 1: {
                    System.out.println("Qual conversão você deseja realizar?");
                    System.out.println("1 - Converter Celsius para Fahrenheit");
                    System.out.println("2 - Converter Fahrenheit para Celsius");
                    System.out.println("3 - Voltar ao Menu Inicial");
                    opcaoTemp = leia.nextInt();
                    System.out.print("\n");
                    switch (opcaoTemp) {
                        case 1:
                            System.out.println("Digite a temperatura em Celsius "
                                    + "a ser convertida");
                            temperaturaC = leia.nextFloat();
                            temperaturaF = temperaturaC * 1.8f + 32;
                            System.out.println(temperaturaC + "°C convertida para Fahrenheit é"
                                    + " " + temperaturaF + "°F");
                            System.out.print("\n");
                            break;

                        case 2:
                            System.out.println("Digite a temperatura em "
                                    + "Fahrenheit a ser convertida");
                            temperaturaF = leia.nextFloat();
                            temperaturaC = (temperaturaF - 32) / 1.8f;
                            System.out.println(temperaturaF + "°F convertida para Fahrenheit é"
                                    + " " + temperaturaC + "°C");
                            System.out.print("\n");
                            break;
                            
                        case 3: 
                            opcaoTemp = opcaoMenu;
                            System.out.print("\n");
                            break;
                            
                    }
                    
                }
                break;

                case 2: {
                    System.out.println("Qual conversao você deseja realizar?");
                    System.out.println("1 - Converter Reais para Dolar");
                    System.out.println("2 - Converter Dólar para Reais");
                    System.out.println("3 - Voltar ao Menu Inicial");
                    opcaoMoeda = leia.nextInt();
                    System.out.print("\n");
                    switch (opcaoMoeda) {
                        case 1:
                            System.out.println("Qual a cotação atual do Dólar?");
                            cotacaoDolar = leia.nextFloat();
                            System.out.println("Qual o valor em reais que você "
                                    + "deseja converter?");
                            moedaReal = leia.nextFloat();
                            moedaDolar = moedaReal / cotacaoDolar;
                            System.out.println("O valor convertido na cotação US$" 
                                    + cotacaoDolar + ",de R$" + moedaReal 
                                    + " fica US$ " + moedaDolar);
                            System.out.print("\n");
                            break;

                        case 2:
                            System.out.println("Qual a cotação atual do Dolar?");
                            cotacaoDolar = leia.nextFloat();
                            System.out.println("Qual o valor em Dolar que você "
                                    + "deseja converter?");
                            moedaDolar = leia.nextFloat();
                            moedaReal = moedaDolar * cotacaoDolar;
                            System.out.println("O valor convertido na cotação"
                                    + " US$" + cotacaoDolar + ",de US$" + moedaDolar 
                                    + " fica R$ " + moedaReal);
                            System.out.print("\n");
                            break;
                            
                        case 3: 
                            opcaoTemp = opcaoMenu;
                            System.out.print("\n");
                            break;

                    }break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
            } 

        } while(opcaoMenu != 3);
    }
}
        
        
    
    

