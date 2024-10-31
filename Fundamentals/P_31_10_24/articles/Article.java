package P_31_10_24.articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public String getContent() {
        return content;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public String getAuthor() {
        return author;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String toString() {
        return String.format("%s - %s: %s",
                title, content, author);
    }
}
