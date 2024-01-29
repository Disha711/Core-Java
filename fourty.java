import java.util.Scanner;
class CheckSum
{
	public static void main(String args[])
	{
		byte firstvalue, secondvalue, sum;
		Scanner scin=new Scanner(System.in);
		System.out.println("Enter Firstvalue:");
		firstvalue=scin.nextByte();
		
		System.out.println("Enter Secondvalue:");
		secondvalue=scin.nextByte();

		while(firstvalue<=secondvalue)
		{
			sum=sum+firstvalue;
			firstvalue++;
		}
		System.out.println("Sum:");
	}
}
		