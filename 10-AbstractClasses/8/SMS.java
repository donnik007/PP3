public class SMS extends Message
{
    private User u1;
        
    SMS(String text, int phoneNumber){
        super(text);
        this.u1.setPhone(phoneNumber);   
    };
    
    public void send(){
        System.out.println("Number: "+ this.u1.getPhone());
        System.out.println("Message: " + getText());
        System.out.println("Chars in text: " + charNumber()+"\n");
    };
    
    public static void main(){
        User u1 = new User("Adam","Opopo","adam@gmail.com",123456789);
        Message m1 = new SMS("Cześć jak sie masz?",213345789);
        Message m2 = new SMS("Dobrze a co u ciebie?",123123123);
        m1.send();
        m2.send();
        
    };
}
