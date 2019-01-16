package arrays;

import java.util.Arrays;

public class SortingArrays {

	public static int[] task72MergeTwoArrays(int[] arrA, int[] arrB) {
		int[] result = new int[arrA.length + arrB.length];
		int aIndex = 0;
		int bIndex = 0;
		while (true) {

			if (aIndex >= arrA.length) {
				System.arraycopy(arrB, bIndex, result, aIndex + bIndex, arrB.length - bIndex);
				return result;
			}
			if (bIndex >= arrB.length) {
				System.arraycopy(arrA, aIndex, result, aIndex + bIndex, arrA.length - aIndex);
				return result;
			}

			if (arrA[aIndex] < arrB[bIndex]) {
				result[aIndex + bIndex] = arrA[aIndex++];
			} else {
				result[aIndex + bIndex] = arrB[bIndex++];
			}
		}
	}

	public static void task73Selection(int[] arr) {
		for (int barrier = 0; barrier < arr.length - 1; barrier++) {
			int minIndex = barrier;
			for (int index = barrier + 1; index < arr.length; index++) {
				if (arr[minIndex] > arr[index]) {
					minIndex = index;
				}
			}
			swap(arr, barrier, minIndex);
		}
	}

	public static void task74BubbleSort(int[] arr) {
		int generalCount = 0;
		for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
			int countSwap = 0;
			for (int index = 0; index < barrier; index++) {
				if (arr[index] > arr[index + 1]) {
					swap(arr, index, index + 1);
					countSwap++;
					generalCount++;
				}
			}
			if (countSwap == 0) {
				break;
			}
		}
		System.out.println("Count of swap: " + generalCount);
	}

	public static void task75InsertionSort(int[] arr) {
		for (int barrier = 1; barrier < arr.length; barrier++) {
			int element = arr[barrier];
			int position = Math.abs(Arrays.binarySearch(arr, 0, barrier, element) + 1);
			System.arraycopy(arr, position, arr, position + 1, barrier - position);
			arr[position] = element;
		}
	}

	public static void task76Shell(int[] arr) {
		while (true) {
			int count = 0;
			for (int i = 0; i < arr.length - 1 && i >= 0;) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					count++;
					i--;
				} else {
					i++;
				}
			}
			if (count == 0) {
				break;
			}
		}
	}

	public static void task77(int[] arrA, int[] arrB) {
		System.out.println("Your array:");
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		System.out.println("A: " + Arrays.toString(arrA));
		System.out.println("B: " + Arrays.toString(arrB));

		int i = 0;
		for (int j = 0; j < arrB.length;) {
			if (arrB[j] < arrA[i]) {
				System.out.println("B[" + j + "] = " + arrB[j] + "\tposition" + i);
				j++;
			} else {
				i++;
				if (i == arrA.length) {
					i--;
					for (int k = j; k < arrB.length; k++) {
						System.out.println("B[" + j + "] = " + arrB[j] + "\tposition: " + i);
					}
					break;
				}
			}
		}
	}

	//task 78 begin
	public static void task78(int[] arr) {
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The length of array should be even number!!!");
			return;
		}
		System.out.println("Your array:");
		printFraction(arr);
		
		int[] denominators = new int[arr.length / 2];
		int[] numerator = new int[arr.length / 2];
		int tempIndex = 0;
		for (int i = 0; i < arr.length-1; i = i + 2) {
			numerator[tempIndex] = arr[i];
			denominators[tempIndex] = arr[i+1];
			tempIndex++;
		}
		tempIndex = 0;
		int nsk = nsk(denominators);
		for (int i = 0; i < arr.length - 1; i = i + 2) {
			arr[i] = nsk/arr[i+1] * arr[i];
			arr[i+1] = nsk; 
			numerator[tempIndex] = arr[i];
			tempIndex++;
		}
		System.out.println("Result (not sorted): ");
		printFraction(arr);
		Arrays.sort(numerator);
		tempIndex = 0;
		for (int i = 0; i < arr.length - 1; i = i+2) {
			arr[i] = numerator[tempIndex];
			tempIndex++;
		}
		System.out.println("Result: ");
		printFraction(arr);
		
		
	}
	
	private static void printFraction(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 3; i = i + 2) {
			System.out.print(arr[i] + "/" + arr[i + 1] + ", ");
		}
		System.out.println(arr[arr.length - 2] + "/" + arr[arr.length - 1] +"]");	
	}

	private static int nsk(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int nsk = max;
		int count = 1;
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (nsk % arr[i] != 0) {
					break;
				}
				if (i == arr.length - 1) {
					return nsk;
				}
			}
			nsk = max * ++count;
		}
	}
	//task78 end
	
	private static void swap(int[] arr, int first, int second) {
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	
	
}
