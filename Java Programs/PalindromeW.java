class PalindromeW{
	public static void main(String[] args){
		int num=121;
		int temp=num;
		int rev=0;
		int rem=0;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}