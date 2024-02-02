package br.com.tradin.loja.acao;

import br.com.tradin.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }
}
