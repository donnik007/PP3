public class Car extends Vehicle
{
    
    Car(int seats, String model, boolean isNew, float weight){
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
        Vehicle v1 = new Car(4,"mercedes",true,150f);
        v1.drive();
    };
}

