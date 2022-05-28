public class Main {

    public static void main(String[] args) {
        ///Classwork
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge = " + sarah.getAge());
        Person john = new Person("John", 23);

        ///Homework
        Author author1 = new Author("Ivan ", "Ivanov");
        Book book1 = new Book("Book 1 ", 2003, author1);
        book1.setBookYear(2004);
        System.out.println("Book name: " + book1.getBookName() + ". Book was published in: " + book1.getBookYear() + ". The author is " + author1.getName() + author1.getSurname());
        Author author2 = new Author("Ivan ", "Petrov");
        Book book2 = new Book("Book 2 ", 2005, author2);
        System.out.println("Book name: " + book2.getBookName() + ". Book was published in: " + book2.getBookYear() + ". The author is " + author2.getName() + author2.getSurname());
    }
}