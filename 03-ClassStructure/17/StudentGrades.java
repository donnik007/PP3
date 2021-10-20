import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class StudentGrades { 
    
    String name; 
    double[] grades; 
    
    StudentGrades(String name, double[] grades) { 
        this.name = name; 
        this.grades = grades; 
    } 
    
    StudentGrades(String name, int numberOfGrades) {
        this.name = name;
        this.grades = new double[numberOfGrades];
        double[] options = {2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5};
        for (int i=0;i<numberOfGrades;i++) {
            grades[i] = options[new Random().nextInt(8)];
        };
        
    
    }
    
    StudentGrades(String name) { 
        this.name = name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe ocen: ");
        int n = scan.nextInt();
        double[] array = new double[n];
        System.out.println("Podaj oceny: ");
        for(int i=0; i<n; i++) {   
            array[i] = scan.nextDouble();  
        };
        this.grades = array;
        
        
    } 
    
    
    static double calLowGrade(double[] grades) {
        double min = grades[0];
        for (int i=0; i < grades.length; i++) {
            if (grades[i] < min) { min = grades[i]; };
        };
        return min;
    };
    
    static double calHighGrade(double[] grades) {
        double max = grades[0];
        for (int i=0; i < grades.length; i++) {
            if (grades[i] > max) { max = grades[i]; };
        };
        return max;
    };
    
    static int calNumGrade(double[] grades) {
        return grades.length;
    };
    
    static double calAveGrade(double[] grades) {
        double sum = 0;
        for(int i=0; i < grades.length; i++){
            sum = sum + grades[i];
        };
        
        return sum / grades.length;
    };    
    
    void display() {
        System.out.println("Imie: " + name);
        System.out.println("Oceny: " + Arrays.toString(grades));
        System.out.println("Liczba ocen: " + calNumGrade(grades));
        System.out.println("Najnizsza ocena: " + calLowGrade(grades));
        System.out.println("Najwyzsza ocena: " + calHighGrade(grades));
        System.out.println("Średnia ocen: " + calAveGrade(grades));
    };
    
    
    
    public static void main(String[] args) { 
        double[] s1g = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] s2g = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s1 = new StudentGrades("Amanda", s1g);
        StudentGrades s2 = new StudentGrades("James",s2g);
        StudentGrades s3 = new StudentGrades("Dominik",33);
        StudentGrades s4 = new StudentGrades("Bart");
        
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
