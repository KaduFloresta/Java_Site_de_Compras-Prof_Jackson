package classeobjeto.site;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    // Atributos
    String nome;
    Double valorProd;
    int qtde;

    List<Carrinho> listaCarrinho = new ArrayList<Carrinho>();

    // Formatando p/ 2 Casas Decimais nos Valor
    DecimalFormat formato = new DecimalFormat("0.00");

    // Construtor
    public Produto(String nome, Double valorProd, int qtde) {
        this.nome = nome;
        this.valorProd = valorProd;
        this.qtde = qtde;
    }

    // Método "Vender Produto"
    int vendas = 0;
    void venderProd() {
        vendas++;
    }

    // Impressão Dados do Produtos
    public void mostrarProd() {
        System.out.println("----------------PRODUTO----------------------------------------");
        System.out.println("-->> PRODUTO: " + nome);
        System.out.println("-> VALOR:  R$ " + formato.format(valorProd));
        System.out.println("-> QTDE :  " + qtde);
        System.out.println("--------------------------------------------------------------");
    }
}