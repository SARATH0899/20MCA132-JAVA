import java.util.*;
public class Smallest{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int sz = Snr.nextInt();
		int Arr[] = new int[sz];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<sz;i++)
		{
			Arr[i] = Snr.nextInt();
		}
		System.out.print("The array: ");
		System.out.print("[ ");
		for(int i=0;i<sz;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		System.out.println("]");
		int small=0;
		for(int i=0;i<sz;i++){
			for(int j=0;j<sz;j++){
				if(Arr[i]<=Arr[j]){
					small=Arr[i];
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("The smallest number in array is "+small);
		}
}
