package br.com.ada.f1rst.poo2.enviarMensagem;

public class EnvioSMS implements EnvioMensagem {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("Enviando a mensagem por SMS: \n " + mensagem);

    }

    @Override
    public void metodoInterface() {

    }

}
