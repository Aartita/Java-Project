package classandobject;

import java.util.Scanner;

public class SumOfPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int n, i,j, sum=0,count=0;
				// int flag=0;
				Scanner sc=new Scanner(System.in);
				n = sc.nextInt();
				if(n < 0)
				{
					System.out.println("Invalid array size");
					System.exit(0);
				}
				
							else
							{
								int a[]=new int[n];
								for(i = 0; i< n; i++)
								{
									a[i] = sc.nextInt();
									if(a[i] < 0)
									{
										//flag=1;
										System.out.println("Invalid input");
										System.exit(0);
										}
									}
							
								//if(flag!=1)
								// {
								for(i=0;i<n;i++)
								{
									count=0;
									for(j=1;j<=a[i];j++)
									{
										if(a[i]%j==0)
											count++;
										}
									if(count==2)
										sum=sum+a[i];
									}
								System.out.println(sum);
								//	}
								}
							}


		


	}

}
