package br.com.tradin;

import br.com.tradin.loja.desconto.CalculadoraDeDescontos;
import br.com.tradin.loja.impostos.CalculadorDeImpostos;
import br.com.tradin.loja.impostos.ICMS;
import br.com.tradin.loja.impostos.ISS;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteCalculoDesconto {

    public static void main(String[] args) {
        // Pattern Chain of Responsibility - quando temos que passar por uma cadeia de validações/processamento,
        // e não sabemos qual é o algoritmo que será aplicado.
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1010"), 1);
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        System.out.println(calc.calcular(primeiro));
        System.out.println(calc.calcular(segundo));
    }
}
