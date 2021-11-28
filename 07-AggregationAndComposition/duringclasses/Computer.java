public class Computer
{
    private String disc;
    private int rom;
    private Processor proc;
    private int ram;
    
    Computer(String disc,int rom,Processor proc,int ram){
        this.disc = disc;
        this.rom = rom;
        this.proc = new Processor(7,"Intel","i7");
        this.ram = ram;
        
    };
    
    public void turnOn(){};
    public void turnOff(){};
    public String toString(){
        return "disc: "+this.disc+" rom: "+this.rom+" ram "+this.ram+"\nproc: "+this.proc.toString();
    };
}
