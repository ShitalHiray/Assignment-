/* Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop? */

/*public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num > 0);
 }
}*/

/*Output:Infinite type loop run */

//Corrected Code:

public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num <5);
 }
}

//Corrected Output:
0
1
2
3
4