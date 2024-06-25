import java.util.*;
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    //Overloaded Constructor
    public ComplexNumber(String complexNumber) {
        String[] parts = complexNumber.split("\\+");
        this.real = Double.parseDouble(parts[0].trim());
        this.imaginary = Double.parseDouble(parts[1].replaceAll("i", "").trim());
    }
     
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    public String toString() {
        if(imaginary >= 0){
            return real + " + " + imaginary + "i";
        } 
        else{

            return real + " - " + (-imaginary) + "i";
        }

    }
    
    public static void main(String[] args) {
    
        ComplexNumber c1 = new ComplexNumber(2, 3);
        System.out.println("Complex Number 1: " + c1);  
   
        ComplexNumber c2 = new ComplexNumber("5 + 7i");
        System.out.println("Complex Number 2: " + c2);  
        
        ComplexNumber sum = c2.add(c1);
        System.out.println("Sum: " + sum);  
    }
}