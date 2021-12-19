public class User
{
    private String fname;
    private String lname;
    private String email;
    private int phone;
    
    public String getFname(){return this.fname;};
    public String getLname(){return this.lname;};
    public String getEmail(){return this.email;};
    public int getPhone(){return this.phone;};
    
    public void setFname(String fname){this.fname = fname;};
    public void setLname(String lname){this.lname = lname;};
    public void setEmail(String email){this.email = email;};
    public void setPhone(int phone){this.phone = phone;};
    
    User(String fname,String lname,String email,int phone){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
    };
    
}
