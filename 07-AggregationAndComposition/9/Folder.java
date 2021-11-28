import java.util.ArrayList;
public class Folder
{
    private String name;
    private ArrayList<File> files = new ArrayList<>();
    
    Folder(String name) {
        this.name = name;
    };
    public String getName() {return this.name;};
    public ArrayList<File> getFiles() {return this.files;};
    public void setName(String Name) {this.name = name;};
    public void setFiles(ArrayList<File> files) {this.files = files;};
    
    public void addFile(File fileName){
        this.files.add(fileName);
    };
    public void removeFile(String fname){
        this.files.removeIf(File -> File.getName() == fname);
    };
    
    public void display(){
        System.out.println("Folder name: " + this.name);
        for (File i : this.files) {
            System.out.println("File: " + i.toString());
        }
        System.out.println("----------------");
    };
    
    
    public static void main(){
        Folder folder1 = new Folder("folder1");
        
        File f1 = new File("file1");
        folder1.addFile(f1);
        File f2 = new File("file2");
        folder1.addFile(f2);
        
        folder1.display();
        
        File f3 = new File("file3");
        folder1.addFile(f3);
        
        folder1.display();
        
        folder1.removeFile("file2");
        folder1.display();
        
        
    
    };
}
