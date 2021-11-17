public class ComputerFile
{
    private String fileType;
    private int fileSize;
    private String lokalization;
    private String name;
    
    public String displayInfo(){
      return this.fileType + " " + this.fileSize + " " + this.lokalization + " " + this.name;
    };
    
    public void setName(String name){
        this.name = name;
    };
}
