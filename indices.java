import java.util.*;
public class indices {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE:");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("enter the numbers:");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("ENTER THE TARGET: ");
		int target=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				int sum=numbers[i]+numbers[j];
				if (sum==target) {
					System.out.println("THE INDICES ARE: "+i + j);
					break;
					
				}
				
				
				
						
					
					
			}
			
		
		}
		
		

	}

}
