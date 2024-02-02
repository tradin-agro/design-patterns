package br.com.tradin.loja.acao;

import br.com.tradin.loja.pedido.Pedido;

public interface AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido);
}
