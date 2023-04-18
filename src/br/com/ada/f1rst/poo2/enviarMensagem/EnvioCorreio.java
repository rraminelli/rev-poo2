package br.com.ada.f1rst.poo2.enviarMensagem;

public class EnvioCorreio implements EnvioMensagem {
    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("Envio por correio....");

    }

    @Override
    public void metodoInterface() {

    }
}
