import java.util.Scanner;
class SideOfSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter perimeter of square: ");
		double perimeter = sc.nextDouble();
		
		double side = perimeter/4;
		System.out.print("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}