import java.util.Scanner;
class HeightConverter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height in centimeters: ");
		double height = sc.nextDouble();
		
		double inches = height/2.54;
		int feet = (int)(inches/12);
		double remainingInches = inches%12;
		System.out.println("Your height in cm is " + height + " while in feet is " + feet + " feet and " + remainingInches + " inches");
	}
}