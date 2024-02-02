package br.com.tradin.loja.acao;

import br.com.tradin.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedidos no banco de dados!");
    }
}
