public class MyArrays
{
    
    
    public static int max(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            };
        };
        return max;
    };
    
    
    public static int odd(int[] array){
        int ilosc = 0;
        for(int i = 0; i<array.length; i++) {
            if(array[i] % 2 != 0) {
                ilosc = ilosc + 1;
            };
        };
        return ilosc;
    };
    
    public static void main(){
        int[] ar1 = {1,2,3,4,6,8,43,3};
        MyArrays a1 = new MyArrays();
        
        System.out.println(a1.max(ar1));
        System.out.println(a1.odd(ar1));
    }
}
