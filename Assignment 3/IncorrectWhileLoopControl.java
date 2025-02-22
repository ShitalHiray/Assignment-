/* Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? */
/*public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
}
*/

/*Output:  error: incompatible types: int cannot be converted to boolean
 while (num = 10) { */

//Corrected Code:

public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
 System.out.println(num);
 num--;
 }
 }
}

//Output: 10
