package com.vineela.test;

public class ArrayTest {

	public static void main(String[] arg) {
		int num[][] = new int[3][4];

		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[1];
		for (int n[] : num) {
			System.out.println();
			for (int m : n)

			{
				System.out.print(m + " ");
			}
		}

		int array[] = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		for (int value : array) {
			System.out.println(value);
		}

		int nums[][] = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = (int) (Math.random() * 100);

			}
		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++)

			{

				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();

		}

		int mularray[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 } };
		for (int[] row : mularray) {
			for (int temp : row) {
				System.out.print(temp + " ");
			}
			System.out.println();

			for (int n[] : nums) {
				System.out.println();
				for (int m : n)

				{
					System.out.print(m + " ");
				}

			}

		}
	}
}
