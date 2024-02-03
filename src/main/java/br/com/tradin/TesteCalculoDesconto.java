package br.com.tradin;

import br.com.tradin.loja.desconto.CalculadoraDeDescontos;
import br.com.tradin.loja.orcamento.ItemOrcamento;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteCalculoDesconto {

    public static void main(String[] args) {
        // Pattern Chain of Responsibility - quando temos que passar por uma cadeia de validações/processamento,
        // e não sabemos qual é o algoritmo que será aplicado.
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1010")));
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        System.out.println(calc.calcular(primeiro));
        System.out.println(calc.calcular(segundo));
    }
}
