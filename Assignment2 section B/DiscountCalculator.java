/*Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount. */

//Program Code: 
  
public class DiscountCalculator {
	public static void main(String[] args) {
                double totalPurchase = 750; 
        boolean hasMembershipCard = true;         
        double discount;
        
        if (totalPurchase >= 1000) {
            discount = 0.20;
        } else if (totalPurchase >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }
        
           if (hasMembershipCard) {
            discount += 0.05;
        }
        
        double discountAmount = totalPurchase * discount;
        double finalAmount = totalPurchase - discountAmount;
        
        System.out.println("Total Purchase Amount: Rs. " + totalPurchase);
        System.out.println("Discount Applied: Rs. " + discountAmount);
        System.out.println("Final Amount to be Paid: Rs. " + finalAmount);
    }
}

//Output:Total Purchase Amount: Rs. 750.0
Discount Applied: Rs. 112.50000000000001
Final Amount to be Paid: Rs. 637.5