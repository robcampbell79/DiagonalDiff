package rob.diagdiff;

import java.util.*;

public class DiagonalDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row num and column num: ");
		
		int nums = sc.nextInt();
		int height = nums;
		int width = height;
		
		int array[][] = new int[height][width];
		
		System.out.println("Enter nums for arrays");
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("Enter array spot " + i + " " + j + ": ");
				int spot = sc.nextInt();
				array[i][j] = spot;
			}
		}
		
		result(array);
		System.out.println(findDiff(array));
	}
	
	public static void result(int array[][]) {
		System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		
	}
	
	public static int findDiff(int array[][]) {
		int sum = 0;
		int mirrSum = 0;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i][i];
		}
		
		for(int i = array.length - 1; i >= 0; i--) {
			mirrSum += array[i][count];
			count++;
		}
		
		return Math.abs(sum - mirrSum);
	}
}
