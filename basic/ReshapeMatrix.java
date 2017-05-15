package basic;

public class ReshapeMatrix {

	public static void main(String[] args) {
		int[][] input = new int[4][1];
		input[0][0] = 1;
		input[1][0] = 2;
		input[2][0] = 3;
		input[3][0] = 4;

		matrixReshape(input, 2, 2);

	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] resMatrix = new int[r][c];
		int rowCount = 0;
		int colCount = 0;
		
		 if (nums.length == 0 || r * c != nums.length * nums[0].length)
	            return nums;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				resMatrix[rowCount][colCount] = nums[i][j];
				if (colCount == c) {
					rowCount++;
					colCount = 0;
				}
				colCount++;
			}
		}

		return resMatrix;
	}

}
