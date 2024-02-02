package br.com.tradin.loja.pedido;

import br.com.tradin.loja.acao.AcaoAposGerarPedido;
import br.com.tradin.loja.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

// construtor com injeção de dependencias: reository, service, etc.

    public void executa(GeraPedido geraPedido){
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());

        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        // Execução das classes Observer
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
