package com.lab2.prob1;
import java.util.*;

public class PayMoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values of array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int noOfTar = sc.nextInt();
		for(int j=0;j<noOfTar;j++)
		{
			System.out.println("Enter the value of target: ");
			int tar = sc.nextInt();
			int sum=0;
			for(int i=0;i<size;i++)
			{
				sum+=a[i];
				if(sum>tar)
				{
					System.out.println("Target achieved after "+(i+1)+" transactions");
					break;
				}
			
			}
			if(sum<tar)
			{
				System.out.println("Target is not achieved");
			}
				
		}
		sc.close();
	}

}
