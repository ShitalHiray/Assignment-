/* Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
expression be corrected?  */
/*
public class InfiniteForLoopUpdate {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i += 2) {
 System.out.println(i);
 }
 }
}
*/

/*Output:
0
2
4
  */

//Corrected Code:
public class InfiniteForLoopUpdate {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { 
            System.out.println(i);

        }

    }

} 

//Output:
0
1
2
3
4
