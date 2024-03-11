import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Teste");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Teste2");
        assertTrue(management.exerciseList().contains("Teste2"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("Teste3");
        management.markAsCompleated("Teste3");
        assertTrue(management.isCompleated("Teste3"));

    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("Teste4");
        management.markAsCompleated("Teste4");
        assertFalse(management.isCompleated("Teste5"));
    }
}
