package br.com.tradin.loja.desconto;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoComValorMaiorQueMil extends Desconto {

    public CalcularDescontoComValorMaiorQueMil(Desconto proximo) {
        super(proximo);
    }

    @Override
    BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("1000")) > 0;
    }
}
