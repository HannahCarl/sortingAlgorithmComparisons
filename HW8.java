/*Hannah Posch
* HW 8, Summer 2018
* The code in this file will call five selection algorithms with three arrays (random, ascending, descending) 
* of size N provided by the user. This code will also be used to generate the time it takes for each algorithm 
* to complete which will be compared in another document.
*/

import java.util.Random;
import java.util.Scanner;

public class HW8 {
	
	/*
	 * main : This method utilizes a for loop to call each of the sorting algorithms with three arrays of which
	 * are in random, ascending and descending order. The method then calculates the difference in time for each 
	 * array and each sorting algorithm which are then printed to the user.
	 * @precondition: N (size of array) must be supplied by user
	 */
	public static void main( String [ ] args ) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		int randValue, descendNum, ascendNum;
		int numSorts = 5;
		String sortName = "";
		long timeBeforeRand = 0;
		long timeAfterRand = 0;
		long lengthOfTimeRand = 0;
		long timeBeforeDescend = 0;
		long timeAfterDescend = 0;
		long lengthOfTimeDescend = 0;
		long timeBeforeAscend = 0;
		long timeAfterAscend = 0;
		long lengthOfTimeAscend = 0;
		
		//Array size entered
		System.out.println("Enter a value for the size of the array to be sorted: ");
		int arraySize = scnr.nextInt();
		
		//Loop to call sorts
		for(int i = 0; i < numSorts; i++) {
			//3 arrays generated
			Integer[] randArray = new Integer[arraySize];
			Integer[] ascendArray = new Integer[arraySize];
			Integer[] descendArray = new Integer[arraySize];
			
			//Array filled with numbers
			for(int j = 0; j<arraySize; j++) {	
				ascendNum = j + 1;
				descendNum = arraySize - j;
				randValue = rand.nextInt(arraySize);
				randArray[j] = randValue;
				ascendArray[j] = ascendNum;
				descendArray[j] = descendNum;
			}
		
			if(i==0) {
				//Insertion Sort
				timeBeforeRand = System.currentTimeMillis();
				Sort.insertionSort(randArray);
				timeAfterRand = System.currentTimeMillis();
				timeBeforeAscend = System.currentTimeMillis();
				Sort.insertionSort(ascendArray);
				timeAfterAscend = System.currentTimeMillis();
				timeBeforeDescend = System.currentTimeMillis();
				Sort.insertionSort(descendArray);
				timeAfterDescend = System.currentTimeMillis();
				sortName = "Insertion Sort";
			}
				
			if(i==1) {
				//HeapSort
				timeBeforeRand = System.currentTimeMillis();
				Sort.heapsort(randArray);
				timeAfterRand = System.currentTimeMillis();
				timeBeforeAscend = System.currentTimeMillis();
				Sort.heapsort(ascendArray);
				timeAfterAscend = System.currentTimeMillis();
				timeBeforeDescend = System.currentTimeMillis();
				Sort.heapsort(descendArray);
				timeAfterDescend = System.currentTimeMillis();
				sortName = "Heap Sort";
			}
			
			if(i==2) {
				//Merge Sort
				timeBeforeRand = System.currentTimeMillis();
				Sort.mergeSort(randArray);
				timeAfterRand = System.currentTimeMillis();
				timeBeforeAscend = System.currentTimeMillis();
				Sort.mergeSort(ascendArray);
				timeAfterAscend = System.currentTimeMillis();
				timeBeforeDescend = System.currentTimeMillis();
				Sort.mergeSort(descendArray);
				timeAfterDescend = System.currentTimeMillis();
				sortName = "Merge Sort";
			}
			
			if(i==3) {
				//Quick Sort
				timeBeforeRand = System.currentTimeMillis();
				Sort.quicksort(randArray);
				timeAfterRand = System.currentTimeMillis();
				timeBeforeAscend = System.currentTimeMillis();
				Sort.quicksort(ascendArray);
				timeAfterAscend = System.currentTimeMillis();
				timeBeforeDescend = System.currentTimeMillis();
				Sort.quicksort(descendArray);
				timeAfterDescend = System.currentTimeMillis();
				sortName = "Quick Sort";
			}
			
			if(i==4) {
				//Quick Sort 2
				timeBeforeRand = System.currentTimeMillis();
				Sort.quicksort2(randArray);
				timeAfterRand = System.currentTimeMillis();
				timeBeforeAscend = System.currentTimeMillis();
				Sort.quicksort2(ascendArray);
				timeAfterAscend = System.currentTimeMillis();
				timeBeforeDescend = System.currentTimeMillis();
				Sort.quicksort2(descendArray);
				timeAfterDescend = System.currentTimeMillis();
				sortName = "Quick Sort 2";
			}
			
			//Length of time calculated
			lengthOfTimeRand = timeAfterRand - timeBeforeRand;
			lengthOfTimeAscend = timeAfterAscend - timeBeforeAscend;
			lengthOfTimeDescend = timeAfterDescend - timeBeforeDescend;
			
			//Time for each array in sorting algorithm is printed
			System.out.println(sortName + " Time for the array of random order: " + lengthOfTimeRand + " ms");
			System.out.println(sortName + " Time for the array of ascending order: " + lengthOfTimeAscend + " ms");
			System.out.println(sortName + " Time for the array of descending order: " + lengthOfTimeDescend + " ms");
			System.out.println();
			
			/*for(int j = 0; j < arraySize; j++) {
				System.out.println("Random array [" + j + "] = " + randArray[j]);	
			}
			System.out.println();
			for(int j = 0; j < arraySize; j++) {
				System.out.println("Ascend array [" + j + "] = " + ascendArray[j]);	
			}
			System.out.println();
			for(int j = 0; j < arraySize; j++) {
				System.out.println("Descend array [" + j + "] = " + descendArray[j]);
			}
			System.out.println();*/
	
		}
		
		scnr.close();
		
	}

}
