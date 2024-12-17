public class Lab8_Problem1 {

    public static void main(String[] args) 
    {
      int number = 5; // Calling the value-returning method with an
      int result = doubleValue(number);
             
      System.out.println("The doubled value is: " + result); // Display the result in the main() method;
    }

    public static int doubleValue(int num) // Value-returning method that takes one parameter and doubles it
    {
        return num * 2; // Doubles the value of num
    }
}