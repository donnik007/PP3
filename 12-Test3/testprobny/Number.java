import java.lang.Math;
public class Number
{
    private int system;
    private String value;
    
    public void setSystem(int system){this.system = system;};
    public void setSystem(String value){this.value = value;};
    
    Number(int system, String value){
        this.system = system;
        this.value = value;
    };
    
    public int get10(){
        int sum = 0;
        
        for(int i=0;i<this.value.length();i++){
            sum += Integer.parseInt(value.substring(i,i+1)) * Math.pow(system,this.value.length()-i-1);
        }
        
        return sum;
    };
    
    public static void main(){
    Number l1 = new Number(5,"101");
    Number l2 = new Number(8,"10283");

    System.out.println(l1.get10());
    System.out.println(l2.get10());
    
    };
    
}
