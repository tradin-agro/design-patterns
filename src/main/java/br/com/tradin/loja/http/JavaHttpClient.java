package br.com.tradin.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    // simulação da implementação HttpAdapter chamada de JavaHttpClient
    // que é usada na classe Main para fazer a chamada do método.
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
}
