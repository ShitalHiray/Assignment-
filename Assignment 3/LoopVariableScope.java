/* Error to investigate: Why does the variable 'x' cause a compilation error? How does scope */
/*
public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}
*/
/*Output: error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopVariableScope */

//Corrected Code:

public class LoopVariableScope {

    public static void main(String[] args) {

        int x=5; // Declare 'x' outside the loop

        for (int i = 0; i < 5; i++) {

            x = i * 2;

        }

        System.out.println(x); 
    }

}

//Output:
8