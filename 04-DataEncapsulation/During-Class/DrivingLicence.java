public class DrivingLicence
{
    private String driversName;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int drivingLicenceNumber;
    private int yearOfissue;
    private String drivingLicenceCategory;
    
    DrivingLicence(String driversName, String surname,String address,String postalCode,String city,int drivingLicenceNumber, int yearOfissue,String drivingLicenceCategory){
        this.driversName = driversName;
        this.surname = surname;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.yearOfissue = yearOfissue;
        this.drivingLicenceCategory = drivingLicenceCategory;
    };
    
    public void setName(String driversName){
        String low = driversName.toLowerCase();
        String cap = low.substring(0, 1).toUpperCase() + low.substring(1);
        this.driversName = cap;
    };
    public void setSurname(String surname){this.surname = surname;};
    public void setAddress(String address){this.address = address;};
    public void setPostalCode(String postalCode){this.postalCode = postalCode;};
    public void setCity(String city){this.city = city;};
    public void setDrivingLicenceNumber(int drivingLicenceNumber){this.drivingLicenceNumber = drivingLicenceNumber;};
    public void setYearOfissue(int yearOfissue){
        if (yearOfissue >= 1980 && yearOfissue <= 2021) {
            this.yearOfissue = yearOfissue;
        };
    };
    public void setDrivingLicenceCategory(String drivingLicenceCategory){this.drivingLicenceCategory = drivingLicenceCategory;};
    
    public String getName(){return this.driversName;};
    public String getSurName(){return this.surname;};
    public String getAddress(){return this.address;};
    public String getPostalCode(){return this.postalCode;};
    public String getCity(){return this.city;};
    public int getDrivingLicenceNumber(){return this.drivingLicenceNumber;};
    public int getYearOfissue(){return this.yearOfissue;};
    public String getDrivingLicenceCategory(){return this.drivingLicenceCategory;};
    
    public String toString() {
        return getName() + " " + getSurName() + " " + getAddress() + " " + getPostalCode() + " " + getCity() + " " + getDrivingLicenceNumber() + " " + getYearOfissue() + " " + getDrivingLicenceCategory() ;
    };
    
    public void displayInfo(){
        System.out.println("Imie i Nazwisko : " + getName() + " " + getSurName());
        System.out.println("Adress : " + getAddress() + " " + getPostalCode() + " " +getCity());
        System.out.println("Numer licencji : " + getDrivingLicenceNumber());
        System.out.println("Rok wydania : " + getYearOfissue());
        System.out.println("Kategoria : " + getDrivingLicenceCategory());
        System.out.println("----------------------");
    };
    
    static void main(){
        DrivingLicence d1 = new DrivingLicence("Adam","Maximus", "Fiołkowa 4","30-999","Warszawa",123123,2012,"B");
        d1.displayInfo();

        d1.setName("Andzrej");
        d1.setSurname("KOWALSKI");
        d1.setAddress("wiejska 4");
        d1.setPostalCode("11-001");
        d1.setCity("Kraków");
        d1.setDrivingLicenceNumber(222333);
        d1.setYearOfissue(1999);
        d1.setDrivingLicenceCategory("A");
        d1.displayInfo();
        System.out.println(d1);
        d1.setYearOfissue(1700);
        System.out.println(d1);
        d1.setName("SYEORRHJUQSsdfqwDSDFW");
        System.out.println(d1);
        
        
        
        
    };
}


