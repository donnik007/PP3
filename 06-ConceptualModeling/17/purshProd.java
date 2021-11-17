public class purshProd
{
    private String prod;
    private String buyer;
    
    public void setProd(String prod){this.prod = prod;};
    public String getProd(){return this.prod;};
    
    public void setBuyer(String buyer){this.buyer = buyer;};
    public String getBuyer(){return this.buyer;};
    
    public purshProd(String buyer, String prod){
        this.prod = prod;
        this.buyer = buyer;
    };
    
    public static void main() {
        purshProd t1 = new purshProd("Adam Z","Masło");
        System.out.println(t1.getBuyer());
        System.out.println(t1.getProd());
        t1.setProd("Tom D");
        t1.setBuyer("Woda");
        System.out.println(t1.getBuyer());
        System.out.println(t1.getProd());
        
    };
}