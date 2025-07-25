
import org.junit.Test;
import static org.junit.Assert.*;

public class MotoTest {

    @Test
    public void testCreacionMoto() {
        Moto moto = new Moto("GSX-R150", "Suzuki");
        assertNotNull("La moto no debe ser nula", moto);
    }

    @Test
    public void testPropiedadesMoto() {
        Moto moto = new Moto("L200", "Yamaha");
        assertEquals("L200", moto.modelo);
        assertEquals("Yamaha", moto.marca);
    }
}
