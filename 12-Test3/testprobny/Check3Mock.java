import java.util.Arrays;

public class Check3Mock {
	
	public static void main(String[] args) {
		int total = 0;

		
		// Person
		try {
			Person p = new Person("peter","Reed");
			assert p.toString().equals("PR");
			total += 5;
			System.out.println("Person +");
		} catch (Throwable e) {
			System.out.println("Person -");
		}

		// Isogram
		try {
			assert Isogram.isogram("tv set") == true;
			assert Isogram.isogram("my tv set") == false;
			total += 5;
			System.out.println("Isogram +");
		} catch (Throwable e) {
			System.out.println("Isogram -");
		}
		
		// Logic
		try {
			boolean[] b1 = {true,false,false}; 
			boolean[] b2 = {true,false,true,false,false,false,true,false,true}; 
			assert new Logic(b1).opposite() == 0;
			assert new Logic(b2).opposite() == 4;
			total += 5;
			System.out.println("Logic +");
		} catch (Throwable e) {
			System.out.println("Logic -");
		}

		// Number
		try {
			Number n = new Number();
			n.setSystem(3); n.setValue("201");
			assert n.get10() == 10;
			n.setSystem(7); n.setValue("20174");
			assert n.get10() == -1;
			total += 5;
			System.out.println("Number +");
		} catch (Throwable e) {
			System.out.println("Number -");
		}

		// Cities
		try {
			String[] arr = {"Warszawa","Sopot","Wigry"};
			assert new Cities(arr).filter('W').cities().equals("WarszawaWigry");
			total += 5;
			System.out.println("Cities +");
		} catch (Throwable e) {
			System.out.println("Cities -");
		}

		// Pizza
		try {
			Pizza p = new Pizza("Diablo",32);
			p.setPrice();
			assert p.getPrice() == 22;
			p.setPrice(20);
			assert p.getPrice() == 20;
			assert p.discount() == 0.05f * p.getPrice();
			assert p.delivery() == 6;
			total += 5;
			System.out.println("Pizza +");
		} catch (Throwable e) {
			System.out.println("Pizza -");
		}

		// Numbers
		try {
			int[] numbers1 = {6,7,6,1,4};
			int[] numbers2 = {6,8,6,1,4};
			assert new Numbers(numbers1).ok() == true;
			assert new Numbers(numbers2).ok() == false;
			total += 5;
			System.out.println("Numbers +");
		} catch (Throwable e) {
			System.out.println("Numbers -");
		}

		

		System.out.println("Total: " + total + " pts");

	}
}


//********* Class templates

class Person {
	private String name;
	private String surname;
	Person(String n, String s){name=n; surname=s;}
	public String toString() {return "";}
}

class Isogram {
	public static boolean isogram(String s){return true;} 
}

class Logic {
	boolean[] arr;
	Logic(boolean[] a){arr=a;}
	public int opposite(){return 0;}
}

class Number {
	private int system;
	private String value;
	Number(){};
	public void setSystem(int s){system=s;}
	public void setValue(String v){value=v;}
	public int get10(){return 0;}
}

class Cities {
	String[] cities;
	Cities(String[] c){cities=c;}
	public Cities filter(char c){return new Cities(new String[1]);}
	public String cities(){return "";}  
}

class Pizza extends Food implements Extra {
	int size;
	Pizza(String n, int s){super(n);size=s;}
	public void setPrice(){}
	public float delivery(){return 0f;}
	public float delivery(int n){return 0f;}
	public float discount(){return 0f;} 
}

abstract class Food {
	private String name;
	private float price;
	Food(String s){name=s;}
	public String getName(){return name;}
	public float getPrice(){return price;}
	public void setPrice(float p){price=p;}
	public abstract void setPrice();
}

interface Extra {
	float discount();
	float delivery();
	float delivery(int n);
}

class Numbers implements Ok{
	int[] numbers;
	Numbers(int[] n){numbers=n;}
	public boolean ok(){return false;}
}

interface Ok {
	boolean ok();
}

