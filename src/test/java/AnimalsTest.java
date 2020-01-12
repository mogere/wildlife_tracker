import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void animals_instanciatesCorrectly_true() {
        Animals newAnimal = new Animals("Lion", 01);
        assertEquals(true, newAnimal instanceof Animals);

    }

    @Test
    public void getName_works_true(){
        Animals newAnimal = new Animals("Lion", 01);
        assertEquals("Lion", newAnimal.getName());
    }

    @Test
    public void getI_works_true(){
        Animals newAnimal = new Animals("Lion", 01);
        assertEquals(1, newAnimal.getId());
    }

    @Test
    public void equalsTestsIfClassesAreSame_true() {
        Animals animal1 = new Animals("Lion" ,1);
        Animals animal2 = new Animals("Lion" ,1);
        assertTrue(animal1.equals(animal2));
    }


}