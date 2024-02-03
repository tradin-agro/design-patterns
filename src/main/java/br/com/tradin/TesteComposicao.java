package br.com.tradin;

import br.com.tradin.loja.orcamento.ItemOrcamento;
import br.com.tradin.loja.orcamento.Orcamento;
import br.com.tradin.loja.orcamento.OrcamentoProxy;

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

        // Pattern Proxy - colocar em cache o mesmo valor para não realizar consulta novamente
        // intercepta chamada ao objeto original, melhorando performance e podem ser adicionadas verificações de segurança
        // sleep foi colocada no getValor da classe Orcamento para testar o tempo.
        // Orcamento Proxy faz a ponte e devolve o valor na segunda consulta diretamente da memória
        // sem executar a consulta efetivamente. Isso é bom para consutlar valores inalterados após
        // uma primeira consulta externa (algo gerenciado por terceiros)
        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor()); // 700
        System.out.println(proxy.getValor()); // 700
        System.out.println(proxy.getValor()); // 700
        System.out.println(proxy.getValor()); // 700
        System.out.println(proxy.getValor()); // 700
        System.out.println(proxy.getValor()); // 700
        System.out.println(novo.getQuantidadeItens()); // 2

    }

}
