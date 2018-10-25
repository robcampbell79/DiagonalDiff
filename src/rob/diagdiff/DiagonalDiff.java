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
				array[i][j] = i + j + (spot * i);
			}
		}
		
		result(array);
	}
	
	public static void result(int array[][]) {
		System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		
	}
}
