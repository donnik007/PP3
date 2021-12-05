public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, String author,int minutes,int seconds,Publisher publisher,int pupYear,Writer writer){
        super(title,author,publisher,pupYear,writer);
        this.minutes = minutes;
        this.seconds = seconds;  
    };
    
    public void setMinutes(int minutes){this.minutes = minutes;}
    public void setSeconds(int seconds){this.seconds = seconds;}
    
    public int getMinutes(){return this.minutes;};
    public int getSeconds(){return this.seconds;};
    
    public void display(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Duration: "+ this.minutes +":"+this.seconds);
        System.out.println("Puplication year: "+ getPupYear());
        System.out.println("Writer: "+ this.writer);
        System.out.println("Publisher: "+ this.publisher.getName() + "  " + this.publisher.getCity());
        System.out.println("-------------------");
    };
    
    public static void main(){
        Book b1 = new Book("Drzewa cz2","Krzysztof Dąb",new Publisher("Andzrej Bak","Polzan"),2023,new Writer("Adam","Toas","Horror"));
        Audiobook ab1 = new Audiobook("Woda Ogien","Andrzej klos",10,30,new Publisher("zbigniew polo","WWA"),2013,new Writer("Adam","Toas","Horror"));
        Audiobook ab2 = new Audiobook("Kon i pies","Vlad Mostek",14,34,new Publisher("zJan Maln","KRK"),2005,new Writer("Adam","Toas","Horror"));
        ab1.display();
        ab2.display();
        b1.display();
    };
}
