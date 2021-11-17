public class BankAccount
{
    private String owner;
    private String accNumber;
    private float balance = 0;
    private String password;
    
    BankAccount(String owner, String accNumber,float balance ,String password){
        this.owner = owner;
        this.accNumber = accNumber;
        this.balance = balance;
        this.password = password;
        
        
    };
    
    public void withDraw(float number){
        if(number > 500){
            System.out.println("...you can withdraw no more than PLN 500 from your account at one time...");
            System.out.println("...withdraw process stoped...");
        }else if(balance < number){
            System.out.println("Ballance is less than withdraw amount!!!");
            System.out.println("...withdraw process stoped...");
        }else{
            this.balance -= number;
        };
        
    };
    
    public void deposit(float number){
        this.balance += number;
    };
    
    public void displayBalance(){
         System.out.println(this.balance);
    };
    
    public void login(String owner, String password){
        if(this.owner == owner && this.password == password) {
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
        };
    };
    
    public static void main(){
        BankAccount b1 = new BankAccount("Tomasz Kot","123432543245",0,"Kotek123");
        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withDraw(300);
        b1.displayBalance();
        b1.withDraw(501);
        b1.displayBalance();
        b1.withDraw(400);
        b1.displayBalance();
        b1.withDraw(400);
        b1.displayBalance();
    }
    
}
