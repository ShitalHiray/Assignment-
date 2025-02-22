/* What error do you encounter? Why is void used in the main method?
*/
/*public class Main {
 public static int main(String[] args) {
 System.out.println("Hello, World!");
 return 0;
 }
}*/

/*Output: error:  Main method must return a value of type void in class Main3, please
define the main method as:
   public static void main(String[] args) 
 error: incompatible types: unexpected return value
 return 0;
        ^
*/

//Corrected Code:
public class Main3 {
 public static void main(String[] args) {
 System.out.println("Hello, World!");

 }
}

//Output:Hello, World!
