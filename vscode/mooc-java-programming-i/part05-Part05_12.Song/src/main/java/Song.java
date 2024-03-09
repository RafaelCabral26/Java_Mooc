
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object songObject) {
        if (!(songObject instanceof Song))
            return false;
        if (this == songObject) {
            return true;
        }
        Song compared = (Song) songObject;
        if (this.name.equals(compared.name) &&
                this.artist.equals(compared.artist) &&
                this.durationInSeconds == compared.durationInSeconds) {
            return true;
        }
        return false;
    }

}
