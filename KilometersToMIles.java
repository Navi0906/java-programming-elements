import java.util.Scanner;
class KilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kilometers : ");
		double kilometers = sc.nextDouble();
		
		double inMiles = kilometers/1.6;
		
		System.out.println("The total miles is "+inMiles+" mile for the given "+kilometers+" km");
	}
}