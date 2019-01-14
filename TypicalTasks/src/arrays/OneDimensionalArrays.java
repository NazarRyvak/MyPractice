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
			if (arr[i] > a - sigma && arr[i] < a + sigma) {
				System.out.print(arr[i] + ", ");
			} else {
				count++;
			}
		}
		System.out.println();
		if (count == 0) {
			System.out.println("true");
		} else {
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

	public static void task21(double[] arr, double c, double d) {
		if (c > d) {
			System.out.println("The third parameter should be greater than the second");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		System.out.println("Result");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= c && arr[i] <= d) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void task22(int[] arr, int m) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println("Your array consist less than 0 elements!!!");
				return;
			}
			if (arr[i] > m) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("The sequence does not have elements larger than " + m);
			return;
		}

		long result = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				result *= arr[i];
			}
		}

		System.out.println("Result: " + result);
	}

	public static void task23(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			} else if (arr[i] > 1 || arr[i] < 0) {
				System.out.println("Incorrect data!!!The sequence does not contain only 0 and 1");
				return;
			} else {
				continue;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < countZero) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
	}

	public static void task24(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > max) {
				arr[i] = 0;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
	}

	public static void task25(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The sequence should have even count of elements");
			return;
		}
		int max = arr[0] + arr[arr.length - 1];
		for (int i = 1; i < arr.length / 2; i++) {
			if ((arr[i] + arr[arr.length - 1 - i]) > max) {
				max = arr[i] + arr[arr.length - 1 - i];
			}
		}
		System.out.println("Result: " + max);
	}

	public static void task26(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		long multPositive = 1;
		long multNegative = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				multNegative *= arr[i];
			} else if (arr[i] > 0) {
				multPositive *= arr[i];
			} else {
				continue;
			}
		}
		if (Math.abs(multNegative) > multPositive) {
			System.out.println("Negative!!!");
		} else if (Math.abs(multNegative) < multPositive) {
			System.out.println("Positive!!!");
		} else {
			System.out.println("Equal!!!");
		}
	}

	public static void task27(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = 0;
				break;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
	}

	public static void task28(int[] arr, int b) {
		Arrays.sort(arr);
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int[] result = new int[arr.length + 1];
		int j = 0;
		boolean isInsert = false;
		for (int i = 0; i < arr.length; i++) {
			if (!isInsert && arr[i] > b) {
				result[j] = b;
				isInsert = true;
				j++;
			}
			result[j] = arr[i];
			j++;
		}
		if (!isInsert) {
			result[result.length - 1] = b;
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task29(int[] arr, int m) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m * m) {
				System.out.print(i + " ");
			}
		}
	}

	public static void task30(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				count = 0;
			}
			if (arr[i] == min) {
				count++;
			}
		}
		int[] result = new int[arr.length - count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				result[j] = arr[i];
				j++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task31(int shopper) {
		int time = 0;
		for (int i = 0; i < shopper; i++) {
			time += i;
		}
		System.out.println("Result: " + time);
	}

	public static void task32() {
		int[] arr = new int[10];
		Random rd = new Random();
		arr[rd.nextInt(9)] = 1 + rd.nextInt(6);
		while (true) {
			int index = rd.nextInt(9);
			if (arr[index] == 0) {
				arr[index] = 1 + rd.nextInt(6);
				break;
			}
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		while (true) {
			boolean isOk = false;
			int[] result = new int[10];
			System.arraycopy(arr, 0, result, 0, 10);
			for (int i = 0; i < result.length; i++) {
				if (result[i] == 0) {
					result[i] = 1 + rd.nextInt(6);
				}
			}
			for (int i = 0; i < result.length - 2; i++) {
				if (result[i] + result[i + 1] + result[i + 2] == 10) {
					isOk = true;
					break;
				}
			}
			if (isOk) {
				System.out.println("Result:");
				System.out.println(Arrays.toString(result));
				return;
			}
		}
	}

	public static void task33(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int[] countRepetition = new int[arr.length];

		for (int i = 0; i < countRepetition.length; i++) {
			int iElementCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					iElementCount++;
				}
			}
			countRepetition[i] = iElementCount;
		}
		int max = countRepetition[0];
		int indexMax = 0;
		for (int i = 0; i < countRepetition.length; i++) {
			if (countRepetition[i] > max) {
				max = countRepetition[i];
				indexMax = i;
			}
		}
		int min = arr[indexMax];
		for (int i = 0; i < countRepetition.length; i++) {

			if (arr[i] < min && countRepetition[i] == max) {
				min = arr[i];
			}
		}
		System.out.println("Result: " + min);
	}

	public static void task34(int[] arr, int a) {
		if (a < 0) {
			System.out.println("Incorrect data!!!The second parameter should be not negative");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1 || arr[i] < 0) {
				System.out.println("Incorrect data!!!The sequence does not contain only 0 and 1");
				return;
			}
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				a += 2;
			} else if (a != 0) {
				a -= 1;
			} else {
				continue;
			}
		}
		System.out.println("Result: " + a);
	}

	public static void task35(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int[] result;
		if (arr.length % 2 == 0) {
			result = new int[arr.length / 2];
		} else {
			result = new int[arr.length / 2 + 1];
		}

		int j = 0;
		for (int i = 0; i < arr.length; i = i + 2) {
			result[j] = arr[i];
			j++;
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task36(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			}
		}
		int[] result = new int[arr.length - countZero];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[j] = arr[i];
				j++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task37(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int[] evenIndexArray;
		int[] notEvenIndexArray = new int[arr.length / 2];

		if (arr.length % 2 == 0) {
			evenIndexArray = new int[arr.length / 2];

		} else {
			evenIndexArray = new int[arr.length / 2 + 1];
		}

		int j = 0;
		for (int i = 0; i < arr.length; i = i + 2) {
			evenIndexArray[j] = arr[i];
			j++;
		}
		j = 0;
		for (int i = 1; i < arr.length; i = i + 2) {
			notEvenIndexArray[j] = arr[i];
			j++;
		}
		System.out.println("Result:");
		System.out.println("Even: " + Arrays.toString(evenIndexArray));
		System.out.println("Not even: " + Arrays.toString(notEvenIndexArray));
	}

	public static void task38(int[] arr, int m) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		System.out.println("Result:");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == m) {
					System.out.println(arr[i] + "\t" + arr[j]);
				}
			}
		}

	}
	
	public static void task39(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int countMin = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
				countMin = 0;
			}
			if (arr[i] == min) {
				countMin++;
			}
		}
		int average = sum / arr.length;

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				temp++;
			}
			if (temp == countMin) {
				arr[i] = average;
				break;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));

	}
	
	public static void task40(int[] arrA, int[] arrB) {
		if (arrA.length != arrB.length) {
			System.out.println("Length of arrays is not equal!!!");
			return;
		}
		System.out.println("Your array A:");
		System.out.println(Arrays.toString(arrA));
		System.out.println("Your array B:");
		System.out.println(Arrays.toString(arrB));

		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] < 0) {
				arrB[i] = arrB[i] * 10;
			} else {
				arrB[i] = 0;
			}
		}
		System.out.println("Result array B:");
		System.out.println(Arrays.toString(arrB));

	}
	
	public static void task41(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			} else {
				continue;
			}
		}
		if (min < 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * min * min;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * max * max;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));	
	}
	
	public static void task42(int[] arrX, int[] arrY) {
		if (arrX.length != arrY.length) {
			System.out.println("Length of arrays is not equal!!!");
			return;
		}
		System.out.println("Your array A:");
		System.out.println(Arrays.toString(arrX));
		System.out.println("Your array B:");
		System.out.println(Arrays.toString(arrY));

		double max = Math.sqrt(Math.pow((arrX[1] - arrX[0]), 2) + Math.pow((arrY[1] - arrY[0]), 2));
		int indexFirstPoint = 0;
		int indexSecondPoint = 0;

		for (int i = 0; i < arrX.length; i++) {
			for (int j = i + 1; j < arrY.length; j++) {
				System.out.println(i + "\t" + j + "\t"
						+ Math.sqrt(Math.pow((arrX[j] - arrX[i]), 2) + Math.pow((arrY[j] - arrY[i]), 2)));
				if (Math.sqrt(Math.pow((arrX[j] - arrX[i]), 2) + Math.pow((arrY[j] - arrY[i]), 2)) > max) {
					indexFirstPoint = i;
					indexSecondPoint = j;
					max = Math.sqrt(Math.pow((arrX[j] - arrX[i]), 2) + Math.pow((arrY[j] - arrY[i]), 2));
				}
			}
		}
		System.out.println("Result :" + "(" + arrX[indexFirstPoint] + ";" + arrY[indexFirstPoint] + ")" + "("
				+ arrX[indexSecondPoint] + ";" + arrY[indexSecondPoint] + ")");
	}
	
	public static void task43(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			} else {
				continue;
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min && arr[i] < max) {
				sum += arr[i];
			}
		}
		System.out.println("Result: " + sum);
	}
	
	public static void task44(double[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println(average);
		System.out.println("Result: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > average) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void task45(int[] arr, int k) {
		if (k < 0 || k > 9) {
			System.out.println("The second parameter is not a digit!!!");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == k) {
				count++;
			}
		}
		int[] result = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == k) {
				result[j] = arr[i];
				j++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(result));
	}

	public static void task46(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);

		System.out.println("Result:");
		int i = 0;
		do {
			if (arr[i] != arr[i + 1]) {
				for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
					System.out.print(j + " ");
				}
			}
			i++;
		} while (arr[i] < arr[arr.length - 1]);
	}

	public static void task47(double[] arr, double x) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		double min = Math.abs((double) (arr[0] + arr[1]) / 2 - x);
		int firstPoint = 0;
		int secondPoint = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + " " + arr[j] + " " + Math.abs((double) (arr[i] + arr[j]) / 2 - x));
				if (Math.abs((double) (arr[i] + arr[j]) / 2 - x) < min) {
					min = (arr[i] + arr[j]) / 2 - x;
					firstPoint = i;
					secondPoint = j;
				}
			}
		}
		System.out.println("Result: " + arr[firstPoint] + " " + arr[secondPoint]);
	}
	
	
	public static void task48(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		System.out.println("Result: ");
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == element) {
					count++;
					if (count > 1) {
						break;
					}
				}
			}
			if (count == 1) {
				System.out.print(element + " ");
			}
		}
	}

	public static void task49(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > 80) {
				System.out.println("Incorrect age!!!0<=age<=80");
				return;
			}
		}
		int min = 0;
		int max = 10;
		int count;
		System.out.println("Result: ");
		do {
			System.out.println("Interval: " + "[" + min + ";" + max + "]");
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= min && arr[i] < max) {
					count++;
				}
			}
			System.out.println("Count:" + count);
			min += 10;
			max += 10;
		} while (min < 80);
	}
	
	public static void task50(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		int[] result = new int[arr.length];
		int countZero = 0;
		int countNegative = 0;

		for (int i = 0; i < result.length; i++) {
			if (arr[i] < 0) {
				countNegative++;
			} else if (arr[i] > 0) {
				continue;
			} else {
				countZero++;
			}
		}
		int indexNegative = 0;
		int indexZero = countNegative;
		int indexPositive = countNegative + countZero;
		for (int i = 0; i < result.length; i++) {
			if (arr[i] < 0) {
				result[indexNegative++] = arr[i];
			} else if (arr[i] > 0) {
				result[indexPositive++] = arr[i];
			} else {
				result[indexZero++] = arr[i];
			}
		}
		System.out.println("Result: ");
		System.out.println(Arrays.toString(result));
	}
	
	public static void task51(int[] arr) {
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The length of array should be even number!!!");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		double minRadius = Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2));

		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i] + " " + arr[i + 1] + " " + Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[i + 1], 2)));
			if (Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[i + 1], 2)) > minRadius) {
				minRadius = Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[i + 1], 2));
			}
		}
		System.out.println("Result: " + minRadius);
	}
	
	public static void task52(int[] arr, double step) {
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The length of array should be even number!!!");
			return;
		}
		if (step <= 0) {
			System.out.println();
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));

		double minRadius = Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2));

		for (int i = 0; i < arr.length; i = i + 2) {
			if (Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[i + 1], 2)) > minRadius) {
				minRadius = Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[i + 1], 2));
			}
		}

		System.out.println("Result:");
		double x = 0;
		double y;
		while (true) {
			y = Math.sqrt(minRadius * minRadius - x * x);
			System.out.println("(" + x + ";" + y + ")");
			x = x + step;
			if (x > minRadius) {
				System.out.println("(" + minRadius + ";0)");
				break;
			}

		}
		y = 0 - step;
		while (true) {
			x = Math.sqrt(minRadius * minRadius - y * y);
			System.out.println("(" + x + ";" + y + ")");
			y = y - step;
			if (y < -minRadius) {
				System.out.println("(0;" + (-minRadius) + ")");
				break;
			}

		}
		x = 0 - step;
		while (true) {
			y = Math.sqrt(minRadius * minRadius - x * x);
			System.out.println("(" + x + ";" + y + ")");
			x = x - step;
			if (x < -minRadius) {
				System.out.println("(" + (-minRadius) + ";0)");
				break;
			}

		}
		y = 0 + step;
		while (true) {
			x = Math.sqrt(minRadius * minRadius - y * y);
			System.out.println("(" + x + ";" + y + ")");
			y = y + step;
			if (y > minRadius) {
				System.out.println("(0;" + minRadius + ")");
				break;
			}

		}
	}
	//begin task 53
	public static void task53(int[] arr) {
		// The solution with use only one dimensional arrays
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The length of array should be even number!!!");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: ");
		int[] result = null;
		for (int i = 0; i < arr.length; i = i + 2) {
			double[] distanceBetweenPoints = new double[arr.length / 2];
			int indexDistance = 0;
			// all possible distance
			for (int j = 0; j < arr.length; j = j + 2) {
				distanceBetweenPoints[indexDistance++] = Math
						.sqrt(Math.pow(arr[j] - arr[i], 2) + Math.pow(arr[j + 1] - arr[i + 1], 2));
			}
			// is distance
			result = findFourPoints(distanceBetweenPoints, arr, i / 2);
			if (result != null) {
				break;
			}
		}
		if (result == null) {
			System.out.println("There is not square!!!");
		} else {
			System.out.println("(" + result[0] + ";" + result[1] + ")\t" + "(" + result[2] + ";" + result[3] + ")\t"
					+ "(" + result[4] + ";" + result[5] + ")\t" + "(" + result[6] + ";" + result[7] + ")\t");
		}
	}

	private static int[] findFourPoints(double[] distanceBetweenPoints, int[] arr, int i) {
		for (int j = 0; j < distanceBetweenPoints.length; j++) {
			if (distanceBetweenPoints[j] != 0) {
				double length = distanceBetweenPoints[j];
				for (int k = j + 1; k < distanceBetweenPoints.length; k++) {
					if (length == distanceBetweenPoints[k]) {
						if (isRightAngleBetweenThreePoints(arr[i * 2], arr[i * 2 + 1], arr[j * 2], arr[j * 2 + 1],
								arr[k * 2], arr[k * 2 + 1])) {
							// is three possible points, need to find 4 point

							for (int index = 0; index < arr.length; index = index + 2) {
								// point should not be like the first
								if (arr[index] != arr[i * 2] && arr[index + 1] != arr[i * 2 + 1]) {
									if (isFourthPoint(length, arr[index], arr[index + 1], arr[j * 2], arr[j * 2 + 1],
											arr[k * 2], arr[k * 2 + 1])) {
										return new int[] { arr[i * 2], arr[i * 2 + 1], arr[j * 2], arr[j * 2 + 1],
												arr[k * 2], arr[k * 2 + 1], arr[index], arr[index + 1] };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	private static Boolean isRightAngleBetweenThreePoints(int x1, int y1, int x2, int y2, int x3, int y3) {
		int vectorOneX = x2 - x1;
		int vectorOneY = y2 - y1;
		int vectorTwoX = x3 - x1;
		int vectorTwoY = y3 - y1;
		if ((vectorOneX * vectorTwoX + vectorOneY * vectorTwoY) == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean isFourthPoint(double distance, int x4, int y4, int x2, int y2, int x3, int y3) {
		if (Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2)) != distance) {
			return false;
		}
		if (Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)) != distance) {
			return false;
		}
		if (!isRightAngleBetweenThreePoints(x4, y4, x2, y2, x3, y3)) {
			return false;
		}
		return true;
	}

	// end task 53

	// begin task 54
	public static void task54(int[] arr) {
		// The solution with use only one dimensional arrays
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!The length of array should be even number!!!");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: ");
		int[] result = null;
		for (int i = 0; i < arr.length; i = i + 2) {
			double[] distanceBetweenPoints = new double[arr.length / 2];
			int indexDistance = 0;
			// all possible distance
			for (int j = 0; j < arr.length; j = j + 2) {
				distanceBetweenPoints[indexDistance++] = Math
						.sqrt(Math.pow(arr[j] - arr[i], 2) + Math.pow(arr[j + 1] - arr[i + 1], 2));
			}
			// is distance
			result = findThreePoint(distanceBetweenPoints, arr, i / 2);
			if (result != null) {
				break;
			}
		}
		if (result == null) {
			System.out.println("There is not isosceles triangle!!!");
		} else {
			System.out.println("(" + result[0] + ";" + result[1] + ")\t" + "(" + result[2] + ";" + result[3] + ")\t"
					+ "(" + result[4] + ";" + result[5] + ")\t");
		}
	}

	private static int[] findThreePoint(double[] distanceBetweenPoints, int[] arr, int i) {
		for (int j = 0; j < distanceBetweenPoints.length; j++) {
			if (distanceBetweenPoints[j] != 0) {
				double length = distanceBetweenPoints[j];
				for (int k = j + 1; k < distanceBetweenPoints.length; k++) {
					if (length == distanceBetweenPoints[k]
							&& (arr[j * 2] != arr[k * 2] || arr[j * 2 + 1] != arr[k * 2 + 1])) {
						if (isEqualAngle(arr[i * 2], arr[i * 2 + 1], arr[j * 2], arr[j * 2 + 1], arr[k * 2],
								arr[k * 2 + 1])) {
							return new int[] { arr[i * 2], arr[i * 2 + 1], arr[j * 2], arr[j * 2 + 1], arr[k * 2],
									arr[k * 2 + 1] };
						}
					}
				}
			}
		}
		return null;
	}

	private static Boolean isEqualAngle(int x1, int y1, int x2, int y2, int x3, int y3) {
		int vectorOneX = x2 - x1;
		int vectorOneY = y2 - y1;
		int vectorTwoX = x3 - x1;
		int vectorTwoY = y3 - y1;
		int vectorThreeX = x3 - x2;
		int vectorThreeY = y3 - y2;
		double lengthVectorOne = Math.sqrt(vectorOneX * vectorOneX + vectorOneY * vectorOneY);
		double lengthVectorTwo = Math.sqrt(vectorTwoX * vectorTwoX + vectorTwoY * vectorTwoY);
		double lengthVectorThree = Math.sqrt(vectorThreeX * vectorThreeX + vectorThreeY * vectorThreeY);
		if (Math.abs(
				(vectorOneX * vectorThreeX + vectorOneY * vectorThreeY) / (lengthVectorOne * lengthVectorThree)) == Math
						.abs((vectorTwoX * vectorThreeX + vectorTwoY * vectorThreeY)
								/ (lengthVectorTwo * lengthVectorThree))) {
			return true;
		}
		return false;
	}
	//end task 54
	
	public static void task55(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: ");
		System.out.println("index:\telement:");
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element > 0) {
				boolean isSimple = true;
				for (int j = 2; j <= Math.sqrt(element); j++) {
					if (element % j == 0) {
						isSimple = false;
						break;
					}
				}
				if (isSimple) {
					System.out.println(i + "\t" + element);
				}
			}
		}
	}

	public static void task56(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (isUnique(arr, element)) {
				count++;
			}
		}
		System.out.println("Result: " + count);
	}
	
	public static void task57(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (isUnique(arr, element)) {
				count++;
			}
		}
		int[] result = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (isUnique(arr, element)) {
				result[j] = element;
				j++;
			}
		}
		System.out.println("Result: ");
		System.out.println(Arrays.toString(result));
	}

	// for task 56 and 57
	private static Boolean isUnique(int[] arr, int element) {
		int countOfElement = 0;
		for (int j = 0; j < arr.length; j++) {
			if (element == arr[j]) {
				countOfElement++;
				if (countOfElement > 1) {
					return false;
				}
			}
		}
		return true;
	}
	//end
	
	public static void task58(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1000 || arr[i] > 9999) {
				System.out.println("Incorrect data!!!999<element<10000");
				return;
			}
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: ");
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			int firstNumber = element / 100;
			int secontNumber = element % 100;
			if (sumDigitOfNumber(firstNumber) == sumDigitOfNumber(secontNumber)) {
				System.out.print(element + " ");
			}
		}
	}

	// for 58 task
	private static int sumDigitOfNumber(int number) {
		int sum = 0;
		do {
			sum += number % 10;
			number /= 10;
		} while (number > 0);
		return sum;
	}
	// end
	
	public static void task59(int[] arrA, int[] arrB) {
		System.out.println("Your array:");
		System.out.println("A: " + Arrays.toString(arrA));
		System.out.println("B: " + Arrays.toString(arrB));
		int length;
		if (arrA.length < arrB.length) {
			length = arrA.length;
		} else {
			length = arrB.length;
		}
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (arrA[i] == arrB[i]) {
				count++;
			}
		}
		System.out.println("Result: " + count);
	}
	
	public static void task60(int[] arrA, int[] arrB) {
		System.out.println("Your array:");
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		System.out.println("A: " + Arrays.toString(arrA));
		System.out.println("B: " + Arrays.toString(arrB));
		System.out.println("Result:");
		int[] result = new int[arrA.length + arrB.length];
		int aIndex = 0;
		int bIndex = 0;
		while (true) {
			if (aIndex >= arrA.length) {
				System.arraycopy(arrB, bIndex, result, aIndex + bIndex, arrB.length - bIndex);
				System.out.println(Arrays.toString(result));
				return;
			}
			if (bIndex >= arrB.length) {
				System.arraycopy(arrA, aIndex, result, aIndex + bIndex, arrA.length - aIndex);
				System.out.println(Arrays.toString(result));
				return;
			}
			if (arrA[aIndex] < arrB[bIndex]) {
				result[aIndex + bIndex] = arrA[aIndex++];
			} else {
				result[aIndex + bIndex] = arrB[bIndex++];
			}
		}
	}
}
