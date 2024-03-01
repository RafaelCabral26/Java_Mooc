public class Book {
 private String author; 
 private String name; 
 private int pages; 

 public Book(String initAuthor, String initName, int initPages) {
    this.author = initAuthor;
    this.name = initName;
    this.pages = initPages;
 }

 public String getAuthor() {
    return this.author;
 }
 public String getName() {
    return this.name;
 }
 public int getPages() {
    return this.pages;
 }
 public String toString() {
    return this.author + ", " + this.name + ", " + this.pages + " pages";
 }
}
