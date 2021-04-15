package quotes;

import java.util.Objects;

public class ApiQuote {
    public String quoteText;
    public  String quoteAuthor;
    public String senderName;
    public String senderLink;
    public String quoteLink;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiQuote apiQuote = (ApiQuote) o;
        return Objects.equals(quoteText, apiQuote.quoteText) && Objects.equals(quoteAuthor, apiQuote.quoteAuthor) && Objects.equals(senderName, apiQuote.senderName) && Objects.equals(senderLink, apiQuote.senderLink) && Objects.equals(quoteLink, apiQuote.quoteLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quoteText, quoteAuthor, senderName, senderLink, quoteLink);
    }

    @Override
    public String toString() {
        return "ApiQuote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
