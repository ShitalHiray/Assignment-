/* Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5? */
/*
public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
}
*/
/*Output: 1 */
//Corrected Code:

public class OffByOneDoWhileLoop {

    public static void main(String[] args) {

        int num = 1;

        do {

            System.out.println(num);

            num++;
        } while (num <= 5);

    }

}

//Output:
1
2
3
4
5