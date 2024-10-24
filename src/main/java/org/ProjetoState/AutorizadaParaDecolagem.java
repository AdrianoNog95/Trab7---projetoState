package org.ProjetoState;

public class AutorizadaParaDecolagem extends EstadoAeronave {
    @Override
    public void taxiamento(Aeronave aeronave) {

    }

    @Override
    public void autorizacaoDecolagem(Aeronave aeronave) {

    }

    @Override
    public void decolagem(Aeronave aeronave) {
        aeronave.setEstado(new EmDecolagem());
    }

    @Override
    public void voo(Aeronave aeronave) {

    }

    @Override
    public void emergencia(Aeronave aeronave) {
        aeronave.setEstado(new Emergencia());
    }
}
