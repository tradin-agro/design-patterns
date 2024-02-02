package br.com.tradin.loja.orcamento;

import br.com.tradin.loja.orcamento.situacao.EmAnalise;
import br.com.tradin.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private Integer quantidadeItens;

    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }

    public void finalizar() {
        this.situacaoOrcamento.finalizar(this);
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }
}
