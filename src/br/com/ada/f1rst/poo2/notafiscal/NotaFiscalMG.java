package br.com.ada.f1rst.poo2.notafiscal;

public class NotaFiscalMG extends NotaFiscal {

    private final double PORC_IMPOSTO = 3;

    @Override
    protected String infoFiscal() {
        return "Estado de Minas Gerais";
    }

    @Override
    protected double calcularImposto() {
        return super.getValorTotal() * (PORC_IMPOSTO / 100);
    }

}
