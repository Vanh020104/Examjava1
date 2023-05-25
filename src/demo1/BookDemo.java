package demo1;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russle", "Winderand");
        Book sach = new Book("Developing Java Software", author, 79.75);


        //In ra thong tin sach
        System.out.println("Title: " + sach.getTitle());
        System.out.println("Author: " + author.getFirstName() + " " + author.getLastName());
        System.out.println("Price: " + sach.getPrice());
    }

}
