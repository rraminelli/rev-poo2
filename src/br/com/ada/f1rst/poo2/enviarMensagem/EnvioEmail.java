package br.com.ada.f1rst.poo2.enviarMensagem;

public class EnvioEmail implements EnvioMensagem {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("Enviando a mensagem por email: \n " + mensagem);

    }

    @Override
    public void metodoInterface() {

    }

}
