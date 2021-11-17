
public class Pizza
{
    private String type;
    private String name;
    private String cooker;
    private float price;
    
    public Pizza(String type, String name, String cooker, float price){
        this.type = type;
        this.name = name;
        this.cooker = cooker;
        this.price = price;
    };
    
    public String getName(){return this.name;};
    public void setName(String name){this.name = name;};
    public String getType(){return this.type;};
    public void setType(String type){this.type = type;};
    public float getPrice(){return this.price;};
    public void setPrice(float price){this.price = price;};
    public String getCooker(){return this.cooker;};
    public void setCooker(String cooker){this.cooker = cooker;};
    public void getDiscont(float disco){
        this.price = this.price - disco;
    
    };
    public String info(){return this.name + " " + this.type + " " + this.price + " " + this.cooker;};


    public static void main(){
        Pizza p1 = new Pizza("Włoska","Capriciosa","Adam Z",32.30f);
        Pizza p2 = new Pizza("Francuska","Vegańska","Adrianna A",42.40f);
        
        System.out.println(p1.info());
        System.out.println(p2.info());
        p1.getDiscont(10.30f);
        System.out.println(p1.info());
        
    
    };


}
