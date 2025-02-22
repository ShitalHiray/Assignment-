/*  What runtime exception do you encounter? Why does it occur?*/

/*public class Main11 {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }
}*/

/* Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main11.main(Main11.java:6)*/

//Corrected Code:
public class Main11 {
 public static void main(String[] args) {
 int arr[] = {1, 2, 3};
 System.out.println(arr[2]);
 }
}

//Output: 3