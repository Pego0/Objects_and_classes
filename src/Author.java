public class Author {
    private String surname;
    private String name;

    public Author(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
