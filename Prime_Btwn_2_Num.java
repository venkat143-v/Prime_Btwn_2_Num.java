import java.util.*;
public class Prime_Btwn_2_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int n1 = sc.nextInt(); // 0
		int n2 = sc.nextInt(); // 10
		// for range
		for(int n = n1; n <= n2; n++) // n =0,1,2,3,4,5,6,7
		{
			if(n==0 || n==1)
				continue;
			else
			{
				//check each number for prime
				int flag = 1; // prime
				for(int i = 2; i <= n/2; i++)// 2<3->t
				{
					if(n%i==0) // 6%2 == 0 -> t
					{
						flag = 0; //not prime
						break;
					}// if
				}//inner for
				if (flag == 1)
					System.out.print(n+" ");
			}// else	
		}// outer for
				
}	}