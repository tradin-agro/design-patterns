package br.com.tradin.loja.orcamento;

import br.com.tradin.loja.DomainException;
import br.com.tradin.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    // a classe RegistroDeOrcamento não sabe como é implementado o HttpAdapter, apenas usa seu método post
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
                 );

        http.post(url, dados);
    }

}
