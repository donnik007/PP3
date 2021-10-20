public class statistic
{
    static float numberOfItems(int x, int y) {
        return y-x;
    };
    
    static float sumOfNums(int x, int y) {
        float sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
        };
        return sum;
    };
    
    static float arithMean(int x, int y) {
        return sumOfNums(x,y)/numberOfItems(x,y);
    };
    
    
    public static void main(String[] args) {
        System.out.println("Number of items in range <5,10> : " + numberOfItems(5,10));
        System.out.println("Sum of numbers in range <5,10> : " + sumOfNums(5,10));
        System.out.println("Arithmetic mean of the numbers in range <5,10> : " + arithMean(5,10));
    }
    
}
