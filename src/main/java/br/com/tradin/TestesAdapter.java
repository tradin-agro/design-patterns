package br.com.tradin;

import br.com.tradin.loja.http.JavaHttpClient;
import br.com.tradin.loja.orcamento.Orcamento;
import br.com.tradin.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        // Pattern Adapter - padrão estrutural que facilida a troca de artefatos que fazem a implementação
        // de conexão com outras estruturas
        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
