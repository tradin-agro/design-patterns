package br.com.tradin;

import br.com.tradin.loja.impostos.strategy.CalculadorDeImpostos;
import br.com.tradin.loja.impostos.strategy.ICMS;
import br.com.tradin.loja.impostos.strategy.ISS;
import br.com.tradin.loja.orcamento.ItemOrcamento;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteCalculoImposto {
    public static void main(String[] args) {

        // Pattern Strategy - quando temos muitos ifs crescendo, e sabemos qual é a regra a ser aplicada.
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadorDeImpostos calc = new CalculadorDeImpostos();
        System.out.println(calc.calcular(orcamento, new ICMS()));
        System.out.println(calc.calcular(orcamento, new ISS()));

    }
}