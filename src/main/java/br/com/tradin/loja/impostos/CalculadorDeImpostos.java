package br.com.tradin.loja.impostos;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
