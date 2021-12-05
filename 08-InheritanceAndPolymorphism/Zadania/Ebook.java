public class Ebook extends Book
{
    private String fileName;
    
    Ebook(String title, String author, String fileName, Publisher publisher,int pupYear,Writer writer){
        super(title,author,publisher,pupYear,writer);
        this.fileName = fileName;

    };
    
    public void setFileName(){this.fileName = fileName;};
    public String getFileName(String fileName){return this.fileName;};
    
    public void display(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("File Name: "+ this.fileName);
        System.out.println("Puplication year: "+ getPupYear());
        System.out.println("Writer: "+ this.writer);
        System.out.println("Publisher: "+ this.publisher.getName() + "  " + this.publisher.getCity());
        System.out.println("-------------------");
        
    };
    
    public static void main(){
        
        Book b1 = new Book("Drzewa cz2","Krzysztof Dąb",new Publisher("Adnrzej Popa","Krk"),2003,new Writer("Adam","Toas","Horror"));
        Ebook eb1 = new Ebook("Woda Ogien","Andrzej klos","WodOg.pdf",new Publisher("Krystian mopo","wroclaw"),2005,new Writer("Adam","Toas","Horror"));
        Ebook eb2 = new Ebook("Kon i pies","Vlad Mostek","KonPies.pdf",new Publisher("zbigniew polo","Polzan"),2007,new Writer("Adam","Toas","Horror"));
        eb1.display();
        eb2.display();
        b1.display();
        
    };
}
