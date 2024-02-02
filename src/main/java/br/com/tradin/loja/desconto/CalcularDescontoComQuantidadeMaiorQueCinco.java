package br.com.tradin.loja.desconto;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoComQuantidadeMaiorQueCinco extends Desconto {

    public CalcularDescontoComQuantidadeMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    @Override
    BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
