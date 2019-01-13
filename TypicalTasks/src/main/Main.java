package main;
import java.util.Random;

import arrays.OneDimensionalArrays;


public class Main {

	static Random rd = new Random();
	
	public static void main(String[] args) {
		//OneDimensionalArrays.task1(randomIntegerArray(20, 1, 100), 4);
		//OneDimensionalArrays.task2(randomIntegerArray(20, -10, 10));
		//OneDimensionalArrays.task3(randomIntegerArray(20,-10,10));
		//OneDimensionalArrays.task4(randomDoubleArray(3, -1, 1));
		//OneDimensionalArrays.task5(randomIntegerArray(3, 1, 10));
		//OneDimensionalArrays.task6(randomDoubleArray(10, -100, 100));
		//OneDimensionalArrays.task7(randomDoubleArray(10, -100, 100), 0.0);
		//OneDimensionalArrays.task8(randomIntegerArray(100, -10, 10));
		//OneDimensionalArrays.task9(randomIntegerArray(100, -10, 10));
		//OneDimensionalArrays.task10(randomDoubleArray(10, -100, 100));
		//OneDimensionalArrays.task11(randomIntegerArray(100, -100, 100));
		//OneDimensionalArrays.task12(randomIntegerArray(100, 1, 100), 10, 0);
		//OneDimensionalArrays.task13(randomIntegerArray(10, 1, 10));
		//OneDimensionalArrays.task14(randomIntegerArray(25, 2, 5));
		//OneDimensionalArrays.task15(randomIntegerArray(25, -50, 50));
		//OneDimensionalArrays.task16(randomIntegerArray(10, -50, 50));
		//OneDimensionalArrays.task17(randomDoubleArray(10, -1, 1), 0, 0.5);
		//OneDimensionalArrays.task18(randomDoubleArray(10, 27, 28));
		//OneDimensionalArrays.task19(randomIntegerArray(17, -50, 50));
		//OneDimensionalArrays.task20(randomIntegerArray(10, -50, 50));
		//OneDimensionalArrays.task21(randomDoubleArray(10, -10, 10), 0, 10);
		//OneDimensionalArrays.task22(randomIntegerArray(20, 0, 10), 9);
		//OneDimensionalArrays.task23(randomIntegerArray(10, 0, 1));
		//OneDimensionalArrays.task24(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task25(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task26(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task27(randomIntegerArray(20, -10, 10));
		//OneDimensionalArrays.task28(randomIntegerArray(20, 0, 100), 40);
		//OneDimensionalArrays.task29(randomIntegerArray(20, 0, 10), 3);
		OneDimensionalArrays.task30(randomIntegerArray(20, 0, 10));
		
	
		
	}
	
	static int[] randomIntegerArray(int k, int min, int max) {
		int[] arr = new int[k];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + rd.nextInt(max - min + 1);
		}
		return arr;
	}
	
	static double[] randomDoubleArray(int k, int min, int max) {
		double[] arr = new double[k];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + rd.nextInt(max - min + 1);
			if (arr[i] < 0) {
				arr[i] = arr[i] + (double) rd.nextInt(100) / 100;
			} else {
				arr[i] = arr[i] - (double) rd.nextInt(100) / 100;
			}
		}
		return arr;
	}
	
}
