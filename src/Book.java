public class Book {
    private String bookName;
    private int bookYear;
    private Author author;

    public Book(String bookName, int bookYear, Author author) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int year) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "Book name is: " + this.bookName + ". Was published in: " + this.bookYear + ". The Author is: " + author.getName() + author.getSurname();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (bookYear != this.bookYear) return false;
        if (author.getName() != author.getName()) return false;
        if (author.getSurname() != author.getSurname()) return false;
        return bookName.equals(this.bookName);
    }
    public int hashCode() {
        int result = bookName == null ? 0 : bookName.hashCode();
        result = 31 * result + bookYear;
        return result;
    }

}