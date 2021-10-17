public class Rect
{
    float dimA;
    float dimB;
    
    void info() {
        float perm = 2*dimA + 2*dimB;
        float surf = dimA * dimB;
        
        System.out.println("Dimensions are: " + dimA + " and " + dimB);
        System.out.println("Permiter is: " + perm);
        System.out.println("Surface is: " + surf);
    };
}
