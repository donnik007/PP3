public class Counter
{
    int licznik = 0;
    
    public void increase(){this.licznik = this.licznik + 1;};
    public void decrease(){this.licznik = this.licznik - 1;};
    
    public void increase(int n){this.licznik = this.licznik + n;};
    public void decrease(int n){this.licznik = this.licznik - n;};
    
    public int value(){return this.licznik;};
    
}
