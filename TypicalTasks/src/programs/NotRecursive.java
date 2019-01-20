package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotRecursive {

	// 142 begin

	public static void task142(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (!isTriangle(x1, y1, x2, y2, x3, y3)) {
			System.out.println("Points do not describe the triangle");
			return;
		}
		double a = lengthBetweenPoints(x1, y1, x2, y2);
		double b = lengthBetweenPoints(x1, y1, x3, y3);
		double c = lengthBetweenPoints(x2, y2, x3, y3);

		double square = squareOfTriangleByGerone(a, b, c);

		System.out.println("Square: " + square);
	}

	private static Boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (isEqualPoint(x1, y1, x2, y2, x3, y3)) {
			return false;
		}
		int vectorOneX = x2 - x1;
		int vectorOneY = y2 - y1;
		int vectorTwoX = x3 - x1;
		int vectorTwoY = y3 - y1;

		double lengthVectorOne = Math.sqrt(vectorOneX * vectorOneX + vectorOneY * vectorOneY);
		double lengthVectorTwo = Math.sqrt(vectorTwoX * vectorTwoX + vectorTwoY * vectorTwoY);
		if (Math.abs((vectorOneX * vectorTwoX + vectorOneY * vectorTwoY) / (lengthVectorOne * lengthVectorTwo)) != 1) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean isEqualPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (((x1 == x2) && (y1 == y2)) || ((x1 == x3) && (y1 == y3)) || ((x2 == x3) && (y2 == y3))) {
			return true;
		} else {
			return false;
		}
	}

	private static double perimeterOfTriangle(double a, double b, double c) {
		return a + b + c;
	}

	private static double lengthBetweenPoints(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	private static double squareOfTriangleByGerone(double a, double b, double c) {
		double halfPerimeter = perimeterOfTriangle(a, b, c) / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
	}

	// 142 end

	// 143 begin
	public static void task143(int a, int b) {
		System.out.println("GCD(" + a + ";" + b + "):" + gcd(a, b));
		System.out.println("LCM(" + a + ";" + b + "):" + lcm(a, b));
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

	private static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return a * b / gcd;
	}
	// 143 end

	// 144 begin

	public static void task144(int[] arr) {
		System.out.println("GCD:" + Arrays.toString(arr) + " = " + gcdN(arr));
	}

	private static int gcdN(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int gcd = min;
		int[] simpleNumbers = allSimpleNumber(min);
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (!(arr[i] % gcd == 0)) {
					break;
				}
				if (i == arr.length - 1) {
					return gcd;
				}
			}
			for (int i = 1; i < simpleNumbers.length; i++) {
				if (gcd % simpleNumbers[i] == 0) {
					gcd /= simpleNumbers[i];
				}
			}
		}
	}

	private static int[] allSimpleNumber(int number) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		boolean isSimple = true;
		for (int i = 2; i < number; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isSimple = false;
					break;
				}
			}
			if (isSimple) {
				numbers.add(i);
			}
			isSimple = true;
		}
		return numbers.stream().mapToInt(i -> i).toArray();
	}
	// 144 end

	// 145 begin
	public static void task145(int[] arr) {
		System.out.println("LCM:" + Arrays.toString(arr) + " = " + lcmN(arr));
	}

	private static int lcmN(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int lcm = max;
		int multiplier = 1;
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (!(lcm % arr[i] == 0)) {
					break;
				}
				if (i == arr.length - 1) {
					return lcm;
				}
			}
			multiplier++;
			lcm = max * multiplier;
		}
	}
	// 145 end

	// 146 begin
	public static void task146(double a, double b, double c) {
		double min = minOfThreeNumbers(a, b, c);
		double max = maxOfThreeNumbers(a, b, c);
		System.out.println(min + " + " + max + " = " + (min + max));
	}

	private static double minOfThreeNumbers(double a, double b, double c) {
		if (a < b) {
			if (a < c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b < c) {
				return b;
			} else {
				return c;
			}
		}
	}

	private static double maxOfThreeNumbers(double a, double b, double c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	// 146 end

	public static void task147(double a) {
		System.out.println("Result:" + (6 * squareOfTriangleByGerone(a, a, a)));
	}
	
	// 148 begin
	public static void task148(int[][] arr) {
		if (arr[0].length != 2) {
			System.out.println("Size of array should be [n][2]!!!");
		}
		printPoints(arr);
		double max = Double.MIN_VALUE;
		double length;
		int firstPosition = 0;
		int secondPosition = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				length = lengthBetweenPoints(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
				if (length > max) {
					max = length;
					firstPosition = i;
					secondPosition = j;
				}
			}
		}
		System.out.println("Result: ");
		System.out.println("(" + arr[firstPosition][0] + ";" + arr[firstPosition][1] + ")\t" + "("
				+ arr[secondPosition][0] + ";" + arr[secondPosition][1] + ")\t");
	}

	private static void printPoints(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("(" + arr[i][0] + ";" + arr[i][1] + ")");
		}
	}
	// 148 end

	// 149 begin

	public static void task149(int a, int b, int c) {
		if (gcdN(new int[] { a, b, c }) == 1) {
			System.out.println("True!!!");
		} else {
			System.out.println("False!!!");
		}
	}

	// 149 end

	// 150 begin

	public static void task150() {
		for (int i = 1; i < 10; i = i + 1) {
			System.out.println(i + "! = " + factorial(i));
		}
	}

	private static int factorial(int number) {
		if (number < 0) {
			System.out.println("Incorrect data!!!Factorial can`t be calculate from negative number!!!");
			return -1;
		}
		int result = 1;
		for (int i = 2; i < number; i++) {
			result *= i;
		}
		return result;
	}

	// 150 end
}
