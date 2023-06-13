import java.util.Scanner; 

public class MyClass {

    public static void main(String[] args){
        Maths math = new Maths(); 

        Scanner userInput = new Scanner(System.in); 

        System.out.println("Welcome to the Java Calculator"); 
        System.out.println("==============================");

        System.out.print("Enter the first number: "); 
        int num1 = userInput.nextInt(); 

        System.out.print("Enter the second number: "); 
        int num2 = userInput.nextInt(); 

        System.out.print("Enter operation to perform (+,-,x,/):"); 
        String operation = userInput.next(); 

        if (operation.equals("+"))
            System.out.println(math.Add(num1,num2)); 
        
        else if (operation.equals("-"))
            System.out.println(math.Subtract(num1, num2)); 

        else if (operation.equals("x"))
            System.out.println(math.Multiply(num1, num2)); 

        else if (operation.equals("/"))
            System.out.println(math.Divide(num1, num2)); 
        
        else 
            System.out.println("The operation is not valid."); 
    }
}
