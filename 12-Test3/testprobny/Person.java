public class Person
{
    private String name;
    private String surname;
    
    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    };
    
    public String toString(){
        return this.name.substring(0,1).toUpperCase() + this.surname.substring(0,1).toUpperCase();
    };
    
    public static void main(){
        Person p1 = new Person("adam","mak");
        System.out.println(p1);
    
    };
    
}
