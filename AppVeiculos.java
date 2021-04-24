import java.util.Scanner;

public class AppVeiculos {
    public static void main(String[] args) {
        GerenciarVeiculos veiculos = new GerenciarVeiculos();
        Scanner entrada = new Scanner (System.in);
        int menu;

        String modelo, marca, placa, tipoCombustivel;
        int anoFabricacao;
        double valorMercado;
            
        do {
            System.out.println("---------------------------------");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Remover carro");
            System.out.println("3 - Buscar por placa");
            System.out.println("4 - Listar veiculos");
            System.out.println("5 - Obter valor de impostos");
            System.out.println("6 - Listar veiculos por combustivel");
            System.out.println("7 - Sair");
            System.out.println("---------------------------------");
            menu = Integer.parseInt(entrada.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Infome o modelo:");
                    modelo = entrada.nextLine();
                    System.out.println("Informe a marca:");
                    marca = entrada.nextLine();
                    System.out.println("Informe o ano de fabricação:");
                    anoFabricacao = entrada.nextInt();
                    System.out.println("Informe o valor de mercado:");
                    valorMercado = entrada.nextDouble();
                    System.out.println("Informe a placa:");
                    placa = entrada.nextLine();
                    System.out.println("Informe o tipo de combustível:");
                    tipoCombustivel = entrada.nextLine();
                    break;
            
                    case 2:
                    System.out.println("Informe o carro a ser removido");
                    modelo = entrada.nextLine();
                    break;

                    case 3:
                    // AQUI BUSCA POR PLACA DE CARRO

                    case 4:
                    //AQUI MOSTRA TODOS OS MODELOS DE CARRO QUE ESTÃO CADASTRADOS NO SISTEMA
                    Veiculo.imprimir(modelo, marca, anoFabricacao, valorMercado, placa, tipoCombustivel);
                    
                    case 5:
                    //AQUI OBTEM O VALOR DE IMPOSTO

                    case 6: 
                    //AQUI LISTA OS VEICULOS POR COMBUSTIVEL

                    case 7:
                    //AQUI SAI DO PROGRAMA
                    break;
                    

                    default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
               }while (menu != 7);
        
         entrada.close();   
        }

}}
