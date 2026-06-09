
class Main{
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Netflix","ABC",001);
        Book b2 = new Book("Amazon","BCA",002);
        lib.addBook(b1);
        lib.addBook(b2);
        User u1 = new User("AAA",001);
        User u2 = new User("BBB",002);
        u1.borrowBook(lib,001);
        u1.returnBook(lib,002);
        lib.display();

    }
}