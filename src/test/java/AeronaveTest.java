import org.ProjetoState.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AeronaveTest {
    private Aeronave aeronave;

    @BeforeEach
    public void setUp() {
        aeronave = new Aeronave();
    }

    @Test
    public void testIniciarTaxiamento() {
        assertTrue(aeronave.getEstadoAtual() instanceof ProntoParaTaxiamento);

        aeronave.iniciarTaxiamento();

        assertTrue(aeronave.getEstadoAtual() instanceof Taxiando);
    }

    @Test
    public void testSolicitarAutorizacaoDecolagem() {
        aeronave.iniciarTaxiamento();

        aeronave.solicitarAutorizacaoDecolagem();

        assertTrue(aeronave.getEstadoAtual() instanceof AutorizadaParaDecolagem);
    }

    @Test
    public void testIniciarDecolagem() {
        aeronave.iniciarTaxiamento();
        aeronave.solicitarAutorizacaoDecolagem();

        aeronave.iniciarDecolagem();


        assertTrue(aeronave.getEstadoAtual() instanceof EmDecolagem);
    }

    @Test
    public void testIniciarVoo() {

        aeronave.iniciarTaxiamento();
        aeronave.solicitarAutorizacaoDecolagem();
        aeronave.iniciarDecolagem();


        aeronave.iniciarVoo();


        assertTrue(aeronave.getEstadoAtual() instanceof EmVoo);
    }

    @Test
    public void testDeclararEmergencia() {

        aeronave.declararEmergencia();


        assertTrue(aeronave.getEstadoAtual() instanceof Emergencia);
    }

    @Test
    public void testTransicaoDeTaxiamentoParaEmergencia() {

        aeronave.iniciarTaxiamento();


        aeronave.declararEmergencia();


        assertTrue(aeronave.getEstadoAtual() instanceof Emergencia);
    }
}
