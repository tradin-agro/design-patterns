package br.com.tradin.loja.orcamento;

import br.com.tradin.loja.orcamento.situacao.EmAnalise;
import br.com.tradin.loja.orcamento.situacao.Finalizado;
import br.com.tradin.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;

    private List<Orcavel> itens;

    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
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
        return itens.size();
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public boolean isFinalizado() {
        return situacaoOrcamento instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}
