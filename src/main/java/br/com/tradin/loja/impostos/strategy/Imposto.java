package br.com.tradin.loja.impostos.strategy;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
