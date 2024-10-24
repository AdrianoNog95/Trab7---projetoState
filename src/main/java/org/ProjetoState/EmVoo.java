package org.ProjetoState;

public class EmVoo extends EstadoAeronave {
    @Override
    public void taxiamento(Aeronave aeronave) {

    }

    @Override
    public void autorizacaoDecolagem(Aeronave aeronave) {

    }

    @Override
    public void decolagem(Aeronave aeronave) {

    }

    @Override
    public void voo(Aeronave aeronave) {

    }

    @Override
    public void emergencia(Aeronave aeronave) {
        aeronave.setEstado(new Emergencia());
    }
}
