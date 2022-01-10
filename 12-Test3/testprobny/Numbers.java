public class Numbers implements Ok
{
    private int[] array;
    
    public Numbers(int[] array){this.array = array;};
    
    public boolean ok(){
        boolean test = true;
        
        for(int i=0;i<array.length;i++){
            if(i % 2 == 0 && array[i] % 2 == 0){
                ;
            }else if(i % 2 != 0 && array[i] % 2 != 0){
                ;
            }else{test = false;};
        };
        
        return test;
    };
    
    public static void main(){
        Numbers n = new Numbers(new int[] {6,7,6,1,4});
        Numbers m = new Numbers(new int[] {2,5,2,8,4});
            
        System.out.println(n.ok());
        System.out.println(m.ok());
    };
}
