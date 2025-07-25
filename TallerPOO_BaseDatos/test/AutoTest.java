
import org.junit.Test;
import static org.junit.Assert.*;

public class AutoTest {

    @Test
    public void testCreacionAuto() {
        Auto auto = new Auto("F150", "Ford");
        assertNotNull("El objeto Auto no debe ser nulo", auto);
    }

    @Test
    public void testPropiedadesAuto() {
        Auto auto = new Auto("Asilverado", "Chevrolet");
        assertEquals("Modelo debe ser 'Asilverado'", "Asilverado", auto.modelo);
        assertEquals("Marca debe ser 'Chevrolet'", "Chevrolet", auto.marca);
    }
}
