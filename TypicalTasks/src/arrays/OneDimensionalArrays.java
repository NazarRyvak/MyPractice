package arrays;

import java.util.Arrays;

public class OneDimensionalArrays {

	public static void task1(int[] arr, int k) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1) {
				System.out.println("Your array consist not natural numbers!!!");
				return;
			}
		}
		int sum = 0;
		System.out.println("Elements of array that divide into " + k + ":");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("Sum: " + sum);
	}
	
	public static void task2(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		int[] result = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result[j] = i;
				j++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task3(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		
		if (arr[0] < 0) {
			System.out.println("Negative!!!");
		}else if (arr[0] > 0) {
			System.out.println("Positive!!!");
		}else {
			System.out.println("Z!!!");
		}
	}

	public static void task4(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true!!!");
	}

	public static void task5(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1) {
				System.out.println("Your array consist not natural numbers!!!");
				return;
			}
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("The sequence does not have even numbers");
			return;
		}
		int[] result = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[j] = arr[i];
				j++;
			}
		}
		System.out.println("Result!!!");
		System.out.println(Arrays.toString(result));
	}

	public static void task6(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		double min = arr[0];
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			} else {
				continue;
			}
		}
		System.out.println("Result: [" + min + ";" + max + "]");
	}

	public static void task7(double[] arr, double z) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Count of replace: " + count);
	}
	
	public static void task8(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		boolean isZero = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				isZero = true;
				break;
			}
			count++;
		}
		if (isZero) {
			System.out.println("Result: " + count);
		} else {
			System.out.println("The sequence does not have zero element!!!");
		}
	}
	
	public static void task9(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				countNegative++;
			}else if (arr[i]>0) {
				countPositive++;
			}else {
				countZero++;
			}
		}
		System.out.println("Negative: " + countNegative);
		System.out.println("Positive: " + countPositive);
		System.out.println("Zero: " + countZero);
		
	}
	
	public static void task10(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		double min = arr[0];
		int indexMin = 0;
		int indexMax = 0;
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			} else if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			} else {
				continue;
			}
		}
		
		double temp = arr[indexMin];
		arr[indexMin] = arr[indexMax];
		arr[indexMax] = temp;
		
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
	}
	



}
