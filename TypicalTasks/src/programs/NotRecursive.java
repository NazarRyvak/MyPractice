package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import arrays.TwoDimensionalArrays;

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
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i + "! = " + factorial(i));
		}
	}

	private static int factorial(int number) {
		if (number < 0) {
			System.out.println("Incorrect data!!!Factorial can`t be calculate from negative number!!!");
			return -1;
		}
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	// 150 end

	// 151 begin

	public static void task151(int a, int b, int c, int d) {
		int[] sum = sum(a, b, c, d);
		System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + sum[0] + "/" + sum[1]);
		int[] division = division(a, b, c, d);
		System.out.println(a + "/" + b + " / " + c + "/" + d + " = " + division[0] + "/" + division[1]);
		int[] multiplication = multiplication(a, b, c, d);
		System.out.println(a + "/" + b + " * " + c + "/" + d + " = " + multiplication[0] + "/" + multiplication[1]);
	}

	private static int[] sum(int a, int b, int c, int d) {
		int lcm = lcm(b, d);
		int gcd = gcd((lcm / b * a + lcm / d * c), lcm);
		return new int[] { (lcm / b * a + lcm / d * c) / gcd, lcm / gcd };
	}

	private static int[] division(int a, int b, int c, int d) {
		int numerator = a * d;
		int denominator = b * c;
		int gcd = gcd(numerator, denominator);
		return new int[] { (numerator / gcd), (denominator / gcd) };
	}

	private static int[] multiplication(int a, int b, int c, int d) {
		int numerator = a * c;
		int denominator = b * d;
		int gcd = gcd(numerator, denominator);
		return new int[] { (numerator / gcd), (denominator / gcd) };
	}

	// 151 end

	// 152 begin
	public static void task152(int[] arr) {
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!Size of array should be even number");
			return;
		}
		double[][] matrix = new double[arr.length / 2][arr.length / 2];

		int indexI = 0;
		int indexJ = 0;

		for (int i = 0; i < arr.length - 1; i = i + 2) {
			for (int j = 0; j < arr.length - 1; j = j + 2) {
				matrix[indexI][indexJ] = lengthBetweenPoints(arr[i], arr[i + 1], arr[j], arr[j + 1]);
				indexJ++;
			}
			indexJ = 0;
			indexI++;
		}
		System.out.println("Result: ");
		printMatrix(matrix);
	}

	private static void printMatrix(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%.2f", arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	// 152 end

	public static void task153(double x, double y, double z, double t) {
		double hypotenuse = Math.sqrt(x * x + y * y);
		double square = squareOfTriangleByGerone(x, y, hypotenuse) + squareOfTriangleByGerone(z, t, hypotenuse);
		if (Double.isNaN(square)) {
			System.out.println("The quadrangle with your sides of quadrangle does not exist!!!");
			return;
		}
		System.out.println("Square: " + square);
	}

	public static void task154(int n) {
		int[][] arr = new int[n][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][1] = factorial(i);
		}
		System.out.println("Result: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0] + "/" + arr[i][1] + "\t");
		}
	}

	public static void task155(int m, int n) {
		long sum = 0L;
		if (m % 2 != 0) {
			m++;
		}
		for (int i = m; i <= n; i = i + 2) {
			sum += factorial(i);
		}
		System.out.println("Result: " + sum);
	}

	public static void task156(int[] arr) {
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = -arr[i];
				count++;
			}
		}
		System.out.println("Result:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Count of replace: " + count);
	}

	public static void task157(int[] arr) {
		List<Integer> list = new ArrayList<>();
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		if (arr[1] > arr[0]) {
			list.add(arr[1]);
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] > arr[i]) {
				list.add(arr[i - 1]);
			}
			if (arr[i + 1] > arr[i]) {
				list.add(arr[i + 1]);
			}
		}
		if (arr[arr.length - 2] > arr[arr.length - 1]) {
			list.add(arr[arr.length - 2]);
		}
		int[] result = list.stream().mapToInt(i -> i).toArray();
		System.out.println("Result: ");
		System.out.println(Arrays.toString(result));
	}

	// begin 158
	public static void task158(int[] arr) {
		if (arr.length % 2 != 0) {
			System.out.println("Incorrect data!!!Size of array should be even number");
			return;
		}
		System.out.println("Your array:");
		System.out.println(Arrays.toString(arr));
		double[] result = new double[arr.length / 2];
		int indexResult = 0;
		for (int i = 0; i < arr.length; i = i + 2) {
			result[indexResult++] = averageOfArray(new double[] { arr[i], arr[i + 1] });
		}
		System.out.println("Result: ");
		System.out.println(Arrays.toString(result));
	}

	private static double averageOfArray(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	// end 158

	// begin 159
	public static void task159(int simpleNumber) {
		if (!isSimpleNumber(simpleNumber)) {
			System.out.println("Your number is not simple!!");
			return;
		}
		System.out.println("Result: " + nextSimpleNumber(simpleNumber));
	}

	public static boolean isSimpleNumber(int number) {
		boolean isSimple = true;
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if (number % j == 0) {
				isSimple = false;
				break;
			}
		}
		return isSimple;

	}

	private static int nextSimpleNumber(int simpleNumber) {
		while (true) {
			if (isSimpleNumber(++simpleNumber)) {
				return simpleNumber;
			}
		}
	}
	// end 159

	public static void task160(int number) {
		int simpleNumber = 1;
		while (true) {
			simpleNumber = nextSimpleNumber(simpleNumber);
			if (number % simpleNumber == 0) {
				System.out.println("Result: " + simpleNumber);
				break;
			}
		}
	}

	// begin 160

	public static void task161(int number) {
		if (number <= 0) {
			System.out.println("Incorrect data!!!Number is not natural!!!");
			return;
		}
		System.out.println("Result: ");
		System.out.println(Arrays.toString(getArrayDigitsOfNumber(number)));
	}

	private static int[] getArrayDigitsOfNumber(int number) {
		if (number < 0) {
			System.out.println("Incorrect data!!!Number is not natural!!!");
			return null;
		}
		int[] digits = new int[String.valueOf(number).length()];

		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}

	// end 160

	public static void task162(int numberA, int numberB) {
		if (numberA <= 0 || numberB <= 0) {
			return;
		}
		if (getArrayDigitsOfNumber(numberA).length > getArrayDigitsOfNumber(numberB).length) {
			System.out.println("First!!!");
		} else if (getArrayDigitsOfNumber(numberA).length < getArrayDigitsOfNumber(numberB).length) {
			System.out.println("Second!!!");
		} else {
			System.out.println("Equal!!");
		}
	}

	// begin 163
	public static void task163(int number) {
		if (number <= 0) {
			System.out.println("Incorrect data!!!Number is not natural!!!");
			return;
		}
		System.out.println("Result: " + getReverseNumber(number));
	}

	private static int getReverseNumber(int number) {
		int[] digits = getArrayDigitsOfNumber(number);
		StringBuilder sb = new StringBuilder();
		for (int i = digits.length - 1; i >= 0; i--) {
			sb.append(String.valueOf(digits[i]));
		}
		return Integer.parseInt(String.valueOf(sb));
	}
	// end 163

	// begin 164
	public static void task164(int k, int n) {
		if (k <= 0 || n <= 0) {
			System.out.println("Incorrect data!!!Number is not natural!!!");
			return;
		}
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (checkSumDigitsOfNumberEqualSomeNumber(i, k)) {
				numbers.add(i);
			}
		}
		int[] arr = numbers.stream().mapToInt(i -> i).toArray();
		System.out.println("Result: ");
		System.out.println(Arrays.toString(arr));
	}

	private static boolean checkSumDigitsOfNumberEqualSomeNumber(int checkNumber, int equalNumber) {
		int[] digits = getArrayDigitsOfNumber(checkNumber);
		int sum = 0;
		for (int j = 0; j < digits.length; j++) {
			sum += digits[j];
		}
		if (sum == equalNumber) {
			return true;
		} else {
			return false;
		}
	}
	// end 164

	// begin 166
	public static void task166(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (sumDivisorsOfNumber(i) == sumDivisorsOfNumber(j)) {
					System.out.println(i + "\t" + j);
				}
			}
		}
	}

	private static int sumDivisorsOfNumber(int number) {
		int originalNumber = number;
		int sum = 0;
		int simpleNumber = 1;
		while (simpleNumber < number) {
			if (originalNumber % simpleNumber == 0) {
				if (number != simpleNumber) {
					sum += simpleNumber;
					number /= simpleNumber;
					simpleNumber = 1;
				}
			}
			simpleNumber = nextSimpleNumber(simpleNumber);
		}
		return sum;
	}

	// end 166

	public static void task167(int n) {
		if (n < 2) {
			System.out.println("Incorrect data!!!n<2");
			return;
		}
		int simpleNumber = 1;
		int nextSimpleNumber;
		System.out.println(1 + "\t" + 3);
		while (true) {
			nextSimpleNumber = nextSimpleNumber(simpleNumber);
			if (nextSimpleNumber > 2 * n) {
				break;
			}
			if (nextSimpleNumber - 2 == simpleNumber) {
				System.out.println(simpleNumber + "\t" + nextSimpleNumber);
			}
			simpleNumber = nextSimpleNumber(simpleNumber);
		}
	}

	public static void task168(int n) {
		if (n < 1) {
			System.out.println("Incorrect data!!!n<1");
			return;
		}
		int[] sum = new int[] { 1, 1 };
		for (int i = 2; i <= n; i++) {
			int[] result = sum(sum[0], sum[1], (int) Math.pow(-1, i), i);
			sum[0] = result[0];
			sum[1] = result[1];
		}
		int gcd = gcd(sum[0], sum[1]);

		System.out.println("Result(n = " + n + ") = " + sum[0] / gcd + " / " + sum[1] / gcd);
	}

	public static void task169(int n) {
		if (n < 1) {
			System.out.println("Incorrect data!!!n<1");
			return;
		}
		int[] sum = new int[] { 1, 1 };
		for (int i = 2; i <= n; i++) {
			int[] result = sum(sum[0], sum[1], 1, i);
			sum[0] = result[0];
			sum[1] = result[1];
		}
		int gcd = gcd(sum[0], sum[1]);
		System.out.println("Result(n = " + n + ") = " + sum[0] / gcd + " / " + sum[1] / gcd);
	}
	
	public static void task170(int k) {
		if (k < 1) {
			System.out.println("Incorrect data!!!k<1");
			return;
		}
		double sum;
		System.out.println("Result: ");
		for (int i = 1; i <= k; i++) {
			int[] digits = getArrayDigitsOfNumber(i);
			sum = 0;
			for (int j = 0; j < digits.length; j++) {
				sum += Math.pow(digits[j], digits.length);
			}
			if (sum == i) {
				System.out.print(i + "\t");
			}
		}
	}

	// 171 begin

	public static void task171() {
		int firstNumber;
		int secondNumber;
		for (int i = 1000; i < 10000; i++) {
			int[] digits = getArrayDigitsOfNumber(i);
			if (areAllElementsDifferent(digits)) {
				firstNumber = i / 100;
				secondNumber = i % 100;
				if (firstNumber - secondNumber == sumElementsOfArray(digits)) {
					System.out.println(i);
				}
			}
		}
	}

	private static boolean areAllElementsDifferent(int arr[]) {
		boolean areDifferent = true;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					areDifferent = false;
					return areDifferent;
				}
			}
		}
		return areDifferent;
	}

	private static int sumElementsOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 171 end

	// 172 begin

	public static void task172(int n) {
		int simpleNumber = 1;
		do {
			if (elementsOfArrayAreEqualToElementsReverseArray(decimalToBinarySystem(simpleNumber))) {
				System.out.println(simpleNumber);
			}
			simpleNumber = nextSimpleNumber(simpleNumber);
		} while (simpleNumber <= n);
	}

	private static int[] decimalToBinarySystem(int number) {
		List<Integer> list = new ArrayList<>();
		while (true) {
			list.add(number % 2);
			number /= 2;
			if (number == 0) {
				return list.stream().mapToInt(i -> i).toArray();
			}
		}
	}

	private static boolean elementsOfArrayAreEqualToElementsReverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	// 172 end

	// 173 begin
	public static void task173(int n) {

		if (n > 9) {
			return;
		}
		int begin = 1;
		int end = 9;
		for (int i = 1; i < n; i++) {
			begin = Integer.valueOf(begin + "0");
			end = Integer.valueOf(end + "9");
		}
		for (int i = begin; i <= end; i++) {
			if (isAscendingSequence(getArrayDigitsOfNumber(i))) {
				System.out.println(i);
			}
		}
	}

	private static boolean isAscendingSequence(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	// 173 end

	// 174 begin
	public static void task174(int n) {
		System.out.println("Result: ");
		boolean isOk = true;
		for (int i = 1; i <= n; i++) {
			int[] digits = IntStream.of(getArrayDigitsOfNumber(i)).distinct().toArray();
			if (arrayHasZero(digits)) {
				continue;
			}
			for (int j = 0; j < digits.length; j++) {
				if (isOk) {

				}
				if (i % digits[j] != 0) {
					isOk = false;
					break;
				}
			}
			if (!isOk) {
				isOk = true;
				continue;
			}
			System.out.println(i);
		}
	}

	private static boolean arrayHasZero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return true;
			}
		}
		return false;
	}
	// 174 end

	// 175 begin

	public static void task175(int m, int n) {
		if (m > n) {
			System.out.println("Incorrect interval!!!");
			return;
		}
		List<Integer> list = new ArrayList<>();
		int maxCount = 0;
		int countDivider;
		for (int i = m; i <= n; i++) {
			countDivider = countDividerOfNumber(i);
			if (countDivider > maxCount) {
				maxCount = countDivider;
				list.clear();
			}
			if (countDivider == maxCount) {
				list.add(i);
			}
		}
		list.forEach(System.out::println);
	}

	private static int countDividerOfNumber(int number) {
		int count = 0;
		for (int i = 1; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}

	// 175 end

	public static void task176(int k) {
		int[] sum = new int[] { 1, 1 };
		for (int i = 2; i <= k; i++) {
			int[] denominator = sum(1, 1, sum[0], sum[1]);
			int[] secondOperand = division(1, 1, denominator[0], denominator[1]);
			sum = sum(sum[0], sum[1], secondOperand[0], secondOperand[1]);
		}
		System.out.println("Result: " + sum[0] + " / " + sum[1]);
	}

	public static void task177(int n) {
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i * (i + 1) * (i + 2) == n) {
					System.out.println("True!!!");
					System.out.println(i + "*" + (i + 1) + "*" + (i + 2) + "=" + n);
					return;
				}
			}
		}
		System.out.println("False!!!");
	}

	public static void task178(String n, String m) {
		if (n.length() != 6 || n.length() != 6) {
			System.out.println("Incorrect data!!!The number of ticket should consist with 6 digits");
			return;
		}
		int begin = Integer.parseInt(n);
		int end = Integer.parseInt(m);
		int count = 0;
		if (begin == 0) {
			count++;
			begin++;
		}
		for (int i = begin; i <= end; i++) {
			System.err.println(i);
			if (sumElementsOfArray(getArrayDigitsOfNumber(i / 1000)) == sumElementsOfArray(
					getArrayDigitsOfNumber(i % 1000))) {
				count++;
			}
		}
		System.out.println("Result: " + count);
	}

	// begin 179
	public static void task179(int n) {
		int begin = 1;
		int end = 9;
		for (int i = 1; i < n; i++) {
			begin = Integer.valueOf(begin + "0");
			end = Integer.valueOf(end + "9");
		}
		long sum = 0L;
		for (int i = begin; i <= end; i++) {
			if (!checkArrayHasEvenNumber(getArrayDigitsOfNumber(i))) {
				sum += i;
			}
		}
		System.out.println("Result: " + sum);

	}

	private static boolean checkArrayHasEvenNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}
	// end 179

	public static void task180(int n) {
		int count = 0;
		while (n > 0) {
			n -= sumElementsOfArray(getArrayDigitsOfNumber(n));
			count++;
		}
		System.out.println("Result: " + count);
	}
	
	 
	


	
}
