/* What happens when you compile and run this code? Why is String[] args needed?*/
/*
public class Main4 {
 public static void main() {
 System.out.println("Hello, World!");
 }
}
*/

/*Output:Error: Main method not found in class Main4, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application */

//Corrected code:
public class Main4 {
   public static void main(String[] args){
 System.out.println("Hello, World!");
 }
}

//Output:Hello, World!