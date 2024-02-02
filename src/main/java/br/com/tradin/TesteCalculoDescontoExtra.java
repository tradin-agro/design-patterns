package br.com.tradin;

import br.com.tradin.loja.desconto.CalculadoraDeDescontos;
import br.com.tradin.loja.orcamento.Orcamento;
import br.com.tradin.loja.orcamento.situacao.Aprovado;
import br.com.tradin.loja.orcamento.situacao.EmAnalise;

import java.math.BigDecimal;

public class TesteCalculoDescontoExtra {

    public static void main(String[] args) {
        // Pattern State - quando temos um objeto que deve se comportar de maneira diferente dependendo
        // do seu estado (neste caso Situação), podemos delegar a chamada do método para uma
        // classe específica do estado atual.
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 6);
        primeiro.setSituacaoOrcamento(new EmAnalise()); // 5% de desconto extra
        Orcamento segundo = new Orcamento(new BigDecimal("2000"), 1);
        primeiro.setSituacaoOrcamento(new Aprovado()); // 2% de desconto extra
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        System.out.println(calc.calcular(primeiro));
        System.out.println(calc.calcular(segundo));
        primeiro.aplicarDescontoExtra();
        segundo.aplicarDescontoExtra();
        System.out.println(primeiro.getValor()); // 98,00
        System.out.println(segundo.getValor()); // 1900.00
    }
}
