/* What compilation error do you see? Why does Java enforce type safety?*/

/*public class Main7 {
 public static void main(String[] args) {
 int x = "Hello";
 System.out.println(x);
 }
}*/

/*Output: error: incompatible types: String cannot be converted to int
 int x = "Hello"; */

//Corrected Code
         public class Main7 {
 public static void main(String[] args) {
String x = "Hello";
 System.out.println(x);
 }
}

//Output:Hello