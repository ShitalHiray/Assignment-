/* What exception is thrown? Why does it occur?*/

/*public class Main13 {
 public static void main(String[] args) {
 String str = null;
 System.out.println(str.length());
 }
}
*/
/* Output: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Main13.main(Main13.java:6) */


//Corrected Code:

public class Main13 {
 public static void main(String[] args) {
 String str = null;

if (str != null) {

    System.out.println(str.length());

} else {

    System.out.println("String is null");

} 
}
}
//Output: String is null