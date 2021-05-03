package application;

import java.util.Scanner;

import entities.GerenciarVeiculos;
import entities.Veiculo;

public class AppVeiculo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		GerenciarVeiculos gv = new GerenciarVeiculos();

		boolean resposta = true;
		int menu;

		while (resposta == true) {

			System.out.println("-----------------------------------------");
			System.out.println("   SISTEMA DE GERENCIAMENTO DE VEÍCULO");
			System.out.println("-----------------------------------------");
			System.out.println("	O QUE DESEJA FAZER?	   		 ");
			System.out.println();
			System.out.println("| 1 - Adicionar carro");
			System.out.println("| 2 - Remover carro");
			System.out.println("| 3 - Buscar por placa");
			System.out.println("| 4 - Listar veiculos");
			System.out.println("| 5 - Obter valor de impostos");
			System.out.println("| 6 - Listar veiculos por combustivel");
			System.out.println("| 7 - Sair");
		

			menu = entrada.nextInt();
			entrada.nextLine();

			switch (menu) {
			case 1:
				System.out.print("Informe o modelo: ");
				String modelo = entrada.nextLine();
				System.out.print("Informe a marca: ");
				String marca = entrada.nextLine();
				System.out.print("Informe o ano de fabricação: ");
				int anoFabricacao = entrada.nextInt();
				entrada.nextLine();
				System.out.print("Informe o valor de mercado: ");
				double valorMercado = entrada.nextDouble();
				entrada.nextLine();
				System.out.print("Informe a placa (ABC1234): ");
				String placa = entrada.nextLine();
				System.out.print("Informe o tipo de combustível (álcool, gasolina, flex, GNV, diesel): ");
				String tipoCombustivel = entrada.nextLine();
				gv.adicionar(new Veiculo(modelo, marca, anoFabricacao, valorMercado, placa, tipoCombustivel));
				System.out.println("Veículo adicionado.");
				break;
			case 2:
				System.out.print("Informe a placa do carro a ser removido: ");
				placa = entrada.nextLine();
				System.out.println(gv.remover(placa));
				break;
			case 3:
				System.out.print("Informe a placa do carro a ser pesquisado: ");
				placa = entrada.nextLine();
				Veiculo v = gv.buscarPorPlaca(placa);
				if (v != null) {
					System.out.println(v.imprimir());
				} else {
					System.out.println("Veículo não encontrado.");
				}
				break;
			case 4:
				System.out.println(gv.listarVeiculos());
				break;
			case 5:
				System.out.print("Informe a placa do carro: ");
				placa = entrada.nextLine();
				System.out.printf("Imposto: R$ %.2f\n", gv.obterValorImposto(placa));
				break;
			case 6:
				System.out.print("Informe o combustível do carro (álcool, gasolina, flex, GNV, diesel): ");
				tipoCombustivel = entrada.nextLine();
				System.out.println(gv.listarVeiculoPorCombustivel(tipoCombustivel));
				break;
			case 7:
				System.out.println("Programa encerrado.");
				resposta = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

		entrada.close();
	}
}
