package algorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000);
		}
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");

        for(String st:numbers){
        	System.out.println(st);
        }
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
		List<String> numbers1 = connectDB.readDataBase("selection_sort", "SortingNumbers");

		for(String st:numbers1) {
			System.out.println(st);
		}
		int n1 = num.length;
		randomize(num,n1);
		//bubble Sort
		algo.insertionSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "bubble_sort", "SortingNumbers");
		List<String> numbers2 = connectDB.readDataBase("bubble_sort", "SortingNumbers");

		for(String st:numbers2) {
			System.out.println(st);
		}
		int n2 = num.length;
		randomize(num,n2 );
		//merge sort
		algo.insertionSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + mergeSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "merge_sort", "SortingNumbers");
		List<String> numbers3 = connectDB.readDataBase("merge_sort", "SortingNumbers");

		for(String st:numbers3) {
			System.out.println(st);
		}
		int n3 = num.length;
		randomize(num,n3);
		//quick sort
		algo.insertionSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + quickSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "quick_sort", "SortingNumbers");
		List<String> numbers4 = connectDB.readDataBase("quick_sort", "SortingNumbers");

		for(String st:numbers4) {
			System.out.println(st);
		}
		int n4 = num.length;
		randomize(num,n4);
		//heap sort
		algo.insertionSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + heapSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "heap_sort", "SortingNumbers");
		List<String> numbers5 = connectDB.readDataBase("heap_sort", "SortingNumbers");

		for(String st:numbers) {
			System.out.println(st);
		}
		int n5 = num.length;
		randomize(num,n5);
		//bucket sort
		algo.insertionSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bucketSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "bucket_sort", "SortingNumbers");
		List<String> numbers6= connectDB.readDataBase("bucket_sort", "SortingNumbers");

		for(String st:numbers6) {
			System.out.println(st);
		}
		int n6 = num.length;
		randomize(num,n6);
		//shell sort
		algo.insertionSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "shell_sort", "SortingNumbers");
		List<String> numbers7 = connectDB.readDataBase("shell_sort", "SortingNumbers");

		for(String st:numbers7) {
			System.out.println(st);
		}
		int n7 = num.length;
		randomize(num,n7);
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
