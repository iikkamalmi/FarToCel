import org.example.FarToCel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FarToCelTest {
    @Test
    public void testConvertFar() {
        assertEquals(0, FarToCel.convertFar(32));
    }
    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, FarToCel.KelvinToCelsius(273.15), 0.01);
    }
    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(80.51, FarToCel.KelvinToFahrenheit(300.1), 0.001);
    }
}
