import java.util.Arrays;
import java.io.Console;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter triangle length:");
    Integer inputA = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter triangle base:");
    Integer inputB = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter triangle hypotenuse:");
    Integer inputC = Integer.parseInt(myConsole.readLine());
    Triangle userTriangle = new Triangle(inputA, inputB, inputC);

if (userTriangle.checkType()) {
  System.out.println("its an equilateral");
} else if (userTriangle.checkType()){
  System.out.println("its an isosceles");
} else {
  System.out.println("its a scalene");
}


  }
}
