/*What error occurs? Why must variables be declared? */
/*public class Main6 {
 public static void main(String[] args) {
 int x = y + 10;
 System.out.println(x);
 }
} */
 /*Output: error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main6 */

//Corrected code:
public class Main6 {
 public static void main(String[] args) {
 int y=0;
	int x = y + 10;
 System.out.println(x);
 }
} 

//Output: 10