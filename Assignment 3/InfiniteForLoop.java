// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?

/*
public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
}*/
/*Output:Infinity type code run*/

//Corrected Code:

public class InfiniteForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { 
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
5
6
7
8
9