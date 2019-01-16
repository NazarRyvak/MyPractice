package arrays;

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
			for (int j = 0; j < arr.length; j++) {
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
			for (int j = 0; j < arr.length; j++) {
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
			for (int j = 0; j < arr.length; j++) {
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
			for (int j = 0; j < arr.length; j++) {
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
			for (int j = 0; j < arr.length; j++) {
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
			for (int j = 0; j < result.length; j++) {
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
			for (int j = 0; j < result.length; j++) {
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
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)Math.pow(array[j], i+1);
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task101(int[] array) {
		int[][] arr = new int[array.length][array.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)Math.pow(array[j], i);
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	public static void task102(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i*n + j + 1;
			}
		}
		System.out.println("Result: ");
		printTwoDimensionalArray(arr);
	}
	
	public static void task103(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {
					arr[i][j] = i;
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
	
}
