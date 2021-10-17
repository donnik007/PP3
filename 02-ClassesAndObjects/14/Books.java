public class Books
{
    String title;
    boolean isNew;
    String auth;
    float prize;
    int bookId;
    
    void read(){
        System.out.print("reading...");
    };
    
        void showInfo(){
        System.out.print("Author" + auth);
    };
    
        void showPrize(){
        System.out.print("prize is " + prize);
    };
}
