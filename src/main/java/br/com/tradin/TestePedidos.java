package br.com.tradin;

import br.com.tradin.loja.acao.EnviarEmailPedido;
import br.com.tradin.loja.acao.SalvarPedidoNoBancoDeDados;
import br.com.tradin.loja.pedido.GeraPedido;
import br.com.tradin.loja.pedido.GeraPedidoHandler;
import br.com.tradin.loja.pedido.LogDePedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Giovanni";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quatidadeItens = Integer.parseInt("6");

        // Pattern Command Handlers - classe de dados e classe de comando com sufixo handler
        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quatidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                // Pattern Observer - classes que estão observando a ação no handler para serem executadas
                // com objetivo de reduzir o acoplamento
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido(), new LogDePedido())
        ); // /* dependencias: repository, service, etc */

        // Pattern Facade - fachada, disponibilizado um método que executa ações
        // em uma entrada única (fachada), escode detalhes internos da classe cliente.
        // Ideal para construir fluxos de negócio na execução do sistema
        handler.executa(geraPedido);
    }
}
