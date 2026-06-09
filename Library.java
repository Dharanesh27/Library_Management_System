import java.util.*;
class Library{
    ArrayList<Book> books = new ArrayList<>();
     void addBook(Book b){
        books.add(b);
        System.out.println(b.getTitle() + " Added to library.");
     }
     void issueBook(int  id,int userId){
        for(Book b : books){
            if(b.getId() == id){
                if(b.isAvailable()){
                    b.setAvailability(false);
                    System.out.println("Book issued: " + b.getTitle());
                }else{
                        System.out.println("Boook already issued.");
                }
                return;
            }
            }
            
            System.out.println("Book not found");   
        }
        void acceptBook(int id,int userId){
        for (Book b : books){
            if(b.getId()==id){
                if(!b.isAvailable()){
                    b.setAvailability(true);
                    System.out.println("Book returned: " + b.getTitle());
                }else{
                    System.out.println("Book: " + b.getTitle() + " not issued to the user" + userId + ".");
                }
                return;
            }
        }
         System.out.println("Book not found"); 

     }
     void display(){
        System.out.println("\n --Library Books---");
        for(Book b : books){
            b.display();
        }
    }
 }