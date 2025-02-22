/* What error occurs when compiling this code? How should you handle different data types
in operations?*/

/*public class Main15 {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 }
}*/

/*Output:  error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;*/


//Corrected Code:
public class Main15 {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
}

//Output:15.5
