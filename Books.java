class Book{
    private String title,author;
    private int id;
    private boolean availability;
    Book(String title,String author,int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.availability = true;
    }
    boolean isAvailable(){
        return availability;
    }
    String getTitle(){
        return title;

    }
    String getAuthor(){
        return author;
    }
    int getId(){
        return id;
    }
    void setAvailability(boolean status){
        availability = status;
    }
    
    void display(){
        System.out.println(title + " | " + author + " | " + id + " | " +  (availability ? "Available" : "Issued"));
    }
}