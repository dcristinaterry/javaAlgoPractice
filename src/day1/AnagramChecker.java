package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramChecker {

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> myList = new ArrayList<Integer>();

		if (s == null || s.length() == 0 || p == null || p.length() == 0) {
			return myList;
		}
		
		char[] orderPArray = p.toCharArray();
		Arrays.sort(orderPArray);

		System.out.println(new String(orderPArray));

		String sortedP = new String(orderPArray);

		String[] tempS = s.split("");

		for (int i = 0; i <= (s.length() - p.length()); i++) {

			String tmpCheckArr = s.substring(i, i + p.length());
			char[] tempArrSub = tmpCheckArr.toCharArray();
			Arrays.sort(tempArrSub);

			System.out.println(tempArrSub);
			if (Arrays.equals(orderPArray, tempArrSub)) {
				myList.add(i);
			}

		}

		return myList;
	}

	public static List<Integer> findAnagramsAnswer(String s, String p) {
		List<Integer> list = new ArrayList<>();

		if (s == null || s.length() == 0 || p == null || p.length() == 0) {
			return list;
		}

		// Character hash.
		int[] hash = new int[256];

		// Record each character in "p" to a hash.
		for (char c : p.toCharArray()) {
			hash[c]++;
		}

		// Initialize count to "p"'s length.
		int left = 0, right = 0, count = p.length();
		while (right < s.length()) {
			// Move right each time if the character exists in p's hash
			// Decrease the count current hash value greater than 1
			// means the character exists in p.
			if (hash[s.charAt(right++)]-- >= 1) {
				count--;
			}

			// When the count is zero, this means we found the
			// right anagram. Add window's left to result list.
			if (count == 0) {
				list.add(left);
			}

			if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
				count++;
			}
		}
		return list;
	}

	public static void main(String[] args) {

		findAnagrams("cabab", "ab");
//		findAnagrams("cbaebabacd", "abc");
	}
}
