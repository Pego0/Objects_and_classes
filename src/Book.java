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
}