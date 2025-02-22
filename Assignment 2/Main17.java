/* What compilation error occurs? Why is the ** operator not valid in Java?*/

/*public class Main17 {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
}*/

/*Output: error: illegal start of expression
 int result = a ** b; */

//Corrected Code:
public class Main17 {
 public static void main(String[] args) {
    int a = 10;

        int b = 5;

        double result = Math.pow(a, b); 
        System.out.println(result); 
 }
}

//Output:100000.0