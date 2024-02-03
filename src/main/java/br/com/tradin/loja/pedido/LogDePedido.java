package br.com.tradin.loja.pedido;

import br.com.tradin.loja.acao.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Registra log pedido "+pedido);
    }
}
