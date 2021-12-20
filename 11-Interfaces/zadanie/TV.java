public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume
{
    private boolean status = false;
    private int channel = 1;
    private int volume;
    private String[] channelName = new String[99];
    
    TV(){
        this.channelName[0] = "TVP1";
        this.channelName[1] = "TVP2";
        this.channelName[2] = "TVP3";
        this.channelName[3] = "TVP4";
        this.channelName[4] = "TVP5";
        this.channelName[5] = "TV N";
        this.channelName[6] = "TVN24";
        this.channelName[7] = "Polsat";
        this.channelName[8] = "EskaTV";
        this.channelName[9] = "PulsTV";
    };
    
    public void setStatus(boolean status){this.status=status;};
    public boolean getStatus(){return this.status;};
    
    public int getChannel(){return this.channel;};
    
    public void displayStations(){
        for(int i=0;i<channelName.length;i++){
            System.out.println(i+1 + " Name: "+ channelName[i]);
        };
    };
    
    public void display(){
        if(this.status){
            System.out.println("status is: " + getStatus());
            System.out.println("channel is: " + getChannel());
            System.out.println("channel Name is: " + this.channelName[getChannel()-1]);
            System.out.println("volume is: " + this.volume);
        }else{
            System.out.println("TV is OFF!!!!");
        };
        
    }
    
    public void on(){
        this.status = true;
        this.channel = 1;
        this.volume =1;
    };
    public void off(){this.status = false;};
    
    public void channelUp(){
        if(this.status){
            if(this.channel == 99){
                System.out.print("Kanał 99 nie można przejść wyżej!");
            }else{
                this.channel += 1;
            };
        }else{
            System.out.println("TV is OFF!!!!");
        };
    };
    
    public void channelDown(){
        if(this.status){
            if(this.channel == 1){
                System.out.print("Kanał 1 nie można przejść niżej!");
            }else{
                this.channel -= 1;
            };
        }else{
            System.out.println("TV is OFF!!!!");
        };   
    };
    
    public void setChannel(int channelNo){
        if(this.status){
            if(channelNo <= 99 && channelNo >= 1){
                this.channel = channelNo;
            }else{
                System.out.println("Kanał może być tylko z zakresu 1 do 99!");
            };
        }else{
            System.out.println("TV is OFF!!!!");
        };
    };
    
    public void volumeUp(){
        if(this.status){
            if(this.volume == 10){
                System.out.print("volume 10 nie można przejść wyżej!");
            }else{
                this.volume += 1;
            };
        }else{
            System.out.println("TV is OFF!!!!");
        };
    };
    
    public void volumeDown(){
    if(this.status){
            if(this.volume == 1){
                System.out.print("volume 1 nie można przejść niżej!");
            }else{
                this.volume -= 1;
            };
        }else{
            System.out.println("TV is OFF!!!!");
        }; 
    };
    
    
    public static void main(){
        TV tv1 = new TV();
        
        tv1.on();
        tv1.displayStations();
        tv1.display();
        
    };
    
}
