public class Main {

    public static void main(String[] args) {
        ///Classwork
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Go to the bar");
        } else {
            System.out.println("Go to the school");
        }
        System.out.println(sarah);
        sarah.increaseAge(1);

        ///Homework 1.9
        Author author1 = new Author("Ivan ", "Ivanov");
        Book book1 = new Book("Book 1", 2003, author1);
        book1.setBookYear(2004);
        Author author2 = new Author("Ivan ", "Petrov");
        Book book2 = new Book("Book 2", 2005, author2);
        ///1.10
        System.out.println(book1);
        System.out.println(book2);

    }
}