public class Chapter
{
    private String title;
    private int pages;
    private int startPage;
    
    Chapter(String title,int pages,int startPage){
        this.title = title;
        this.pages = pages;
        this.startPage = startPage;
    };
    
    public String toString(){
        return "| " + this.title + " pages: " + this.pages + " start page: " + startPage;
    };
}
