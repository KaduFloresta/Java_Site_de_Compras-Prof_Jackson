package classeobjeto.site;

import java.util.Scanner;
import java.text.ParseException;

public class Site {

	public static void main(String[] args) throws ParseException {
		System.out.println(":::SITE DE COMPRAS:::\n:::Kadu Floresta:::");
		// Entrada IdCliente/Case no Switch
		Scanner entrada = new Scanner(System.in); 

		// Lista com 5 Clientes
		// Inserindo Datas de Nacimento
		Cliente cliente1 = new Cliente(1, "Adriano Medeiros Sá", "21/01/1978", 10);
		Cliente cliente2 = new Cliente(2, "João Pedro Silva", "13/07/1945", 15);
		Cliente cliente3 = new Cliente(3, "Maria de Fátima Antunes", "02/11/2001", 20);
		Cliente cliente4 = new Cliente(4, "Letícia Eugenia Soares", "11/01/1988", 25);
		Cliente cliente5 = new Cliente(5, "Belmiro Schmmitt", "15/06/1995", 30);

		// Lista com 10 Produtos
		Produto produto1 = new Produto("iPhone 8 64GB Bco Apple", 3500.90, 1);
		Produto produto2 = new Produto("iPhone 10 256GB Black Apple", 7500.90, 1);
		Produto produto3 = new Produto("Batedeira Kichen_Aid Red", 4999.90, 1);
		Produto produto4 = new Produto("All-in-One HP 1TB i7", 3850.90, 1);
		Produto produto5 = new Produto("SmarTV 50'' 4K Samsung 3D", 8899.90, 1);
		Produto produto6 = new Produto("Mi Band Xiaomi 4", 250.00, 1);
		Produto produto7 = new Produto("Refrigerador Brastemp Inverse 542 Litros", 3949.90, 1);
		Produto produto8 = new Produto("Aparelho de Jantar 36pçs Oxford Flora", 349.90, 1);
		Produto produto9 = new Produto("Smart Watch Apple Silver", 2999.90, 1);
		Produto produto10 = new Produto("Xiaomi Mi9 128GB Blue", 1959.90, 1);

		// Menu - Criação do Switch para facilitar visualização!
		int idCliente = 0;
		Carrinho carrinho;

		do {
			System.out.println("\nInforme o ID do CLIENTE: ");
			idCliente = entrada.nextInt();
			switch (idCliente) {
			case 1:
				cliente1.mostrarCliente(); // Impressão CLIENTE "1"
				carrinho = new Carrinho(null, cliente1); // Compra
				carrinho.AdicProd(produto1); // Adicionando Filme
				carrinho.AdicProd(produto5); //        "
				carrinho.AdicProd(produto10);//        "
				produto1.mostrarProd(); // Produtos
				produto5.mostrarProd(); //    "
				produto10.mostrarProd();//    "
				System.out.println("-->> DATA DA COMPRA:      " + carrinho.dataCompra());
				System.out.println("-->> TOTAL DA COMPRA:     R$ " + carrinho.calcularPrecoFinal());
				System.out.println("-->> TOTAL COM DESCONTO:  R$ " + carrinho.totalDesconto());
				System.out.println("**************************************************************");
				break;
			case 2:
				cliente2.mostrarCliente();
				carrinho = new Carrinho(null, cliente2);
				carrinho.AdicProd(produto2);
				carrinho.AdicProd(produto2);
				carrinho.AdicProd(produto7);
				produto2.mostrarProd();
				produto2.mostrarProd();
				produto7.mostrarProd();
				System.out.println("-->> DATA DA COMPRA:      " + carrinho.dataCompra());
				System.out.println("-->> TOTAL DA COMPRA:     R$ " + carrinho.calcularPrecoFinal());
				System.out.println("-->> TOTAL COM DESCONTO:  R$ " + carrinho.totalDesconto());
				System.out.println("**************************************************************");
				break;
			case 3:
				cliente3.mostrarCliente();
				carrinho = new Carrinho(null, cliente3);
				carrinho.AdicProd(produto3);
				carrinho.AdicProd(produto6);
				carrinho.AdicProd(produto7);
				carrinho.AdicProd(produto8);
				produto3.mostrarProd();
				produto6.mostrarProd();
				produto7.mostrarProd();
				produto8.mostrarProd();
				System.out.println("-->> DATA DA COMPRA:      " + carrinho.dataCompra());
				System.out.println("-->> TOTAL DA COMPRA:     R$ " + carrinho.calcularPrecoFinal());
				System.out.println("-->> TOTAL COM DESCONTO:  R$ " + carrinho.totalDesconto());
				System.out.println("**************************************************************");
				break;
			case 4:
				cliente4.mostrarCliente();
				carrinho = new Carrinho(null, cliente4);
				carrinho.AdicProd(produto4);
				carrinho.AdicProd(produto6);
				produto4.mostrarProd();
				produto9.mostrarProd();
				System.out.println("-->> DATA DA COMPRA:      " + carrinho.dataCompra());
				System.out.println("-->> TOTAL DA COMPRA:     R$ " + carrinho.calcularPrecoFinal());
				System.out.println("-->> TOTAL COM DESCONTO:  R$ " + carrinho.totalDesconto());
				System.out.println("**************************************************************");
				break;
			case 5:
				cliente5.mostrarCliente();
				carrinho = new Carrinho(null, cliente5);
				carrinho.AdicProd(produto1);
				carrinho.AdicProd(produto5);
				carrinho.AdicProd(produto10);
				produto1.mostrarProd();
				produto5.mostrarProd();
				produto10.mostrarProd();
				System.out.println("-->> DATA DA COMPRA:      " + carrinho.dataCompra());
				System.out.println("-->> TOTAL DA COMPRA:     R$ " + carrinho.calcularPrecoFinal());
				System.out.println("-->> TOTAL COM DESCONTO:  R$ " + carrinho.totalDesconto());
				System.out.println("**************************************************************");
				break;
			}

		} while (idCliente <= 5);
		entrada.close();
	}
}