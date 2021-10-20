public class InternetDevice
{
    String name;
    boolean connected = false;
    static int connectedDevices = 0;
    
    InternetDevice(String name) {
        this.name = name;
    };
    
    void connect() {
        connected = true;
        connectedDevices = connectedDevices + 1;
    };
    
    void disconnect() {
        connected = false;
        connectedDevices = connectedDevices - 1;
    };
    
    String isConnected() {
        if (connected) {
            return "device is connected";
        }else{
            return "device is not connected";
        }
    };
    
    void displayStatus() {
        System.out.println("Device name : " + name);
        System.out.println("Connection Status : " + isConnected());
    };
    
    static void displayConnections() {
        System.out.println("Number of connections : " + connectedDevices);
    };
    
    public static void main(String[] args) { 
        InternetDevice dev1 = new InternetDevice("Iphone");
        InternetDevice dev2 = new InternetDevice("Macbook");
        InternetDevice dev3 = new InternetDevice("Ipad");
        InternetDevice dev4 = new InternetDevice("AirPods");
        InternetDevice dev5 = new InternetDevice("MacPC");
        
        dev1.connect();
        dev2.connect();
        dev3.connect();
        
        dev1.displayStatus();
        dev2.displayStatus();
        dev3.displayStatus();
        dev4.displayStatus();
        dev5.displayStatus();
        
        displayConnections();
        
    }
}
