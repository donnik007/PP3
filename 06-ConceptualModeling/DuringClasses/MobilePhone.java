public class MobilePhone
{
    private String model;
    private String brand;
    private float yearOfProd;
    private String number;
    private boolean status;
    
    
    
    public void call(float number){
        System.out.println("calling number... : " + number);
    };
    
    public void turnOn(){
        this.status = true;
    };
    
    public void turnOff(){
        this.status = false;
    };
    
    
}
