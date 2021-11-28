public class Book
{
    private String title;
    private Writer author;
    private int pages;
    
    Book(String title, Writer author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    };
    
    public void open(){};
    public void read(){};
    public String toString(){
        return "Title: " +this.title+ "\nAuthor: [" + this.author.toString() +"]"+ "\nPages: " + this.pages;
    };
    
    public static void main(){
        Writer w1 = new Writer("Tomasz","Piesowski",66);
        Book b1 = new Book("Władca Brekolków",w1,712);
        
        System.out.println(b1);
        

        
    
    
    
    };
}
