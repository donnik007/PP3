public abstract class Vehicle
{
    private int seats;
    private String model;
    private boolean isNew;
    private float weight;
    
    Vehicle(int seats, String model, boolean isNew, float weight){
        this.seats = seats;
        this.model = model;
        this.isNew = isNew;
        this.weight = weight;
    };
    
    public void setSeats(int seats){this.seats = seats;};
    public int getSeats(){return this.seats;};
    
    public void setModel(String model){this.model = model;};
    public String getModel(){return this.model;};
    
    public void setIsNew(boolean isNew){this.isNew = isNew;};
    public boolean getIsNew(){return this.isNew;};
    
    public void setWeight(float weight){this.weight = weight;};
    public float getWeight(){return this.weight;};
    
    public abstract void drive();
}
