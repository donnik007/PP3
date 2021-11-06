public class Mebel
{
    private String rodzaj;
    private String nazwa;
    private boolean czyNowy;
    private int wiek;
    
    public void setRodzaj(String rodzaj){this.rodzaj=rodzaj;};
    public void setNazwa(String nazwa){this.nazwa=nazwa;};
    public void setStan(boolean czyNowy){this.czyNowy=czyNowy;};
    public void setWiek(int wiek){this.wiek=wiek;};
    
    public String getRodzaj(){return this.rodzaj;};
    public String getNazwa(){return this.nazwa;};
    public boolean getStan(){return this.czyNowy;};
    public int getWiek(){return this.wiek;};
}
