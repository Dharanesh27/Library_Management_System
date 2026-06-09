class User{
    String user_name;
    private int userId;
    User(String User_name,int userId){
        this.user_name = User_name;
        this.userId = userId;
    }

    void borrowBook(Library lib,int bookId){
        System.out.println("User:  "+ userId +" borrowing the book.");
        lib.issueBook(bookId,userId);
    }
    void returnBook(Library lib,int bookId){
        System.out.println("User: " + userId + " returning book.");
        lib.acceptBook(bookId,userId);
    }
}