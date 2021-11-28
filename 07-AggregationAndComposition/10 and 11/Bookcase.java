import java.util.ArrayList;
public class Bookcase
{
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    
    Bookcase(String name){this.name = name;};
    
    public void addBook(Book bookName){
        this.books.add(bookName);
    };
    public void removeBook(String bookName){
        this.books.removeIf(Book -> Book.getTitle() == bookName);
    };
    
    public void display(){
        System.out.println("Bookcase name: " + this.name);
        for (Book i : this.books) {
            System.out.println("Book: " + i.toString());
        }
        System.out.println("----------------");
    };
    
    public static void main(){
        Writer w1 = new Writer("Tomasz","Piesowski",66);
        Book b1 = new Book("Władca Brekolków",w1,712);
        b1.addChar("Start",50,1);
        b1.addChar("end",54,51);
        
        Writer w2 = new Writer("Andrzej","Sapkowicki",47);
        Book b2 = new Book("Wieśmin",w2,1024);        
        b2.addChar("being",54,1);
        b2.addChar("fianl",24,53);
        
        Writer w3 = new Writer("Gorge","Martin",93);
        Book b3 = new Book("Gra o fotel",w3,332);
        b3.addChar("war",23,1);
        b3.addChar("peace",14,24);
        
        Bookcase bc1 = new Bookcase("Półka z Fantastyka");
        bc1.addBook(b1);
        bc1.addBook(b2);
        bc1.addBook(b3);
        bc1.display();
        bc1.removeBook("Wieśmin");
        bc1.display();
        
    };
}
