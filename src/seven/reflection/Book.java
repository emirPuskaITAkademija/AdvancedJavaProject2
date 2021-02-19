package seven.reflection;
//Zašto smo mi kreirali klasu Book ??
// instancirali ili kreirali ili stovrili objekte u memoriji
public class Book {
    public static int counter = 0;
    private String title;
    private String content;
    private String author;
    private int numberOfPages;

    public Book() {
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
