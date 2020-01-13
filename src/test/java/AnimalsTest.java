import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void animals_instantiatesCorrectly_true() {
        Animals newAnimal = new Animals("Lion");
        assertEquals(true, newAnimal instanceof Animals);

    }

    @Test
    public void getName_works_true(){
        Animals newAnimal = new Animals("Lion");
        assertEquals("Lion", newAnimal.getName());
    }

    @Test
    public void all_returnsAllInstancesOfAnimals_true() {
        Animals animal1 = new Animals("Wildebeast");
        animal1.save();
        Animals animal2 = new Animals("Erland");
        animal2.save();
        assertEquals(true, Animals.allAnimals().get(0).equals(animal1));
        assertEquals(true, Animals.allAnimals().get(1).equals(animal2));
    }

//    @Test
//    public void getId_works_true(){
//        Animals newAnimal = new Animals("Lion");
//        assertEquals(1, newAnimal.getId());
//    }

    @Test
    public void equalsTestsIfClassesAreSame_true() {
        Animals animal1 = new Animals("Lion" );
        Animals animal2 = new Animals("Lion" );
        assertTrue(animal1.equals(animal2));
    }


}