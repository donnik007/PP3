public class Person
{
    String name;
    double weight;
    int height;
    
    Person(String name){
        this.name = name;
    };
    Person(String name, double weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    };
    
    void setWeightAndHeight(double weight, int height){
        this.weight = weight;
        this.height = height;
    };
    
    double calculateBMI(){
        return (weight/ (height/100.0f)*(height/100.0f) );
    };
    
    void displayRecord(){
        System.out.println("Imie: " + name);
        System.out.println("Waga: " + weight);
        System.out.println("Wzrost: " + height);
        System.out.println("BMI: " + calculateBMI());
    };
    
    public static void main(String[] args) { 
        
        
    }
}
