package org.ProjetoState;

public abstract class EstadoAeronave {
    public abstract void taxiamento(Aeronave aeronave);
    public abstract void autorizacaoDecolagem(Aeronave aeronave);
    public abstract void decolagem(Aeronave aeronave);
    public abstract void voo(Aeronave aeronave);
    public abstract void emergencia(Aeronave aeronave);
}
