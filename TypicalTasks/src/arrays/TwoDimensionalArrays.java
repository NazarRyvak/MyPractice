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
	
	
	private static void printTwoDimensionalArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
