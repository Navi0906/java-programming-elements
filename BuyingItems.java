import java.util.Scanner;
class BuyingItems{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the unit price of item: ");
		int unitPrice = sc.nextInt();
		System.out.print("Enter the quantity of item: ");
		int quantity = sc.nextInt();
		
		System.out.print("The total purchase price is INR "+(unitPrice*quantity)+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}