public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String initTitle, int initPages, int initYear) {
        this.title = initTitle;
        this.pages = initPages;
        this.year = initYear;
    }

    public String toString(String argument) {
        if (argument.equals("everything")) {
            return this.title + ", " + this.pages + " pages, " + this.year;
        } else if (argument.equals("name")) {
            return this.title;
        }
        return "";
    }

}
