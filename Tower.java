import java.util.Scanner;
import java.util.Stack;

public class Tower {
	
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		
		int noOfFloors,j;
		
		System.out.println("Enter No. of Floors in the building:");
		noOfFloors=scan.nextInt();
		
		int size[]=new int[noOfFloors];

		for(int i=0;i<noOfFloors;i++)
		{
			System.out.println("Enter Floor Size on "+(i+1)+" Day:");
			size[i]=scan.nextInt();
		}
		
		for(int i=0;i<noOfFloors;i++)
		{
			System.out.println("Day "+(i+1)+":");
			
			if(i!=noOfFloors-1)
				j=i+1;
			else
				j=i;
			
			while(j<noOfFloors)
			{	
				int m=size[i];
				int n=size[j];
				
				if(m>=n)
				{	
					if(j==(noOfFloors-1))
					{
						System.out.print(m);
						while(!stack.isEmpty()&&stack.peek()<=m&&stack.peek()>=size[j])
						{
							System.out.print(" "+stack.pop());
						}
						break;
					}
					j++;
					continue;
				}
				else
				{
					stack.push(m);
					break;
				}
			} //Inner for loop ends	
						
			System.out.println();
		} // Outer for loop ends
		
		while(!stack.isEmpty())
		{
			System.out.print(" "+stack.pop());
		}
		
		scan.close();
	}
}
