import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!hasAbbreviation(abbreviation)) {
            abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abrev) {
        if(abbreviations.containsKey(abrev)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abrev) {
        if (!hasAbbreviation(abrev)) {
             return this.abbreviations.get(abrev);
        }
        return null;
    }
    
}
