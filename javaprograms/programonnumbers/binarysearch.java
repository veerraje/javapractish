package programonnumbers;

import java.util.Arrays;

public class binarysearch {
public static void main(String[] args) {
	
	  int intArray[] = {1,2,4,5};
	  Arrays.sort(intArray);
	//value to search
	    int searchValue = 2;
	   
	    //since 2 is present in int array, index of it would be returned
	    int intResult = Arrays.binarySearch(intArray,searchValue);
	    System.out.println("Result of binary search of 2 is : " + intResult);
	   
	    //lets search something which is not in int array !
	    searchValue = 3;
	    intResult = Arrays.binarySearch(intArray,searchValue);
	    System.out.println("Result of binary search of 3 is : " + intResult);
}
}
