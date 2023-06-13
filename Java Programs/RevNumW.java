class RevNumW{
	public static void main(String[] args){
		int num=145;
		int rev=0;
		int rem=0;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of "+ num + " is " + rev);
	}
}

