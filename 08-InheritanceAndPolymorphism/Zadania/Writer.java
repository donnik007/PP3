public class Writer
{
    private String name;
    private String surname;
    private String genre;
    
    
    Writer(String name, String surname,String genre){
        this.name = name;
        this.surname = surname;
        this.genre = genre;
        
    };
    
    public void setName(String name){this.name = name;};
    public void setSurname(String surname){this.surname = surname;};
    public void setGenre(String genre){this.genre = genre;};
    public String getName(){return this.name;};
    public String getSurname(){return this.surname;};
    public String getGenre(){return this.genre;};
    
    public String toString(){
        return " Name: "+this.name+" Surname: "+this.surname+" Age: "+this.genre;
    };
}

