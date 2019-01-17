package main;
import java.util.Arrays;
import java.util.Random;

import arrays.OneDimensionalArrays;
import arrays.SortingArrays;
import arrays.TwoDimensionalArrays;


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
		//OneDimensionalArrays.task30(randomIntegerArray(20, 0, 10));
		//OneDimensionalArrays.task31(3);
		//OneDimensionalArrays.task32();
		//OneDimensionalArrays.task33(randomIntegerArray(20, 0, 20));
		//OneDimensionalArrays.task34(randomIntegerArray(30, 0, 1), 0);
		//OneDimensionalArrays.task35(randomIntegerArray(11, -10, 10));
		//OneDimensionalArrays.task36(randomIntegerArray(20, -5, 5));
		//OneDimensionalArrays.task37(randomIntegerArray(21, -5, 5));
		//OneDimensionalArrays.task38(randomIntegerArray(30, -10, 10), 10);
		//OneDimensionalArrays.task39(randomIntegerArray(30, -10, 10));
		//OneDimensionalArrays.task40(randomIntegerArray(30, -10, 10),randomIntegerArray(30, -10, 10));
		//OneDimensionalArrays.task41(randomIntegerArray(3, -10, 10));
		//OneDimensionalArrays.task42(randomIntegerArray(5, -10, 10),randomIntegerArray(5, -10, 10));
		//OneDimensionalArrays.task43(randomIntegerArray(5, -10, 10));
		//OneDimensionalArrays.task44(randomDoubleArray(10, 0, 100));
		//OneDimensionalArrays.task45(randomIntegerArray(30, -100, 100), 2);
		//OneDimensionalArrays.task46(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task47(randomDoubleArray(10, 0, 100), 50);
		//OneDimensionalArrays.task48(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task49(randomIntegerArray(100, 0, 80));
		//OneDimensionalArrays.task50(randomIntegerArray(20, -20, 20));
		//OneDimensionalArrays.task51(randomIntegerArray(20, -20, 20));
		//OneDimensionalArrays.task52(randomIntegerArray(10, -10, 10), 1);
		//OneDimensionalArrays.task53(new int[] {0,1,1,1,1,0,2,3,1,2,3,4,5,3,0,0,2,1,2,3,4,3});
		//OneDimensionalArrays.task54(new int[]{0,1,1,1,1,0,2,3,1,2,3,4,5,3,0,0,2,1,2,3,4,3});
		//OneDimensionalArrays.task55(randomIntegerArray(20, -20, 20));
		//OneDimensionalArrays.task56(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task57(randomIntegerArray(10, -10, 10));
		//OneDimensionalArrays.task58(randomIntegerArray(20, 1000, 9999));
		//OneDimensionalArrays.task59(randomIntegerArray(20, -10, 10), randomIntegerArray(25, -20, 10));
		//OneDimensionalArrays.task60(randomIntegerArray(10, -20, 20),randomIntegerArray(10, -20, 20));
		//OneDimensionalArrays.task61(randomIntegerArray(10, 0, 2));
		//OneDimensionalArrays.task62(randomIntegerArray(20, 0, 2));
		//OneDimensionalArrays.task63(randomIntegerArray(20, -5, 5), 10);
		//OneDimensionalArrays.task65(randomIntegerArray(10, -5, 5));
		//OneDimensionalArrays.task66(new int[] {1,2,3,3,4,2,1,1,2,4,3});
		//OneDimensionalArrays.task67Left(randomIntegerArray(10, -5, 5), 4);
		//OneDimensionalArrays.task67Rigth(randomIntegerArray(10, -5, 5), 4);
		//OneDimensionalArrays.task68(new int[] {0,1,1,1,0,0,-1,0,0,0,4,8}, 2);
		//OneDimensionalArrays.task69(new int[] {0,0,1,1,8,8,7,7});
		//OneDimensionalArrays.task70(new int[] {0,0,1,1,8,8,7,7});

		//
		
		int[] arr1 = randomIntegerArray(10000, 0, 10000);
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		int[] arr6 = Arrays.copyOf(arr1, arr1.length);

		//Merger
		/*int[] arr4 = randomIntegerArray(10000, 0, 10000);
		Arrays.sort(arr1);
		Arrays.sort(arr4);
		long t1 = System.nanoTime();
		int[] arr5 = SortingArrays.task72MergeTwoArrays(arr1, arr4);
		System.out.println("Merge Without Binary Search=" + (double) (System.nanoTime() - t1) / 1000000000.0);
		*/// System.out.println(Arrays.toString(arr5));

		// Selection
/*		long t2 = System.nanoTime();
		SortingArrays.task73Selection(arr1);
		System.out.println("Selection=" + (double) (System.nanoTime() - t2) / 1000000000.0);*/
		//System.out.println(Arrays.toString(arr1));

		
		// Bubble
/*		long t3= System.nanoTime();
		SortingArrays.task74BubbleSort(arr2);
		System.out.println("Bubble=" + (double) (System.nanoTime() - t3) / 1000000000.0);*/
		//System.out.println(Arrays.toString(arr2));

		// InsertionWithBinarySearch
