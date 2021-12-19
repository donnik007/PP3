public class Email extends Message
{
    private String subject;
    private User u1;
    
    public void setSubject(String subject){this.subject = subject;};
    public String getSubject(){return this.subject;};
    
    Email(String text, String subject, String recipient){
        super(text);
        this.subject = subject;
        this.u1.setEmail(recipient);  
    };
    
    public void send(){
        System.out.println("Recipient: "+ this.u1.getEmail());
        System.out.println("Subject: "+ getSubject());
        System.out.println("Message: " + getText());
        System.out.println("Chars in text: " + charNumber()+"\n");
    };
    
    public static void main(){
        User u1 = new User("Adam","Opopo","adam@gmail.com",123456789);
        Message em1 = new Email("Cześć jak sie masz?","Opłata","Adam Z.");
        Message em2 = new Email("Dobrze a co u ciebie?","Opłata","Tomasz B.");
        em1.send();
        em2.send();
        
    };
}
