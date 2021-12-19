public class Truck extends Vehicle
{
    
    Truck(int seats, String model, boolean isNew, float weight){
        super(seats,model,isNew,weight);
    };
    
    public void drive(){
        System.out.println("You are driving a car!");
        System.out.println("Seats: " + getSeats());
        System.out.println("model: " + getModel());
        System.out.println("isNew: " + getIsNew());
        System.out.println("weight: " + getWeight());
        
    };
    
    public static void main(){
        Vehicle v1 = new Truck(3,"Man",false,15323420f);
        v1.drive();
    };
}

