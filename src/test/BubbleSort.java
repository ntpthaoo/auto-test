package test;

import java.util.Scanner;

public class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i=0;i<n;i++)
			for(int j=0;j<n-1-i;j++)
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					
				}
	}

	void print(int arr[]) {
		int n = arr.length;
		for(int i =0; i<n;i++) {
			System.out.print(arr[i]+ " " );
	
		}
		System.out.println();
	}
	
		public static void heapify(int arr[], int n, int index) {
			int largest = index;
			int l = 2 * index +1;
			int r = 2 * index +2;
			//tìm node lơn nhất
			if(l < n && arr[l] > arr[largest]) 
				{largest =1;
				}
			if(l < n && arr[l] > arr[largest]) 
			{largest =1;
			}
			
				}



	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 4, 5 ,9, 1, 3};
		System.out.println("Dãy số trước khi sắp xếp:");
		bs.print(arr);
		System.out.println("Dãy số sau sắp xếp:");
		bs.bubbleSort(arr);
		bs.print(arr);


}
}
