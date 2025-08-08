//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection?

import java.util.ArrayList;
class Book{
    private String Title ;
    private String AuthorName;
    private String ISBN;
    
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();
    
    public Book(String Title , String AuthorName , String ISBN){  //constructer of the class Book
        this.Title = Title;
        this.AuthorName = AuthorName;
        this.ISBN = ISBN;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public String getAuthorName(){
        return AuthorName;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setAuthorName(String a){
        this.AuthorName = a;
    }
    public void setISBN(String a){
        this.ISBN = a;
    }
    
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    
    public static ArrayList<Book> getBooks(){
        return bookCollection;
    }
}




public class Main{
    public static void main(String[] args){
        Book book1 = new Book("Intro to python" ,"Writen by", "257765HDFIE4");
        Book book2 = new Book("Java App dev" ,"Just kidding","4367383GDHDJ");
        
        
        Book.addBook(book1);
        Book.addBook(book2);
        
        
        ArrayList<Book> bookCollection = Book.getBooks();
        for (Book b :bookCollection ){
            System.out.println(b.getTitle());
            System.out.println(b.getAuthorName());
            System.out.println(">>------------------------<<");
            
        }
    }
}

