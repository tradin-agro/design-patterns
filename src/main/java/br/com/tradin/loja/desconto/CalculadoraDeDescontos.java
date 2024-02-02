package br.com.tradin.loja.desconto;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new CalcularDescontoComQuantidadeMaiorQueCinco(
                new CalcularDescontoComValorMaiorQueMil(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
