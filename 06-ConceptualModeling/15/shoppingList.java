import java.util.ArrayList;
import java.util.Scanner;
public class shoppingList
{
    private ArrayList<String> products = new ArrayList<String>();
    
    public void display(){
        for(String el : this.products){
            System.out.println(el);
        }
    };
    
    public void add(String prod){
        this.products.add(prod);
    };
    
    
    public void displayNum(){
        System.out.println(this.products.size());
    };
    
    public static void main(){
        Scanner scan= new Scanner(System.in);
        
        shoppingList s1 = new shoppingList();
        s1.display();
        s1.displayNum();
        s1.add("Mleko");
        s1.add("Chelb");
        s1.add("Woda");
        s1.display();
        s1.displayNum();
        s1.add("Pepsi");
        s1.display();
        s1.displayNum();
        
        s1.add(scan.nextLine());
        s1.display();
        s1.displayNum();
    
    };
}
