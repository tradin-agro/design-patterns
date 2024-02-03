package br.com.tradin.loja.impostos.decorator;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class AbsImposto {

    // A classe decora a si mesma e traz o método de calculo para sua composição.
    private AbsImposto outroImposto;

    public AbsImposto(AbsImposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        if(outroImposto != null) {
            valorDoOutroImposto = outroImposto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }
}
