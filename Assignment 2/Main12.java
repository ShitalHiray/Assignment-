/* What happens when you run this code? How can you avoid infinite loops?*/

/*public class Main12 {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }
}*/

/*Output:infinte loop print infinite*/


//Corrected Code: 
 public class Main12 {
 	public static void main(String[] args) {

	int count = 0;

        while (count < 5) { 

 	System.out.println("Infinite Loop" +count);

            count++;  

 }
}
}

//Output:Infinite Loop0
Infinite Loop1
Infinite Loop2
Infinite Loop3
Infinite Loop4