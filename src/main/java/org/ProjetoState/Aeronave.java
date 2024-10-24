package org.ProjetoState;

public class Aeronave {
    private EstadoAeronave estadoAtual;

    public Aeronave() {
        this.estadoAtual = new ProntoParaTaxiamento();
    }

    public void setEstado(EstadoAeronave novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public EstadoAeronave getEstadoAtual() {
        return this.estadoAtual;
    }

    public void iniciarTaxiamento() {
        estadoAtual.taxiamento(this);
    }

    public void solicitarAutorizacaoDecolagem() {
        estadoAtual.autorizacaoDecolagem(this);
    }

    public void iniciarDecolagem() {
        estadoAtual.decolagem(this);
    }

    public void iniciarVoo() {
        estadoAtual.voo(this);
    }

    public void declararEmergencia() {
        estadoAtual.emergencia(this);
    }
}

