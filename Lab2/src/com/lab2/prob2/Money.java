package com.lab2.prob2;
import java.util.*;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations  ");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value ");
		int[] denominations = new int[size];
		for(int i=0;i<size;i++)
		{
			denominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay ");
		int amt = sc.nextInt();
		int[] a =sort(denominations);
		//Arrays.sort(denominations);
		int[] counter = new int[size];
		try {
			for(int i=0;i<a.length;i++)
			{
				if(amt >= a[i])
				{
					counter[i]=amt/a[i];
					amt=amt-counter[i]*a[i];
				}
			}
			if(amt >0) {
				System.out.println("excat amount cannot be given with the highest domination");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]!=0 && counter[i]!=0)
					{
						System.out.println(a[i]+":"+counter[i]);
					}
				}
			}
		}catch(ArithmeticException e)
		{
			System.out.println(e+" notes of denomination 0 is invalid");
		}
		finally {
			sc.close();
		}

	}
	
	public static int[] sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
