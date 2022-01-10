public class Cities
{
    private String[] names;
    
    
    Cities(String[] names){
        this.names = names;
    };
    
    public Cities filter(char charakter){
        for(int i=0;i<this.names.length;i++){
            if(this.names[i].charAt(0) == charakter){
            ;
            }else{
            names[i] = "";
            };
        };
        Cities obj = new Cities(names);
        return obj;
    };
    
    public String cities(){
        String txt = "";
        for(int i=0;i<names.length;i++){
            txt = txt + names[i];
        };
        return txt;
    };
    
    public static void main(){
        Cities l = new Cities(new String[] {"Warszawa","Sopot","Kielce","Szczecin"});
        System.out.println(l.filter('S').cities());
 
        
    };
}
