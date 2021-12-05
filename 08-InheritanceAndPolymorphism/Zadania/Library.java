import java.util.ArrayList;
public class Library
{
    private ArrayList<Book> materials = new ArrayList<Book>();
    
    
    
    public static void main(){
        Book b1 = new Book("Drzewa cz2","Krzysztof Dąb",new Publisher("zJan Maln","KRK"),2013,new Writer("Adam","Toas","Horror"));
        Book eb1 = new Ebook("Woda Ogien","Andrzej klos","WodOg.pdf",new Publisher("Chin Maln","WWA"),2008,new Writer("Adam","Toas","Horror"));
        Book eb2 = new Ebook("Kon i pies","Vlad Mostek","KonPies.pdf",new Publisher("Pan Maln","RS"),2006,new Writer("Adam","Toas","Horror"));
        Book ab1 = new Audiobook("Woda Ogien","Andrzej klos",10,30,new Publisher("Man Maln","DLS"),2002,new Writer("Adam","Toas","Horror"));
        Book ab2 = new Audiobook("Kon i pies","Vlad Mostek",14,34,new Publisher("zJan Maln","KK"),2003,new Writer("Adam","Toas","Horror"));
        
        Library lib1 = new Library();
        lib1.materials.add(b1);
        lib1.materials.add(eb1);
        lib1.materials.add(eb2);
        lib1.materials.add(ab1);
        lib1.materials.add(ab2);
        
        for(Book book :lib1.materials){
            book.display();
        }
    };
}
