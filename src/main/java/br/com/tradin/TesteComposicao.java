package br.com.tradin;

import br.com.tradin.loja.orcamento.ItemOrcamento;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {


        // Pattern Composite - compor um objeto com outro, em árvore
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor()); // 700
        System.out.println(novo.getQuantidadeItens()); // 2

    }

}