/*		long t4 = System.nanoTime();
		SortingArrays.task75InsertionSort(arr3);
		System.out.println("Insertion With Binary Search=" + (double) (System.nanoTime() - t4) / 1000000000.0);*/
		//System.out.println(Arrays.toString(arr3));
		
		//Shell
		/*long t5 = System.nanoTime();
		SortingArrays.task76Shell(arr6);
		System.out.println("Shell=" + (double) (System.nanoTime() - t5) / 1000000000.0);*/
		//System.out.println(Arrays.toString(arr6));
		
		//SortingArrays.task77(randomIntegerArray(25, 0, 30), randomIntegerArray(10, -30, 30));
		//SortingArrays.task78(randomIntegerArray(26, 1, 5));
		
		
		////////////
		
		//TwoDimensionalArrays.task80(5);
		//TwoDimensionalArrays.task81(5);
		//TwoDimensionalArrays.task82(5);
		//TwoDimensionalArrays.task83(5);
		//TwoDimensionalArrays.task84(5);
		//TwoDimensionalArrays.task85(5);
		//TwoDimensionalArrays.task86(7);
		//TwoDimensionalArrays.task87(7);
		//TwoDimensionalArrays.task88(7);
		//TwoDimensionalArrays.task89(7);
		//TwoDimensionalArrays.task90(7);
		//TwoDimensionalArrays.task91(8);
		//TwoDimensionalArrays.task92(4);
		//TwoDimensionalArrays.task93(4,2);
		//TwoDimensionalArrays.task94(new int[] {1,2,3,4,5,6,7,8});
		//TwoDimensionalArrays.task95(10);
		//TwoDimensionalArrays.task96(5);
		//TwoDimensionalArrays.task97(5);
		//TwoDimensionalArrays.task98(randomIntegerArray2D(4, 4, 0, 9));
		//TwoDimensionalArrays.task99(randomIntegerArray2D(4, 5, 0, 9));
		//TwoDimensionalArrays.task100(new int[]{1,2,3,4,5,6});
		//TwoDimensionalArrays.task101(new int[]{0,1,2,3,4,5,6});
		//TwoDimensionalArrays.task102(5);
		//TwoDimensionalArrays.task103(5);
		//TwoDimensionalArrays.task105(randomIntegerArray2D(4, 4, -9, 9));
		//TwoDimensionalArrays.task106(randomIntegerArray2D(4, 4, -20, 20));
		//TwoDimensionalArrays.task107(randomIntegerArray2D(4, 4, -20, 20),4);
		//TwoDimensionalArrays.task108(randomIntegerArray2D(4, 4, -20, 20));
		//TwoDimensionalArrays.task109(new int[][] {{2,7,6},{9,5,1},{4,3,8}});
		//TwoDimensionalArrays.task110(randomIntegerArray2D(4, 4, -20, 20));
		//TwoDimensionalArrays.task110(new int[][] {{5,10,8},{1,11,0},{2,18,6}});
		//TwoDimensionalArrays.task111(randomIntegerArray2D(5, 5, -20, 20));
		//TwoDimensionalArrays.task112(randomIntegerArray2D(5, 5, 0, 1));
		//TwoDimensionalArrays.task113(randomIntegerArray2D(5, 5, -10, 10));
		//TwoDimensionalArrays.task114(randomIntegerArray2D(5, 5, -10, 10));
		//TwoDimensionalArrays.task115(randomIntegerArray2D(5, 5, -200, 200),2);
		//TwoDimensionalArrays.task116(randomIntegerArray2D(5, 5, -200, 200));
		//TwoDimensionalArrays.task117(randomIntegerArray2D(5, 5, -20, 20));
		//TwoDimensionalArrays.task118(randomIntegerArray2D(5, 5, -20, 20));
		//TwoDimensionalArrays.task119(randomDoubleArray2D(5, 5, -20, 20));
		TwoDimensionalArrays.task120(randomIntegerArray2D(5, 5, -20, 20));
		
		
		
		
		
		
	}
	
	static int[] randomIntegerArray(int k, int min, int max) {
		int[] arr = new int[k];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + rd.nextInt(max - min + 1);
		}
		return arr;
	}
	static int[][] randomIntegerArray2D(int n,int m, int min, int max) {
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = min + rd.nextInt(max - min + 1);
			}
		}
		return arr;
	}
	
	static double[] randomDoubleArray(int k, int min, int max) {
		double[] arr = new double[k];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + rd.nextInt(max - min + 1);
			if (arr[i] <= 0) {
				arr[i] = arr[i] + (double) rd.nextInt(100) / 100;
			} else {
				arr[i] = arr[i] - (double) rd.nextInt(100) / 100;
			}
		}
		return arr;
	}
	static double[][] randomDoubleArray2D(int n,int m, int min, int max) {
		double[][] arr = new double[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = min + rd.nextInt(max - min + 1);
				if (arr[i][j] <= 0) {
					arr[i][j] = arr[i][j] + (double) rd.nextInt(100) / 100;
				} else {
					arr[i][j] = arr[i][j] - (double) rd.nextInt(100) / 100;
				}
			}
			
		}
		return arr;
	}
	
}
