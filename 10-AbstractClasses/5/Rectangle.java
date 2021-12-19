public class Rectangle extends Shape
{
    private double a;
    private double b;
    
    Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    };
    
    public double area(){
        return a*b;
    };
    public double perimeter(){
        return 2*a+2*b;
    };
    
    public static void main(){
        Shape r = new Rectangle(2,5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
