public class Writer
{
    private String name;
    private String surname;
    private int age;
    private String[] books;
    
    Writer(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        
    };
    
    public void write(){};
    public void read(){};
    public String toString(){
        return " Name: "+this.name+" Surname: "+this.surname+" Age: "+this.age;
    };
}
