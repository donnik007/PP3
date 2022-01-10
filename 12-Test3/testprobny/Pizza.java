public class Pizza extends Food implements Extra
{
    private int size;
    public Pizza(String s,int i){
        super(s);
        this.size= i;
    };
    
    public void setPrice(float f){
        this.price = this.size - 10;
    };
    
    public float discount(){
        if(this.price >= 30){
            return this.price - this.price*0.3f;
        };
        return 0f;
    };
    
    public float delivery(){
        if(this.size >= 50){
            return 8;
        }else{
            return 6;
        }
    };
    
    public float delivery(int tip){
        if(this.size >= 50){
            return 8 + tip;
        }else{
            return 6 + tip;
        }
    };
}
