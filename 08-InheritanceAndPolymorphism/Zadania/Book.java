public class Book
{
    private String title;
    private String author;
    protected Publisher publisher;
    private int pupYear;
    protected Writer writer;
    
    Book(String title, String author, Publisher publisher,int pupYear,Writer writer){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pupYear = pupYear;
        this.writer = writer;
    };
    
    public String getTitle(){return this.title;};
    public String getAuthor(){return this.author;};
    public int getPupYear(){return this.pupYear;};
    public void setTitle(String title){this.title = title;};
    public void setAuthor(String author){this.author = author;};
    public void setPupYear(int pupYear){this.pupYear = pupYear;};
    
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+ this.author);
        System.out.println("Publisher: "+ this.publisher.getName() + "  " + this.publisher.getCity());
        System.out.println("Puplication year: "+ this.pupYear);
        System.out.println("Writer: "+ this.writer);
        System.out.println("-------------------");
    
    };
    
    public static void main(){
        Book b1 = new Book("Ksiąze","Adam Mickiewicz",new Publisher("Tom Woda","Łodz"),2002,new Writer("Adam","Toas","Horror"));
        Book b2 = new Book("Śnieg","Tomasz Kot",new Publisher("Adnrzej Popa","Krk"),2003,new Writer("Adam","Toas","Horror"));

        b1.display();
        b2.display();
    }
}
