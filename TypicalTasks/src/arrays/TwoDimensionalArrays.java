package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoDimensionalArrays {

	public static void task80(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
				} else {
					arr[i][j] = arr.length - j;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task81(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i + j == arr.length - 1) {
					arr[i][j] = i + 1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task82(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					arr[i][j] = arr.length - i;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task83(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					arr[i][j] = (i + 1) * (j + 2);
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task84(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1) {
					arr[i][j] = 1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task85(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr.length - i > j) {
					arr[i][j] = i + 1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task86(int n) {
		int[][] arr = new int[n][n];
		if (arr.length%2!=0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (i < arr.length - j && i <= j) {
						arr[i][j] = 1;
					}else if (i>=j && i > arr.length/2 ) {
						arr[i][j] = arr.length + j - i;
					}
				}
			}
		}else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (i < arr.length - j && i <= j) {
						arr[i][j] = 1;
					}else if (i>=j && i >= arr.length/2 ) {
						arr[i][j] = arr.length + j - i;
					}
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	public static void task87(int n) {
		int[][] arr = new int[n][n];
		if (arr.length%2!=0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (i<=arr.length/2&&!(i+1 < arr.length - j && i < j)) {
						arr[i][j] = 1;
					}else if (i+j<arr.length && i >= arr.length/2) {
						arr[i][j]= i - j + 1;
					}
				}
			}
		}else {
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (i<arr.length/2&&!(i+1 < arr.length - j && i < j)) {
						arr[i][j] = 1;
					}else if (i+j<arr.length && i >= arr.length/2) {
						arr[i][j]= i - j + 1;
					}
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task88(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i >= j) {
					arr[i][j]= i - j + 1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task89(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i < arr.length - j) {
					arr[i][j]=j+i+1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task90(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i ==j) {
					arr[i][j]=i+1;
				}
				if (arr.length-j-1==i) {
					arr[i][j]=arr.length-i;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	public static void task91(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Math.abs(j-i)+1;
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task92(int n) {
		int[][] arr = new int[2*n][2*n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i<arr.length/2) {
					if (j<arr.length/2) {
						arr[i][j] = 1;
					}else {
						arr[i][j] = 2;
					}
				}else {
					if (j<arr.length/2) {
						arr[i][j] = 3;
					}else {
						arr[i][j] = 4;
					}
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	public static void task93(int n, int x) {
		int[][] arr = new int[n+1][n+1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 || i == arr.length - 1) {
					arr[i][j] = (int)Math.pow(x, Math.abs(j - i));
				}else if (j == 0 || j == arr.length - 1) {
					arr[i][j] = (int)Math.pow(x, Math.abs(i - j));
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task94(int[] array) {
		int[][] arr = new int[array.length][array.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = array[k];
				k++;
				if (k==arr.length) {
					k = 0;
				} 
			}
			k=i+1;
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task95(int n) {
		int[][] arr = new int[n][n];
		int arg = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i<=j) {
					arr[i][j] = arg;
					arg++;
				}
			}
			arg = 1;
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task96(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i==j) {
					arr[i][j] = 1;
				}else if (i==arr.length - j - 1) {
					arr[i][j] = 1;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task97(int n) {
		int[][] arr = new int[n][n];
		int i = 0;
		int j;
		int k = 0;
		int p = 1;

		while (i < n * n) {
			k++;
			for (j = k - 1; j < n - k + 1; j++) {
				arr[k - 1][j] = p++;
				i++;
			}

			for (j = k; j < n - k + 1; j++) {
				arr[j][n - k] = p++;
				i++;
			}

			for (j = n - k - 1; j >= k - 1; j--) {
				arr[n - k][j] = p++;
				i++;
			}

			for (j = n - k - 1; j >= k; j--) {
				arr[j][k - 1] = p++;
				i++;
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task98(int[][] arr) {
		if (arr.length!=arr[0].length||arr.length%2!=0) {
			System.out.println("Incorrect data!!!The matrix is not square matrix with even size");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int[][] result = new int[arr.length][arr.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				if (i<result.length/2) {
					if (j<result.length/2) {
						result[i][j]=arr[i+result.length/2][j];
					}else {
						result[i][j]=arr[i][j- result.length/2];
					}
				}else {
					if (j<result.length/2) {
						result[i][j]=arr[i][j+result.length/2];
					}else {
						result[i][j]=arr[i-result.length/2][j];
					}
				}
			}
		}	
		System.out.println("Result: ");
		printTwoDimensionalArray(result);
	}
	public static void task99(int[][] arr) {
		if (arr.length!=arr[0].length||arr.length%2!=0) {
			System.out.println("Incorrect data!!!The matrix is not square matrix with even size");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int[][] result = new int[arr.length][arr.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				if (i<result.length/2) {
					if (j<result.length/2) {
						result[i][j]=arr[i+result.length/2][j+result.length/2];
					}else {
						result[i][j]=arr[i+result.length/2][j- result.length/2];
					}
				}else {
					if (j<result.length/2) {
						result[i][j]=arr[i-result.length/2][j+result.length/2];
					}else {
						result[i][j]=arr[i-result.length/2][j-result.length/2];
					}
				}
			}
		}	
		System.out.println("Result: ");
		printTwoDimensionalArray(result);
	}
	
	public static void task100(int[] array) {
		int[][] arr = new int[array.length][array.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int)Math.pow(array[j], i+1);
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task101(int[] array) {
		int[][] arr = new int[array.length][array.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int)Math.pow(array[j], i);
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	public static void task102(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = i*n + j + 1;
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task103(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i==j) {
					arr[i][j] = i;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task104(int[][] arr) {

	}

	public static void task105(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				if (arr[i][j] > 0) {	
					sum += arr[i][j];
					count++;
				}
			}
		}
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);

	}

	public static void task106(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of " + i + "row = " + sum);
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > sum) {
					count++;
				}
			}
			sum = 0;
		}
		System.out.println("Count: " + count);
	}

	public static void task107(int[][] arr, int m) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		if (m >= arr.length) {
			System.out.println("Incorrect data!!!Your row is bigger than size - 1");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int row = 0;
		int max = arr[0][0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i][i] > max) {
				max = arr[i][i];
				row = i;
			}
		}
		swapRowInMatrix(arr, row, m);
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
	}

	private static void swapRowInMatrix(int[][] arr, int row1, int row2) {
		int[] temp = new int[arr.length];
		for (int j = 0; j < temp.length; j++) {
			temp[j] = arr[row1][j];
		}
		for (int j = 0; j < temp.length; j++) {
			arr[row1][j] = arr[row2][j];
			arr[row2][j] = temp[j];
		}
	}

	public static void task108(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int max = Integer.MIN_VALUE;
		int indexColumnMax = 0;
		int min = Integer.MAX_VALUE;
		int indexColumnMin = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					indexColumnMax = j;
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
					indexColumnMin = j;
				}
			}
			swap(arr, i, 0, i, indexColumnMin);
			swap(arr, i, arr[0].length - 1, i, indexColumnMax);
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}

		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
	}

	private static void swap(int[][] arr, int i1, int j1, int i2, int j2) {
		int temp = arr[i1][j1];
		arr[i1][j1] = arr[i2][j2];
		arr[i2][j2] = temp;
	}

	public static void task109(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		// Sum elements in magic square
		int sum = arr.length * (arr.length * arr.length + 1) / 2;
		int checkSum = 0;

		// Row
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				checkSum += arr[i][j];
			}
			if (checkSum != sum) {
				System.out.println("False!!!");
				return;
			}
			checkSum = 0;
		}

		// Column
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				checkSum += arr[i][j];
			}
			if (checkSum != sum) {
				System.out.println("False!!!");
				return;
			}
			checkSum = 0;
		}

		System.out.println("True!!! ");
	}

	public static void task110(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		System.out.println("Result:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (isPointSaddle(arr, i, j)) {
					System.out.println("[" + i + ";" + j + "] = " + arr[i][j]);
				}
			}
		}
	}

	private static boolean isPointSaddle(int[][] arr, int x, int y) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[x][i] < min) {
				min = arr[x][i];
			}
			if (arr[i][y] > max) {
				max = arr[i][y];
			}
		}
		if (arr[x][y] == min && arr[x][y] == max) {
			return true;
		}
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[x][i] > max) {
				max = arr[x][i];
			}
			if (arr[i][y] < min) {
				min = arr[i][y];
			}
		}
		if (arr[x][y] == min && arr[x][y] == max) {
			return true;
		}
		return false;
	}
	
	public static void task111(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int max = arr[0][0];
		int iMax = 0;
		int jMax = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					iMax = i;
					jMax = j;
				}
			}
		}
		swapRowInMatrix(arr, 0, iMax);
		swapColumnInMatrix(arr, 0, jMax);

		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	private static void swapColumnInMatrix(int[][] arr, int column1, int column2) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i][column1];
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i][column1] = arr[i][column2];
			arr[i][column2] = temp[i];
		}
	}

	public static void task112(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[j][i]) {
					System.out.println("False!!!");
					return;
				}
			}
		}
		System.out.println("True!!!");
	}

	public static void task113(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int max = Integer.MIN_VALUE;
		int jMax = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					jMax = j;
				}
			}
			swap(arr, i, i, i, jMax);
			max = Integer.MIN_VALUE;
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task114(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int i = 0; i < arr.length; i++) {
			int[] temp = new int[arr[0].length];
			for (int j = 0; j < arr[0].length; j++) {
				temp[j] = arr[i][j];
			}
			Arrays.sort(temp);
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = temp[j];
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task115(int[][] arr, int k) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int max = Math.abs(arr[0][0]);
		int iMax = 0;
		int jMax = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (Math.abs(arr[i][j]) > max) {
					max = Math.abs(arr[i][j]);
					iMax = i;
					jMax = j;
				}
			}
		}
		swapRowInMatrix(arr, k, iMax);
		swapColumnInMatrix(arr, k, jMax);

		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task116(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		System.out.println("Result Matrix: ");
		printTwoDimensionalArray(arr);

		System.out.println("Result: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i >= j) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void task117(int[][] arr) {

		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int indexMinI = 0;
		int indexMinJ = 0;
		int indexMaxI = 0;
		int indexMaxJ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					indexMinI = i;
					indexMinJ = j;
				}
			}
			if (min > max) {
				max = min;
				indexMaxI = indexMinI;
				indexMaxJ = indexMinJ;
			}
			min = Integer.MAX_VALUE;
		}
		System.out.println("Result: ");
		System.out.println("[" + indexMaxI + ";" + indexMaxJ + "] = " + arr[indexMaxI][indexMaxJ]);
	}

	public static void task118(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		if (arr.length % 2 != 1) {
			System.out.println("Incorrect data!!!The matrix should be not even");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int max = arr[0][0];
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] > max) {
				max = arr[i][i];
				maxI = i;
				maxJ = i;
			}
			if (arr[i][arr.length - i - 1] > max) {
				max = arr[i][arr.length - i - 1];
				maxI = i;
				maxJ = arr.length - i - 1;
			}
		}
		swap(arr, arr.length / 2, arr.length / 2, maxI, maxJ);
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task119(double[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int index = 0;
		double[] arr1D;
		if (arr.length%2==0) {
		 arr1D = new double[arr.length*2]; 
			for (int i = 0; i < arr.length; i++) {
				arr1D[index++] = arr[i][i];
				arr1D[index++] = arr[i][arr.length - i - 1];
			}
		}else {
			arr1D = new double[arr.length*2 - 1];
			for (int i = 0; i < arr.length; i++) {
				if (i!=arr.length - i - 1) {
					arr1D[index++] = arr[i][arr.length - i - 1];
					arr1D[index++] = arr[i][i];
				}else {
					arr1D[index++] = arr[i][i];
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < arr1D.length; i++) {
			sum+=arr1D[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = arr[i][j]/sum;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task120(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}

		int[][] result = new int[arr.length][arr.length];
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[j][i] = arr[i][j];
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(result);
	}

	public static void task121(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i <= j) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print(0 + "\t");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < j) {
					arr[j][i] = arr[i][j];
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task122(double[][] arr, int k) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		if (k >= arr.length) {
			System.out.println("Incorrect data!!!Your row is bigger than size - 1");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int j = 0; j < arr.length; j++) {
			arr[k][j] = arr[k][j] / arr[k][k];
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task123(int[][] arr, int k) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] % k == 0) {
					if (arr[i][j] > max) {
						max = arr[i][j];
						count++;
					}
					System.out.println("[" + i + ";" + j + "] = " + arr[i][j]);
				}
			}
		}
		System.out.println("Count: " + count);
		System.out.println("Max: " + max);
	}
	
	public static void task124(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxI = 0;
		int maxJ = 0;
		int minI = 0;
		int minJ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxI = i;
					maxJ = j;
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
					minI = i;
					minJ = j;
				}
			}
		}
		swap(arr, minI, minJ, maxI, maxJ);
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task125(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int minI = 0;
		int maxI = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			if (sum > max) {
				max = sum;
				maxI = i;
			}
			if (sum < min) {
				min = sum;
				minI = i;
			}
			sum = 0;
		}
		System.out.println("Min: ");
		for (int j = 0; j < arr.length; j++) {
			sum += arr[minI][j];
			System.out.print(arr[minI][j] + "\t");
		}
		System.out.println("Sum min: " + sum);
		sum = 0;
		System.out.println("Max: ");
		for (int j = 0; j < arr.length; j++) {
			sum += arr[maxI][j];
			System.out.print(arr[maxI][j] + "\t");
		}
		System.out.println("Sum max: " + sum);
	}
	
	public static void task126(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int minI = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					minI = i;
				}
			}
		}
		System.out.println("Min: ");
		for (int j = 0; j < arr.length; j++) {
			sum += arr[minI][j];
			System.out.print(arr[minI][j] + "\t");
		}
		System.out.println("Sum: " + sum);
	}

	public static void task127(double[][] arr) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		double max = Double.MIN_VALUE;
		int maxI = 0;
		int maxJ = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (Math.abs(arr[i][j]) > max) {
					max = Math.abs(arr[i][j]);
					maxI = i;
					maxJ = j;
				}
			}
		}

		double[][] result = new double[arr.length - 1][arr.length - 1];
		for (int i = 0, k = 0; i < result.length; i++, k++) {
			if (k == maxI) {
				k++;
			}
			for (int j = 0, m = 0; j < result.length; j++, m++) {
				if (m == maxJ) {
					m++;
				}
				result[i][j] = arr[k][m];
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(result);
	}

	public static void task128(int[][] arr, int k) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		if (k >= arr.length) {
			System.out.println("Incorrect data!!!Your row is bigger than size - 1");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int i = 0; i < arr.length; i++) {
			swap(arr, k, i, i, k);
		}

		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task129(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] -= arr[arr.length - 1][j];
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}

	public static void task130(int[][] arr, int[] arr1D) {
		if (arr[0].length != arr1D.length) {
			System.out.println("Size of one-dimensional array are not equal size of two-dimensional");
		}
		System.out.println("Your 2D-array: ");
		printTwoDimensionalArray(arr);
		System.out.println("Your 1D-array: ");
		System.out.println(Arrays.toString(arr1D));
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != arr1D[j]) {
					break;
				}
				if (j == arr[0].length - 1) {
					System.out.println("Row ¹ " + i);
				}
			}
		}
	}
	
	public static void task131(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int min = Integer.MAX_VALUE;
		System.out.println();
		for (int i = 0; i < arr.length; i = i + 2) {
			for (int j = 0; j < arr[0].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
			System.out.println("For i = " + i + " Min = " + min);
			min = Integer.MAX_VALUE;
		}
	}
	
	public static void task132(int[][] arr, int k) {
		if (k >= arr.length) {
			System.out.println("Incorrect data!!!Your row is bigger than size - 1");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int min = Integer.MAX_VALUE;
		int minIndexJ = 0;
		int iteration = 0;
		do {
			for (int j = iteration; j < arr[0].length; j++) {
				if (arr[k][j] < min) {
					min = arr[k][j];
					minIndexJ = j;
				}
			}
			swapColumnInMatrix(arr, iteration, minIndexJ);
			min = Integer.MAX_VALUE;
			iteration++;
		} while (iteration < arr[0].length - 1);
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task133(int[][] arr, int c, int d) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int min = Integer.MAX_VALUE;
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] ==c) {
					System.out.println("Row ¹" + i + " contains element: "+ c);
					for (int k = 0; k < arr[0].length; k++) {
						arr[i][k]*=d;
					}
					break;
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task134(int[][] arr) {
		if (arr[0].length % 4 != 0) {
			System.out.println("Incorrect data!!!M does not divide by 4!!!");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int sum = 0;
		for (int j = 0; j < arr[0].length / 2; j++) {
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of column ¹" + j + " = " + sum);
			sum = 0;
		}
		for (int i = 0; i < arr.length; i = i + 2) {
			for (int j = arr.length / 2; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of row ¹" + i + " from " + arr.length / 2 + " column is " + sum);
			sum = 0;
		}
	}
	
	public static void task135(int[][] arr, int k) {
		if (arr.length != arr[0].length) {
			System.out.println("Incorrect data!!!The matrix is not square matrix");
			return;
		}
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int count = 0;
		int[] temp = new int[arr.length];
		int sum = 0;
		boolean isOk = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < 0 && j < k) {
					isOk = false;
					break;
				}
				sum += arr[i][j];
			}
			if (isOk) {
				temp[count++] = sum;
			}
			sum = 0;
			isOk = true;
		}
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println("Result: ");
		System.out.println(Arrays.toString(result));
	}
	
	public static void task136(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		int min = Integer.MAX_VALUE;
		int maxI = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			if (min > max) {
				max = min;
				maxI = i;
			}
			min = Integer.MAX_VALUE;
		}
		System.out.println("Result: Row ¹" + maxI);
		for (int j = 0; j < arr[0].length; j++) {
			System.out.print(arr[maxI][j] + "\t");
		}
	}

	public static void task137(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				if (arr[i][j] == arr[i][j + 1] || arr[i + 1][j] == arr[i + 1][j + 1]) {
					continue;
				} else if (arr[i][j] == arr[i + 1][j] || arr[i][j + 1] == arr[i + 1][j + 1]) {
					continue;
				} else if (arr[i][j] == arr[i + 1][j + 1] || arr[i + 1][j] == arr[i][j + 1]) {
					continue;
				} else {
					count++;
				}
			}
		}
		System.out.println("Result: " + count);
	}
	
	public static void task138(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);
		int[] temp = new int[arr[0].length];
		for (int j = 0; j < temp.length; j++) {
			temp[j] = arr[0][j];
		}
		int[] arr1D = IntStream.of(temp).distinct().toArray();

		boolean isOk = false;
		int index = 0;
		System.out.println("Result: ");
		do {
			for (int i = 1; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][j] == arr1D[index]) {
						isOk = true;
					}
				}
				if (isOk) {
					continue;
				} else {
					isOk = false;
					break;
				}
			}
			if (isOk) {
				System.out.print(arr1D[index] + "\t");
			}
			isOk = false;
			index++;
		} while (index < arr1D.length);
	}
	
	public static void task139(int[][] arr) {
		System.out.println("Your array: ");
		printTwoDimensionalArray(arr);

		boolean[][] temp = new boolean[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					temp[i][j] = true;
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				if (temp[i][j]) {
					for (int k = 0; k < arr.length; k++) {
						arr[k][j] = 0;
					}
					for (int k = 0; k < arr[0].length; k++) {
						arr[i][k] = 0;
					}
				}
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void printTwoDimensionalArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	private static void printTwoDimensionalArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
