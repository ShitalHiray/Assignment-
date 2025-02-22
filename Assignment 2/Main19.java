/* What runtime exception is thrown? Why does division by zero cause an issue in Java?*/

/*public class Main19 {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
}*/

/*Output: Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main19.main(Main19.java:7) */

//Corrected Code:
public class Main19 {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;

 try {
            System.out.println(a / b); 
        }
        catch (ArithmeticException e) {
            
            System.out.println(
                "Divided by zero operation cannot possible");
        }
 }
}

//Output: Divided by zero operation cannot possible