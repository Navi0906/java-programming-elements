import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of triangle: ");
		int base = sc.nextInt();
		
		System.out.print("Enter the height of triangle: ");
		int height = sc.nextInt();
		
		double area = 0.5*base*height;
		
		System.out.print("Area of triangle with base and height as "+base+" and "+height+" is "+area);
	}
}