import java.util.*;
class a4q2
{
	public static void main(String arsg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str=in.nextLine();
		System.out.print("Enter the Number of Lines to print :");
		int i=in.nextInt();
		for(int a=1; a<=i; a++)
		{
			System.out.print(a);
			if(a==1 || a%10==1 || a%100==1)
				System.out.print("st ");
			else if(a==2 || a%10==2 || a%100==2)
				System.out.print("nd ");
			else if(a==3 || a%10==3 || a%100==3)
				System.out.print("rd ");
			else
				System.out.print("th ");
			System.out.println(str);
		}
	}
}