package classeobjeto.site;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	// Atributos
	int idCliente;
	String nome;
	String dataNasc;
	float desconto;
	int produtosComprados;

	//Listas de Compras e Produtos
	List<Carrinho> compras = new ArrayList<>();
	List<String> produtosAdq = new ArrayList<String>();

	// Construtor
	public Cliente(int idCliente, String nome, String dataNasc, float desconto) {
		// Atributos
		this.idCliente = idCliente;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.desconto = desconto;
	}

	// Adição de Compras
	void addCompras(Carrinho carrinho) {
		this.compras.add(carrinho);
	}

	// Lista de Compras
	int Compras() {
		int qtd = 0;
		for (Carrinho carrinho : this.compras) {
			for (Produto produto : carrinho.produtos) {
				qtd++;
			}
		}
		return qtd;
	}

	// Método com a Qtde Produtos Adquiridos
	int QtdeProdADQ(int produtosComprados) {
		return this.produtosComprados = produtosComprados;
	}

	// Impressão Dados do CLiente
	public void mostrarCliente() {
		System.out.println("----------------CLIENTE-----------------");
		System.out.println("-->> ID DO CLIENTE   : " + idCliente);
		System.out.println("-> NOME COMPLETO     : " + nome);
		System.out.println("-> DATA DE NASCIMENTO: " + dataNasc);
		System.out.println("-> DESCONTO ESPECIAL : " + desconto + " %");
		System.out.println("----------------------------------------");
	}

}
