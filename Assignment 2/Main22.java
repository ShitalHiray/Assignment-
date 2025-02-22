/* What syntax error occurs? Can a method be declared inside another method?*/

/*public class Main22 {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
}
*/
/*Output:  error: illegal start of expression
 static void displayMessage() {
 ^
Main22.java:9: error: class, interface, enum, or record expected
} */

//Corrected Code: 
public class Main22 {
   public static void main(String[] args) {

        displayMessage(); 
    }

    static void displayMessage() {

        System.out.println("Message");
    }
 
}

//Output: Message