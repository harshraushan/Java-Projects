//Java-Projects
//Java Simple Calculator
import Java.util.*; // importing the util package which 
public class Calculator{
  public static void main(String[]args){
    double a, b, result;
    char ArithmeticSymbol;
    Scanner CalculatorObject = new Calculator(System.in);
    System.out.println("Enter the first number : ");
    a=CalculatorObject.nextDouble();
    System.out.println("Enter the first number : ");
    b=CalculatorObject.nextDouble();
    System.out.println("Enter + for addition,- for sustraction,* for multiplication and / for division");
    ArithmeticSymbol=CalculatorObject.next().charAt(0);
    switch()
    {
        Case '+':
        result= a+b;
        break;
        Case '-':
        result=a-b;
        break;
        Case '*':
        result=a*b;
        break;
        Case '/':
        result=a/b;
        break;
      default:
        System.out.println("Invalid input : ");
        return;
    }
    Syatem.out.println(a+" "+ArithmeticSymbol+" "+ b + "="+result);
        

        
        
    }
    
    
}
