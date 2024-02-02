package br.com.tradin.loja.desconto;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    boolean deveAplicarDesconto(Orcamento orcamento) {
        return true;
    }
}
