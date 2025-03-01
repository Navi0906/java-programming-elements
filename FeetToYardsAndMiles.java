import java.util.Scanner;
class FeetToYardsAndMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter the feets: ");
		int feet = sc.nextInt();
		
		int inMiles = feet*1760;
		int inYards = feet*3;
		System.out.print("Distance in miles is "+inMiles+" and in yards is "+inYards+" while in feet is "+feet);
		
	}
}