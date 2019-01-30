package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WorkWithString {

	public static void task198(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (str.charAt(i + 1) != ' ') {
					count++;
				}
			}
			if (str.charAt(i) == '.') {
				if (str.charAt(i - 1) != ' ') {
					count++;
				}
				break;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count of words: " + count);
	}

	public static void task199(String str) {
		int count = 0;
		if (str.charAt(0) == 'b') {
			count++;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
				if (str.charAt(i + 1) == 'b') {
					count++;
				}
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + count);
	}

	public static void task200(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'r' || str.charAt(i) == 'k' || str.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + count);
	}

	public static void task201(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == ':' || str.charAt(i) == ';'
					|| str.charAt(i) == '*') {
				count++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + count);
	}

	public static void task202(String str) {
		int minLength = Integer.MAX_VALUE;
		int maxLength = 0;
		char[] endsOfWord = new char[] { ' ', '.', ',', '!', '?', ':', ';', ')' };
		Arrays.sort(endsOfWord);
		int begin = 0;
		int end = 0;
		int length;
		do {
			int indexOfEndOfWord = Arrays.binarySearch(endsOfWord, str.charAt(end));
			if (indexOfEndOfWord < 0 && end != str.length() - 1) {
				end++;
				continue;
			} else {
				length = end - begin;
				if (length > maxLength) {
					maxLength = length;
				}
				if (length < minLength) {
					minLength = length;
				}
				begin = end + 1;
				end = begin + 1;
			}
		} while (end < str.length());
		System.out.println("Your string: " + str);
		System.out.println("Min: " + minLength);
		System.out.println("Max: " + maxLength);
	}

	public static void task203(String str) {
		System.out.println("Your string: " + str);
		System.out.println(str.indexOf(":"));
	}

	public static void task204(String str) {
		char[] endsOfWord = new char[] { ' ', '.', ',', '!', '?', ':', ';', ')' };
		Arrays.sort(endsOfWord);
		int begin = 0;
		int end = 0;
		int length;
		System.out.println("Your string: " + str);
		do {
			int indexOfEndOfWord = Arrays.binarySearch(endsOfWord, str.charAt(end));
			if (indexOfEndOfWord < 0 && end != str.length() - 1) {
				end++;
				continue;
			} else {
				length = end - begin;
				if (length == 3) {
					System.out.println(str.substring(begin, end));
				}
				begin = end + 1;
				end = begin + 1;
			}
		} while (end < str.length());
	}

	public static void task205(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '*') {
				sb.deleteCharAt(i);
				i--;
			} else {
				sb.insert(i, sb.charAt(i));
				i++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println(new String(sb));
	}

	public static void task206(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				if (str.charAt(i + 1) == 'b' && str.charAt(i + 2) == 'c') {
					count++;
					i = i + 2;
				}
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + count);
	}
	
	public static void task207(String str) {
		char[] endsOfWord = new char[] { ' ', '.', ',', '!', '?', ':', ';', ')' };
		Arrays.sort(endsOfWord);
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Arrays.binarySearch(endsOfWord, str.charAt(i)) < 0) {
				for (int j = i; j >= 0; j--) {
					if (Arrays.binarySearch(endsOfWord, str.charAt(j)) > 0) {
						String temp = str.substring(j, i);
						for (int k = 0; k < temp.length(); k++) {
							if (temp.charAt(k) == 'k') {
								count++;
							}
						}
						System.out.println("Your string: " + str);
						System.out.println("Count: " + count);
						return;
					}
				}
			}
		}
	}
	
	public static void task208(String str) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (!list.contains(String.valueOf(str.charAt(i)))) {
				list.add(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + list.size());
		list.forEach(System.out::print);
	}
	
	public static void task209(String str) {
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			} else {
				if (maxCount < count) {
					maxCount = count;
				}
				count = 0;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + maxCount);
	}
	
	public static void task210(String str) {
		int begin = str.indexOf("(");
		int end = str.indexOf(")");
		if (begin < 0 || end < 0) {
			System.out.println("Incorrect data!!!Your string does not have '(' or ')'");
			return;
		}
		if (begin > end) {
			System.out.println("Incorrect data!!!The first symbol should be '(' not ')");
			return;
		}
		System.out.println("Your string: " + str);
		System.out.println(str.substring(begin + 1, end));
	}
	
	public static void task211(String str) {
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + maxCount);
	}
	
	public static void task212(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ':') {
				if (str.charAt(i - 1) == 'a') {
					count++;
				}
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + count);
	}

	public static void task213(String str) {
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' | i == str.length() - 1) {
				if (str.substring(begin, i).contains("k")) {
					System.out.println(str.substring(begin, i));
				}
				begin = i;
			}
		}

	}

	public static void task214(String str) {
		char[] symbols = new char[] { ' ', '.', ',', '!', '?', ':', ';', ')', '(', '>', '<' };
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' | i == str.length() - 1) {
				String word = deleteSymbolsFromWord(str.substring(begin, i), symbols);
				if (word.length() != 0 && word.charAt(0) == word.charAt(word.length() - 1)) {
					System.out.println(word);
				}
				begin = i;
			}
		}
	}

	private static String deleteSymbolsFromWord(String str, char[] arr) {
		StringBuilder sb = new StringBuilder(str);
		Arrays.sort(arr);
		for (int i = 0; i < sb.length(); i++) {
			if (Arrays.binarySearch(arr, sb.charAt(i)) >= 0) {
				sb.deleteCharAt(i);
				i--;
			}

		}
		return sb.toString();
	}

	public static void task215(String str) {
		StringBuilder sb = new StringBuilder(str);
		int count = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ':') {
				sb.deleteCharAt(i);
				sb.insert(i, ';');
				count++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.toString());
		System.out.println("Count: " + count);
	}

	public static void task216(String str) {
		StringBuilder sb = new StringBuilder(str);
		int count = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ':') {
				sb.deleteCharAt(i);
				count++;
				i--;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.toString());
		System.out.println("Count: " + count);
	}
	
	public static void task217(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				do {
					sb.deleteCharAt(i);
				} while (sb.charAt(i) == ' ');
				sb.insert(i, ", ");
				i++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.toString());
	}
	
	public static void task218(String str) {
		StringBuilder sb = new StringBuilder(str);
		int begin = sb.indexOf("(");
		int end = sb.indexOf(")");
		if (begin < 0 || end < 0) {
			System.out.println("Incorrect data!!!Your string does not have '(' or ')'");
			return;
		}
		if (begin > end) {
			System.out.println("Incorrect data!!!The first symbol should be '(' not ')");
			return;
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.delete(begin, end + 1));
	}
	
	public static void task219(String str, String word) {
		int count = 0;
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' | i == str.length() - 1) {
				if (str.substring(begin, i).trim().equals(word.trim())) {
					count++;
				}
				begin = i;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Word: " + word);
		System.out.println("Result: " + count);
	}
	
	public static void task220(String str) {
		int index = str.indexOf(';');
		if (str.substring(index + 1).contains(";")) {
			System.out.println("Incorrect data!!!The string has more than 1 symbol ';'");
			return;
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + str.substring(0, index).length() + ";" + str.substring(index + 1).length());
	}
	
	public static void task221(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length() / 2; i++) {
			if (sb.charAt(i) == ':') {
				sb.deleteCharAt(i);
				sb.insert(i, '.');
			}
		}
		for (int i = sb.length() / 2; i < sb.length(); i++) {
			if (sb.charAt(i) == '?') {
				sb.deleteCharAt(i);
				sb.insert(i, '.');
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.toString());
	}

	public static void task222(String str) {
		/*
		 * StringBuilder sb = new StringBuilder(str); if
		 * (sb.reverse().toString().equals(str)) { System.out.println("True"); }else {
		 * System.out.println("False"); }
		 */

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}

	public static void task223(String str) {
		StringBuilder result = new StringBuilder();
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' | i == str.length() - 1) {
				for (int j = i; j >= begin; j--) {
					result.append(str.charAt(j));
				}
				begin = i;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + result.toString());
	}

	public static void task224(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			if (Integer.valueOf(sb.charAt(i)) >= Integer.valueOf('a')
					&& Integer.valueOf(sb.charAt(i)) <= Integer.valueOf('z')) {
				continue;
			} else if (Integer.valueOf(sb.charAt(i)) >= Integer.valueOf('A')
					&& Integer.valueOf(sb.charAt(i)) <= Integer.valueOf('Z')) {
				continue;
			} else if (sb.charAt(i) == ' ') {
				continue;
			} else {
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Result: " + sb.toString());
	}

	public static void task225(String str) {
		int begin = Integer.valueOf('a');
		int end = Integer.valueOf('z');
		int count = 0;
		System.out.println("Your string: " + str);
		for (int i = begin; i <= end; i++) {
			for (int j = 0; j < str.length(); j++) {
				if ((char) i == str.charAt(j)) {
					count++;
				}
			}
			System.out.println((char) i + " : " + count);
			count = 0;
		}
	}

	public static void task226(String[] arrStr) {
		System.out.println("Your array: " + Arrays.toString(arrStr));
		Arrays.sort(arrStr);
		System.out.println("Result: " + Arrays.toString(arrStr));
	}
	
	public static void task227(String strA, String strB) {
		String str = strB.toLowerCase();
		List<Character> list = strA.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				list.remove(list.indexOf(str.charAt(i)));
			}else {
				System.out.println("False!!!");
				return;
			}
		}
		System.out.println("True!!!");
	}
	
	public static void task228(String str) {
		int countVowels = 0;
		int countConsonants = 0;
		String strLC = str.toLowerCase();
		char[] vowelsLetter = new char[] {'a','e','i','o','u','y'};
		for (int i = 0; i < strLC.length(); i++) {
			if (Integer.valueOf(strLC.charAt(i)) >= Integer.valueOf('a')
					&& Integer.valueOf(strLC.charAt(i)) <= Integer.valueOf('z')) {
				if (Arrays.binarySearch(vowelsLetter, strLC.charAt(i))>=0) {
					countVowels++;
				}else {
					countConsonants++;
				}
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Vowels: " + countVowels);
		System.out.println("Consonants: " + countConsonants);
	}
	
	public static void task229(char[][] arr, String str) {
		List<Character> list = new ArrayList<>();
		String strLC =str.toLowerCase(); 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				list.add(Character.toLowerCase(arr[i][j]));
			}
		}
		for (int i = 0; i < strLC.length(); i++) {
			if (list.contains(strLC.charAt(i))) {
				list.remove(list.indexOf(strLC.charAt(i)));
			} else {
				System.out.println("False!!!");
				return;
			}
		}
		System.out.println("True!!!");
	}
	
	public static void task230(String str, int length) {
		List<String> list = new ArrayList<>();
		char[] symbols = new char[] { ' ', '.', ',', '!', '?', ':', ';', ')', '(', '>', '<' };
		Arrays.sort(symbols);
		int begin = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' '|i == str.length()-1) {
				String word = deleteSymbolsFromWord(str.substring(begin, i), symbols);
				if (word.length()==length) {
					list.add(word);
				}
				begin = i;
			}
		}
		Collections.sort(list);
		for (String word : list) {
			System.out.println(word);
		}
	}
	
	
	
	
	
	

	
	
	
	
	
}
	
	
	
	
	
	


