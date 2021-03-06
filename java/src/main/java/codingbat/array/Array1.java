package codingbat.array;

public class Array1 {

	public static Boolean firstLast6(int[] is) {
		return is[0] == 6 || is[is.length - 1] == 6;
	}

	public static Boolean sameFirstLast(int[] is) {
		return is[0] == is[is.length - 1];
	}

	public static int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public static Boolean commonEnd(int[] is, int[] is2) {
		return is[0] == is2[0] || is[is.length - 1] == is2[is2.length - 1];
	}

	public static Integer sum3(int[] is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++)
			sum += is[i];
		return sum;
	}

	public static int[] rotateLeft3(int[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			if (i == 0) {
				result[is.length - 1] = is[i];
			} else {
				result[i - 1] = is[i];
			}
		}
		return result;
	}

	public static int[] reverse3(int[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			result[i] = is[is.length - i - 1];
		}
		return result;
	}

	public static int[] maxEnd3(int[] is) {
		int max = Math.max(is[0], is[2]);
		return new int[] { max, max, max };
	}

	public static Integer sum2(int[] is) {
		int sum = 0;
		for (int i = 0; i < is.length && i < 2; i++) {
			sum += is[i];

		}
		return sum;
	}

	public static int[] middleWay(int[] is, int[] is2) {
		return new int[] { is[is.length / 2], is2[is2.length / 2] };
	}

	public static int[] makeEnds(int[] is) {
		return new int[] { is[0], is[is.length - 1] };
	}

	public static Boolean has23(int[] is) {
		for (int i : is)
			if (i == 3 || i == 2)
				return true;
		return false;
	}

	public static Boolean no23(int[] is) {
		for (int i : is)
			if (i == 3 || i == 2)
				return false;
		return true;
	}

	public static int[] makeLast(int[] is) {
		int[] result = new int[is.length * 2];
		result[result.length - 1] = is[is.length - 1];
		return result;
	}

	public static Boolean double23(int[] is) {
		int twoCount = 0;
		int threeCount = 0;
		for (int i : is) {
			if (i == 2)
				twoCount++;
			else if (i == 3)
				threeCount++;
		}

		return twoCount > 1 || threeCount > 1;
	}

	public static int[] fix23(int[] is) {
		for (int i = 0; i < is.length - 1; i++) {
			if (is[i] == 2 && is[i + 1] == 3) {
				is[i + 1] = 0;
			}

		}
		return is;
	}

	public static Integer start1(int[] is, int[] is2) {
		int count = 0;
		if (is.length > 0 && is[0] == 1)
			count++;
		if (is2.length > 0 && is2[0] == 1)
			count++;
		return count;
	}

	public static int[] biggerTwo(int[] is, int[] is2) {
		int a = is[0] + is[1];
		int b = is2[0] + is2[1];

		return a >= b ? is : is2;
	}

	public static int[] makeMiddle(int[] is) {
		int mid = is.length / 2 - 1;
		return new int[] { is[mid], is[mid + 1] };
	}

	public static int[] plusTwo(int[] is, int[] is2) {
		final int len1 = is.length;
		final int len2 = is2.length;
		int[] result = new int[len1 + len2];

		System.arraycopy(is, 0, result, 0, len1);
		System.arraycopy(is2, 0, result, len1, len2);

		return result;
	}

	public static int[] swapEnds(int[] is) {
		int[] result = new int[is.length];
		result[0] = is[is.length - 1];
		result[result.length - 1] = is[0];
		System.arraycopy(is, 1, result, 1, is.length - 2);
		return result;
	}

	public static int[] midThree(int[] is) {
		int mid = is.length / 2;
		return new int[] { is[mid - 1], is[mid], is[mid + 1] };
	}

	public static Integer maxTriple(int[] is) {
		return Math.max(is[is.length / 2], Math.max(is[0], is[is.length - 1]));
	}

	public static int[] frontPiece(int[] is) {
		int len = is.length > 1 ? 2 : is.length;
		int[] result = new int[len];
		System.arraycopy(is, 0, result, 0, len);
		return result;
	}

	public static Boolean unlucky1(int[] is) {
		for (int i = 0; i < is.length - 1; i++) {
			if (i > 1 && i < is.length - 2) {
				continue;
			}
			if (is[i] == 1 && is[i + 1] == 3)
				return true;
		}
		return false;
	}

	public static int[] make2(int[] is, int[] is2) {
		int[] result = new int[2];
		final int len = is.length > 2 ? 2 : is.length;

		System.arraycopy(is, 0, result, 0, len);
		if (len < 2)
			System.arraycopy(is2, 0, result, len, 2 - len);

		return result;
	}

	public static int[] front11(int[] is, int[] is2) {
		int[] result;
		if (is.length == 0) {
			result = new int[] { is2[0] };
		} else if (is2.length == 0) {
			result = new int[] { is[0] };
		} else {
			result = new int[] { is[0], is2[0] };

		}
		return result;
	}

}
