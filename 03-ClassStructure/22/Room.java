public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number) {
        this.number = number;
        this.beds = 2;
    
    };
    
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    
    };
    
    void checkin(String guestName) {
        this.occupied = true;
        this.guestName = guestName;
        
    };
    
    void checkout() {
        this.occupied = false;
        this.guestName = null;
    };
    
    boolean isOccupied() {
        if (this.occupied) {
            return true;
        }else{
            return false;
        }
    };
    
    
    public String toString(){ 
        return this.number+" "+this.beds+" "+isOccupied() +" "+guestName;  
    } 
    
    
    /*void displayStatus() {
        System.out.print("| Room number: " + this.number + " | Beds: " + this.beds);
        System.out.print(" | Is occupied?: " + isOccupied());
        if (isOccupied()) {
            System.out.print(" | Guest name: " + guestName);
        }
        System.out.println("");
    };*/
    

    static void sinStatus(Room[] rooms, int x){
        System.out.println(rooms[x]);
        //rooms[x].displayStatus();
    };
    
    static void allStatus(Room[] rooms){
        for(int i=0;i < rooms.length ;i++){
            System.out.println(rooms[i]);
            //rooms[i].displayStatus();
        };
    };    
    
    static void specBedStatus(Room[] rooms,int bed){
        for(int i=0;i < rooms.length ;i++){
            if (rooms[i].beds == bed) {
                System.out.println(rooms[i]);
                //rooms[i].displayStatus();
            };
            
        }; 
    };   
    
    
    static void vacOccStatus(Room[] rooms){
        int vacant = 0;
        int occup = 0;
        for(int i=0;i < rooms.length ;i++){
            if (rooms[i].isOccupied()) {
                occup += 1;
            }else{
                vacant += 1;
            };
            
        };
        System.out.println(vacant + " rooms are vacant");
        System.out.println(occup + " rooms are occupied");
    };    
    
    
    static void VacStatus(Room[] rooms){
        int vacant = 0;
        for(int i=0;i < rooms.length ;i++){
            if (rooms[i].isOccupied()) {
                ;
            }else{
                vacant += 1;
            };
            
        };
        System.out.println("There are: " + vacant + " vacant rooms");
    }; 
    
    
    public static void main(String[] args) { 
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        
       
        Room.sinStatus(rooms,1);
        allStatus(rooms);
        specBedStatus(rooms,3);
        vacOccStatus(rooms);
        VacStatus(rooms);
        

        
        
        
        
    }
    
    
    
}
