public class Product
{
    private String productName;
    private boolean isVege;
    
    public void setProductName(String name){
        this.productName = name;
    };
    
    public void setVege(Boolean status){
        this.isVege = status;
    };
    
    public boolean getVege(){
        return this.isVege;
    };
    
    public String getName(){
        return this.productName;
    };
    
    static void main(){
        Product p1 = new Product();
        p1.setProductName("Kurczak");
        p1.setVege(false);
        
        System.out.println(p1.getName());
        System.out.println(p1.getVege());
    
    
    }
}
