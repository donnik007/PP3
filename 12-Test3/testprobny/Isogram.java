public class Isogram
{
    public static boolean isogram(String x){
        for(int i=0;i<x.length();i++){
            String y = x.substring(i,i+1);
            for(int j=0;j<x.length();j++){
                if(j==i){
                    ;
                }else{
                    if(y.equals(x.substring(j,j+1))){
                        return false;
                    };
                };
            };
        };
        return true;
    };
    
    
    
    
    public static void main(){
        System.out.println(Isogram.isogram("red sun"));
        System.out.println(Isogram.isogram("blue water"));
        System.out.println(Isogram.isogram("BLUE water"));
        System.out.println(Isogram.isogram("my blue water"));
    };

}
