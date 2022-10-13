/*
Program: Deleting of dublucate entries in an Array
@Author: Prithwish Shaw
@Date: 22 Sep 2022
*/

import java.util.*;

//declaring class DublicateArray
class DublicateArray
{
	// method for inporting array
	static void inputArray()
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		size=sc.nextInt(); // taking the array size 
		
		//creating an array with the given size 
		int array[]=new int[size];
		
		//taking the elements of the array
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		// printing the array before sorting
		System.out.println("-----Array before sorting-----");
		display(array); //calling method for display
		
		System.out.println(); //extra line
		
		//sorting function for sorting the array
		Arrays.sort(array);
		
		//printing the array after sorting
		System.out.println("-----Array after sorting-----");
		display(array); //calling method for display
		
		System.out.println(); //extra line
		
		//printing the dublicate elements in the array
		System.out.println("-----Dublicate elements in the array-----");
		duplicateArray(array); //calling method for display
		
		System.out.println(); //extra line
		
		//printing the array after removing the dublicate array
		System.out.println("-----After removing the dublicate elements-----");
		removeDuplicate(array); //calling method for display
	}
	//end of method
	
	//method for find the dublicate elements
	static void duplicateArray(int array[])
	{
		// outer loop
		for(int i=0; i<array.length;i++)
		{
			// inner loop
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				System.out.print(array[i]+ "  ");
			}
		   //end of inner loop
		}
		//end of outer loop
	}
	//end of method
	
	//method for removing dublicate elements
	static void removeDuplicate(int array[])
   {
		int size,nSize;
		size= array.length;
	   
		if(size==0||size==1)
		nSize=size;
	   
		int temp[] = new int[size];
		int j=0;
		for(int i=0;i<size-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[size-1];
		
		for(int i=0; i<j;i++)
		{
			array[i]= temp[i];
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}
	//en of method

	//method for display array
	static void display(int arr[])
	{
		for(int ar:arr)
		{
			System.out.print(ar+" ");
		}
	}
	//end of method
	
	//main method
	public static void main(String ...args)
	{
		inputArray(); // calling method
	}
	//end of main method
}
//end of class DublicateArray	

	
	
