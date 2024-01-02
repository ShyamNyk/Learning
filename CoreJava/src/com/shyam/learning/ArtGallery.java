package com.shyam.learning;

import java.util.Arrays;
import java.util.Scanner;

public class ArtGallery {

	public static void main(String[] args) {   

		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int numBlock = stdin.nextInt();

		while (n != 0) {

			int[][] rooms = new int[n][2];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < 2; j++)
					rooms[i][j] = stdin.nextInt();

			int[][][] dp = new int[n][numBlock + 1][3];
			for (int i = 0; i < n; i++)
				for (int j = 0; j <= numBlock; j++)
					Arrays.fill(dp[i][j], -1);

			dp[0][0][0] = rooms[0][0] + rooms[0][1];
			if (numBlock > 0)
				dp[0][1][1] = rooms[0][1];
			if (numBlock > 0)
				dp[0][1][2] = rooms[0][0];

			for (int i = 1; i < n; i++) {

				for (int j = 0; j <= i + 1 && j <= numBlock; j++) {

					if (maxArr(dp[i - 1][j]) >= 0)
						dp[i][j][0] = rooms[i][0] + rooms[i][1] + maxArr(dp[i - 1][j]);

					if (j > 0 && Math.max(dp[i - 1][j - 1][1], dp[i - 1][j - 1][0]) >= 0)
						dp[i][j][1] = rooms[i][1] + Math.max(dp[i - 1][j - 1][1], dp[i - 1][j - 1][0]);
					if (j > 0 && Math.max(dp[i - 1][j - 1][2], dp[i - 1][j - 1][0]) >= 0)
						dp[i][j][2] = rooms[i][0] + Math.max(dp[i - 1][j - 1][2], dp[i - 1][j - 1][0]);
				}
			}

			System.out.println(maxArr(dp[n - 1][numBlock]));

			n = stdin.nextInt();
			numBlock = stdin.nextInt();
		}
	}

	public static int maxArr(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++)
			res = Math.max(res, arr[i]);
		return res;
	}
}