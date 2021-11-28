import java.util.ArrayList;
public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private ArrayList<Chapter> chapters = new ArrayList<>();
    
    Book(String title, Writer author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    };
    public String getTitle(){return this.title;};
    public Writer getAuthor(){return this.author;};
    public int getPages(){return this.pages;};
    
    public void open(){};
    public void read(){};
    public String toString(){
        return "Title: " +this.title+ "\nAuthor: [" + this.author.toString() +"]"+ "\nPages: " + this.pages + this.chapters.toString() +"\n";
    };
    
    public void addChar(String title,int pages,int startPage){
        this.chapters.add(new Chapter(title,pages,startPage));
    }
    
    public static void main(){
        Writer w1 = new Writer("Tomasz","Piesowski",66);
        Book b1 = new Book("Władca Brekolków",w1,713);
        
        System.out.println(b1);
        

        
    
    
    
    };
}
