/* What compilation error occurs? Why does Java enforce data type constraints?*/

/*public class Main14 {
 public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
}*/

/* Output: error: incompatible types: String cannot be converted to double
 double num = "Hello"; */

//Corrected Code:
public class Main14 {
 public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }
}

//Output:Hello