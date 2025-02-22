/* What happens when you compile and run this code? Is method overloading allowed?*/

/*public class Main10 {
 public void display() {
 System.out.println("No parameters");
 }
 public void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
}
*/
/*Output:error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main10.java:12: error: non-static method display(int) cannot be referenced from a static context
 display(5); */

//Corrected Code:

public class Main10 {
 public static void display() {
 System.out.println("No parameters");
 }
 public static void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
}

/*Output:No parameters
With parameter: 5 */