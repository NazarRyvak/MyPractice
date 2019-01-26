package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
			if (str.charAt(i) == ' ' | str.charAt(i) == ',' | str.charAt(i) == '.') {
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
			if (str.charAt(i) == 'r' | str.charAt(i) == 'k' | str.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Your string: " + str);
		System.out.println("Count: " + count);
	}

	public static void task201(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',' | str.charAt(i) == '.' | str.charAt(i) == ':' | str.charAt(i) == ';'
					| str.charAt(i) == '*') {
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
	
	
	
}
	
	
	
	
	
	


