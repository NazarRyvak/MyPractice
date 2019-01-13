package arrays;

import java.util.Arrays;
import java.util.Random;

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
		} else if (arr[0] > 0) {
			System.out.println("Positive!!!");
		} else {
			System.out.println("Z!!!");
		}
	}

	public static void task4(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
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
			if (arr[i] < 0) {
				countNegative++;
			} else if (arr[i] > 0) {
				countPositive++;
			} else {
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

	public static void task11(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result:");
		System.out.println("Element\tIndex");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.println(arr[i] + "\t" + i);
			}
		}
	}

	public static void task12(int[] arr, int m, int l) {
		if (l > m) {
			System.out.println("The second parameter should be greater than the third parameter");
			return;
		}
		if (l < 0) {
			System.out.println("The third parameter should be >= than 0");
			return;
		}
		if (m <= 0) {
			System.out.println("The second parameter should be > than 0");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1) {
				System.out.println("Your array consist not natural numbers!!!");
				return;
			}
		}
		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % m == l) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void task13(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void task14(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 2 || arr[i] > 5) {
				System.out.println("Incorrect parameter!!!");
				return;
			}
			if (arr[i] == 2) {
				count++;
			}
		}
		System.out.println("Result: " + count);
	}
	
	public static void task15(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		boolean isZero = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				isZero = true;
				break;
			}
		}
		if (!isZero) {
			System.out.println("The sequence does not have zero elements!!!");
			return;
		}

		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				break;
			}
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void task16(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The sequence should have even count of elements");
			return;
		}
		int i = 0;
		int j = arr.length / 2;
		System.out.println("x\tf(x)");
		do {
			System.out.println(arr[i++] + "\t" + arr[j++]);
		} while (i < arr.length / 2);

	}
	
	public static void task17(double[] arr, double a, double sigma) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]> a - sigma && arr[i]< a+sigma) {
				System.out.print(arr[i]+", ");
			}else {
				count++;
			}
		}
		System.out.println();
		if (count == 0) {
			System.out.println("true");
		}else {
			System.out.println("Count of defective parts: " + count);
		}
	}
	
	public static void task18(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		double max = arr[0];
		int indexMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}
		System.out.println("Result: " + indexMax);
	}
	
	public static void task19(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result:");
		for (int i = 0; arr.length > Math.pow(2, i); i++) {
			System.out.print(arr[(int) Math.pow(2, i)] + " ");
		}
	}
	
	public static void task20(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int min = arr[1];
		int i = 0;
		int j = 1;

		do {
			if (arr[i] > max) {
				max = arr[i];
			}
			i = i + 2;
		} while (i < arr.length);

		do {
			if (arr[j] < min) {
				min = arr[j];
			}
			j = j + 2;
		} while (j < arr.length);

		System.out.println("Result: " + (min + max));
	}
}
