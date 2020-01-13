import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredTest {

    @Test
    public void animals_instanciatesCorrectly_true() {
        Endangered endangered = new Endangered("Lion");
        assertEquals(true, endangered instanceof Endangered);

    }

}