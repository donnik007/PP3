public class Competitors
{
    private int[] judge;
    private String name;
    private float score = 0;
    
    public Competitors(int[] judge, String name) {
        this.judge = judge;
        this.name = name;
    };
    
    
    public float getFinal(){
        float max = judge[0];
        float min = judge[0];
        for(float i : judge){
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
                
        };
        
        
        for(float i : judge){
            this.score += i;
                
        };

        this.score = this.score - max;
        this.score = this.score - min;
        
        return this.score/3;
    }
    
    
    
    public static void main(){
        int[] a1 = {2,3,5,1,3};
        int[] a2 = {3,1,2,1,1};
        int[] a3 = {1,4,4,1,1};
        Competitors p1 = new Competitors(a1,"Tom");
        Competitors p2 = new Competitors(a2,"Adam");
        Competitors p3 = new Competitors(a3,"Michał");
        System.out.println(p1.name + ", score: " + p1.getFinal());
        System.out.println(p2.name + ", score: " + p2.getFinal());
        System.out.println(p3.name + ", score: " + p3.getFinal());
    
    }
}

