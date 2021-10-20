public class CinemaTicket
{

    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    float price;
        
    void displayInfo(){
        System.out.println("Nazwa kina: " + cinemaName);
        System.out.println("Film: " + filmTitle);
        System.out.println("Rząd: " + row + " | Miejsce: " + seat);
        System.out.println("Cena: " + price);
        System.out.println("----------------");
    };
    
    
    CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if(row > 2){
            this.price = 25.0f;
        }else{
            this.price = 10.0f;
        };
        
        
        
    };
    
    
    public static void main(String[] args) { 
        CinemaTicket ticket1 = new CinemaTicket("Gladiator",2,14);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator",7,22);

        ticket1.displayInfo();
        ticket2.displayInfo();
        
    }
}
