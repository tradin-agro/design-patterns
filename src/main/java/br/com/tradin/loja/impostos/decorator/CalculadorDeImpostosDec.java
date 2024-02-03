package br.com.tradin.loja.impostos.decorator;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeImpostosDec {

    public BigDecimal calcular(Orcamento orcamento, AbsImposto imposto){
        return imposto.calcular(orcamento);
    }
}
