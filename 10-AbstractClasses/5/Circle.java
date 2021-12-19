public class Circle extends Shape
{
    private double r;
    
    Circle(double r){
        this.r = r; 
    };
    public double area(){
        return 3.14*r*r;
    };
    public double perimeter(){
        return 2*r*3.14;
    };    
    
    
    public static void main(){
        Shape c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
