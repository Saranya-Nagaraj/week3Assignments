package week3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	   int[] numbers = {1, 2, 3, 4, 10, 6, 8};
	   Arrays.sort(numbers);
	   for (int i = 0; i < numbers.length; i++) {
      //     System.out.println(numbers[i]);
        if(numbers[i]!=i+1) {
        	System.out.println(i+1);
        	
        }
	   
        }  
    }
}