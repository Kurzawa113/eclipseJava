package interview2;

import java.util.Arrays;

public class AccendingOrder {
	public static void main(String[] args) {
		
		
		int  arr[] = {1,3,2,19,22,30,100};
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
			
			//System.out.println("descending : "+arr[i]);
			
		}
		
		
		System.out.println("Accending order "+ Arrays.toString(arr));
		
		
		
	}

}
