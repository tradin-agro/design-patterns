package br.com.tradin;

import br.com.tradin.loja.impostos.decorator.CalculadorDeImpostosDec;
import br.com.tradin.loja.impostos.decorator.DecICMS;
import br.com.tradin.loja.impostos.decorator.DecISS;
import br.com.tradin.loja.orcamento.ItemOrcamento;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostoDecorator {

    public static void main(String[] args) {

        // Pattern Decorator - adicionando novas caracteristicas/comportamentos em tempo de execução
        // sem modificar o código já existente.
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        CalculadorDeImpostosDec calc = new CalculadorDeImpostosDec();
        // Calculo de vários impostos juntos
        System.out.println(calc.calcular(orcamento, new DecISS(new DecICMS(null))));
    }
}
