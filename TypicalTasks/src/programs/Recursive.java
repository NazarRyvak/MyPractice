package programs;

public class Recursive {

	public static int task186(int number) {
		if (number / 10 != 0)
			return number % 10 + task186(number / 10);
		else
			return number % 10;
	}

	public static void task187(int[] arr, int k) {
		if (k < arr.length / 2) {
			int tmp = arr[k];
			arr[k] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = tmp;
			task187(arr, k + 1);
		}
	}
	
	public static void task188(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i + ": " + fibonacci(i));
		}
	}

	private static int fibonacci(int arg) {
		return arg < 2 ? 1 : fibonacci(arg - 1) + fibonacci(arg - 2);
	}
	
	
	public static int task189(int number) {
		if (number / 10 != 0)
			return 1 + task189(number / 10);
		else
			return 1;
	}
	
	public static int task190(int m, int n) {
		return m == 0 || m == n ? 1 : task190(m, n - 1) + task190(m - 1, n - 1);
	}
	
	public static boolean task191(String str, int i, int j) {
		if (j > str.length() || i > str.length() || i < 0) {
			System.out.println("Incorrect data!!!");
			return false;
		}
		if (j <= i) {
			return true;
		}
		if (str.charAt(i) == str.charAt(j)) {
			return task191(str, i + 1, j - 1);
		} else {
			return false;
		}
	}
	
	public static int task192(int numberOne, int numberTwo) {
		if (numberTwo==0) {
			return numberOne;
		}else {
			return task192(numberTwo,numberOne%numberTwo);
		}
	}
	
	public static int task193(int number) {
		if (number > 10) {
			return Integer.valueOf(number % 10 + "" + task193(number / 10));
		} else {
			return number;
		}
	}
	
	public static int task194(int number, int p) {
		if (number >= p) {
			return Integer.valueOf(task194(number / p, p) + "" + number % p);
		} else {
			return number;
		}
	}
	
	public static int task195(String str, int i, int p) {
		if (i < str.length() - 1) {
			return (int) Math.pow(p, str.length() - i - 1) * Integer.valueOf(str.substring(i, i + 1))
					+ task195(str, i + 1, p);
		} else {
			return (int) Math.pow(p, str.length() - i - 1) * Integer.valueOf(str.substring(i, i + 1));
		}
	}
	
	public static long task196(int n, int i) {
		if (i < n) {
			return factorial(i) + task196(n, i + 2);
		} else {
			return factorial(n);
		}
	}
	
	private static long factorial(int n) {
		return n < 2 ? 1 : n * factorial(n - 1);
	}
	
	
}
