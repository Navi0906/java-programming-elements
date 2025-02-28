class VolumeOfEarth{
	public static void main(String[] args){
		int radius = 6378;
		double radiusInMiles = radius*0.62;
	
		double volume = (4/3) * Math.PI * radius*radius*radius;
		double volumeInMiles = (4/3) * Math.PI * radiusInMiles*radiusInMiles*radiusInMiles;
		System.out.print("The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+volumeInMiles);
	}
}