public abstract class Food
{
    private String name;
    protected float price;
    
    public Food(String s){
        this.name = s;
    };
    
    public String getName(){return this.name;};
    
    public float getPrice(){return this.price;};
    
    abstract void setPrice(float f);
    
    public void setName(String name){this.name = name;};
    
}
