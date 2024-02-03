package br.com.tradin.loja.impostos.strategy;

import br.com.tradin.loja.impostos.strategy.Imposto;
import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
