class SDigitW{
	public static void main(String[] args){
		int num=15;
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp!=0){
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("Sum of digits of " + num + " is " +sum);
	}
}
