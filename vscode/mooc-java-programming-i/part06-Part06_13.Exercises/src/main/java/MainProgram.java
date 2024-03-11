import java.util.ArrayList;

public class MainProgram {
    // update here your exercise progress
    public static void main(String[] args) {
       ExerciseManagement management = new ExerciseManagement();
       management.add("Teste1"); 
       management.add("Teste2"); 
       management.markAsCompleated("Teste1");
       management.markAsCompleated("Teste2");
       partsCompleted(management);
    }
    public static int partsCompleted(ExerciseManagement management) {
        return 2;
    }

}
