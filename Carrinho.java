package classeobjeto.site;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat;

public class Carrinho {
	// Atributos
	String dataCompra;
	Cliente cliente;
	float totalCompras = 0;
	float totalDesconto = 0;

	// Lista e Formato Decimal
	DecimalFormat formato = new DecimalFormat("0.00");
	List<Produto> produtos = new ArrayList<>();
	Calendar data = Calendar.getInstance();

	// Construtor
	Carrinho(String dataCompra, Cliente cliente) {
		this.dataCompra = dataCompra;
		this.cliente = cliente;

		this.cliente.addCompras(this);
	}

	// Calculo Preço Total
	String calcularPrecoFinal() {
		for (Produto produto : produtos) {
			totalCompras += produto.valorProd * produto.qtde;
		}
		// Retorno do Valor Total com 2 Casas Decimais
		return formato.format(totalCompras);
	}

	// Calculo do Valor Total com Desconto
	String totalDesconto() {
		totalDesconto = totalCompras - (totalCompras * (cliente.desconto / 100));
		return this.formato.format(totalDesconto);
	}

	// Adição de Produtos
	void AdicProd(Produto produto) {
		this.produtos.add(produto);
	}

	// Data da Compra
	String dataCompra() {
		Date dataAtual = new Date();
		data.setTime(dataAtual);

		// Formatando a impressão da data "SHORT"
		DateFormat dataEdit = DateFormat.getDateInstance(DateFormat.SHORT);

		return dataEdit.format(data.getTime());
	}
}