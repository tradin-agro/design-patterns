package br.com.tradin.loja.impostos.decorator;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DecICMS extends AbsImposto {

    public DecICMS(AbsImposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
