public class Lamps
{
    boolean status;
    
    void switchOn(){
        status = true;
    };
    
    void switchOff(){
        status = false;
    };
    
    void lampStatus(){
        
        if (status){
            System.out.println("Lamp is ON !");
        }else{
            System.out.println("Lamp is OFF !");
        };
        
    };
}
