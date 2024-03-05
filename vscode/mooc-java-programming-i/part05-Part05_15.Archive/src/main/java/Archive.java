public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Archive))
            return false;
        Archive archObj = (Archive) obj;
        if (this.id.equals(archObj.id)) {
            return true;
        }
        return false;
    }
}
