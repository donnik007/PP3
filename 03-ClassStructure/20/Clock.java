public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        this.hour = 0;
        this.minute = 0;
    };
    
    Clock(int hour,int minute) {
        this.hour = hour;
        this.minute = minute;
    };
    
    void setClock(int hour,int minute) {
        this.hour = hour;
        this.minute = minute;
    };
    
    void setClock() {
        this.hour = 0;
        this.minute = 0;
    };
    
    void displayTime() {
        System.out.println(hour + ":" + minute);
    };
    
    void addOneMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            this.hour += 1;
            if (this.hour == 24) {
                this.hour = 0;
            };
        }else{
            this.minute += 1;
        };
        
        
        if (this.alarmHour == this.hour && this.alarmMinute == this.minute) {
            runAlarm();
        };
    };

    void setAlarm(int hour, int minute) {
        this.alarmHour = hour;
        this.alarmMinute = minute;
    };
    
    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    
    };
    
    
    
    
    public static void main(String[] args) { 
        Clock c1 = new Clock(12,47);
        c1.setAlarm(23,59);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
    }    
    
    
    
}
