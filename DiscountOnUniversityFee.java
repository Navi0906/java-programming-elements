import java.util.Scanner;
class DiscountOnUniversityFee{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the University fee");
		int fee = sc.nextInt();
		System.out.println("Enter the University discount");
		int discount = sc.nextInt();
		
		int discountedAmount = fee*discount/100;
		int discountedPrice = fee - discountedAmount;
		
		System.out.print("The discounted amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedPrice);
	}
}