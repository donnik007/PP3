import java.lang.Math;
public class Triangle extends Shape
{
    private double a;
    private double b;
    private double c;
    
    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    };
    
    public double area(){
        return Math.sqrt(perimeter()/2 * (perimeter()/2-a) * (perimeter()/2-b) * (perimeter()/2-c));
    };
    public double perimeter(){
        return a+b+c;
    };    
    
    public static void main(){
        Shape t = new Triangle(4,6,3);
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }
}
