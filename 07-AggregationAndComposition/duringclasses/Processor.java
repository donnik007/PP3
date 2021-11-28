public class Processor
{
    private int power;
    private String producent;
    private String model;
    
    Processor(int power,String producent,String model){
        this.power = power;
        this.producent = producent;
        this.model = model;
    }
    public String toString(){
    
        return this.power +"  "+this.producent+"  " +this.model;
    };
    
}
