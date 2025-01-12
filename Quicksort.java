package quicksort;

import java.util.Random;
import java.util.Scanner;

public class Quicksort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=userInput.nextInt();
		int array[]=new int[size];
		Random random=new Random();
		System.out.println("populating array with random numbers");
		for(int i=0;i<size;i++) {
			array[i]=random.nextInt();
			}
			System.out.println("original array");
			for(int  i=0;i<size;i++) {
				System.out.println(array[i]+" ");
			}
			System.out.println("performing quick sort");
			long startTime=System.currentTimeMillis();
			sort(array);
			long endTime=System.currentTimeMillis();
			long executionTime=endTime-startTime;

			System.out.println("sorted array");
			for(int i=0;i<size;i++) {
				System.out.println( array[i]+" ");
				
			}
			System.out.println("Total time of execution is"+executionTime+"milliseconds");

	}
	public static void sort(int arr[]) {
		quicksort(arr,0,arr.length-1);
	}
	public static void quicksort(int arr[],int low,int high) {
		int i=low,j=high;
		int temp;
		int pivot=arr[low];
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quicksort(arr,low,j);
		if(i<high)
			quicksort(arr,i,high);
		
	}
	}


