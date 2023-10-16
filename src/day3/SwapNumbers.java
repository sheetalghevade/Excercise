package day3;

import java.util.Arrays;

public class SwapNumbers {

	public static void main(String[] args) {
	 int array[] = { 1, 2, 3, 4, 5, 6, 7 };
	  int key = 4;

	  for (int j = 0; j < key; j++) {
	   for (int i = array.length - 1; i > 0; i--) {

	    int temp = array[i];
	    array[i] = array[i - 1];
	    array[i - 1] = temp;
	    for(int k =0; k< array.length; k++) {
	    System.out.print(array[k] +" ");
	    
	    }
        System.out.println("\n"+temp);

	   }
	  }
	  System.out.println(Arrays.toString(array));
	  
}
}
