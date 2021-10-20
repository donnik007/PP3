public class Temperatures
{
    float temp;
    
    static float celsiusToKelvin(float temp) {
        return temp + 273.15f;
    };
    
    static float celsiusToFahrenheit(float temp) {
        return (temp * 1.8f) + 32f;
    };
    
    static float kelvinToCelsius(float temp) {
        return temp - 273.15f;
    };
    
    static float kelvinToFahrenheit(float temp) {
        return (temp * 1.8f) - 459.67f;
    };
    
    static float fahrenheitToKelvin(float temp) {
        return (temp + 459.67f) * 5f/9f;
    };
    
    static float fahrenheitToCelsius(float temp) {
        return (temp - 32f)/1.8f;
    };
    
    

    
    public static void main(String[] args) { 
        System.out.println("25 degress Celsius is " 
        + celsiusToKelvin(25f) + " in Kelvin and " + celsiusToFahrenheit(25f) + " in Fahrenheit");
        
        System.out.println("100 degrees Fahrenheit is " 
        + fahrenheitToKelvin(100f) + " in Kelvin and " + fahrenheitToCelsius(100f) + " in Celsius");
        
        System.out.println("0 degrees Kelvin is " 
        + kelvinToCelsius(0f) + " in Celsius and " + kelvinToFahrenheit(0f) + " Fahrenheit");
        
        
        
        
    }
}
