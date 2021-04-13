package quotes;

import java.util.Objects;

public class RecentQuotes {
    String author;
    String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecentQuotes that = (RecentQuotes) o;
        return Objects.equals(author, that.author) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "RecentQuotes[" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ']';
    }
}
