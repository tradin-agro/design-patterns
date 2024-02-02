package br.com.tradin.loja.desconto;

import br.com.tradin.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // Patterm Template Method - faz implementação de métodos que devem ser implementados
    // e chamados nas classes filhas.
    public BigDecimal calcular(Orcamento orcamento) {
        if(deveAplicarDesconto(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    // O corpo e retorno desses métods abstratos são implementados nas classes filhas
    // mas é a classe mãe que faz a chamada dos métodos.
    abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
