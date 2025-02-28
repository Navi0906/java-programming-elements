class DiscountOnFee{
	public static void main(String[] args){
		int fee = 12500;
		int discount = 10;
		
		int discountedAmount = fee*discount/100;
		int discountedPrice = fee - discountedAmount;
		
		System.out.print("The discounted amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedPrice);
	}
}