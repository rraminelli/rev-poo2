package br.com.ada.f1rst.poo2.enviarMensagem;

import br.com.ada.f1rst.poo2.notafiscal.NotaFiscal;

import java.util.List;

public class EnviarDadosNFService {

    public void enviarDados(NotaFiscal notaFiscal, EnvioMensagem... envioMensagemList) {

        String detalhesNF = notaFiscal.exibirDetalhes();

        for (EnvioMensagem envioMensagem : envioMensagemList) {
            envioMensagem.enviarMensagem(detalhesNF);

            envioMensagem.metodoInterface();

            if (envioMensagem instanceof EnvioWhatsApp) {
                ((EnvioWhatsApp) envioMensagem).metodoClasseWhatsApp();
            }
        }

    }

}
