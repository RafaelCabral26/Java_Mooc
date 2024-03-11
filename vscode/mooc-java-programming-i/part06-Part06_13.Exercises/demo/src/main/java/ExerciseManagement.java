import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<Exercise> getList() {
        return this.exercises;
    }

    public void add(String name) {
        Exercise exercise = new Exercise(name);
        this.exercises.add(exercise);
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise ex : exercises) {
            list.add(ex.getName());
        }
        return list;
    }

    public void markAsCompleated(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleated(true);
            }
        }
    }

    public boolean isCompleated(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleated();
            }
        }
        return false;
    }

}
