public class Person
{
    private String name;
    private boolean adult;
    
    Person(String name,boolean adult){
        this.name = name;
        this.adult = adult;
    };
    
    public String getName(){return this.name;};
    public boolean getAdult(){return this.adult;};
    public void setName(String name){this.name = name;};
    public void setAdult(boolean adult){this.adult = adult;};
    
}
