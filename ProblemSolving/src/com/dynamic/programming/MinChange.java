package com.dynamic.programming;

import java.util.Arrays;
import java.util.List;

public class MinChange {
	public static void main(String[] args) {
		int amount = 4;
		List<Integer> coins = Arrays.asList(1, 2);

		System.out.println(minChange(amount, coins));
	}

	private static int minChange(int amount, List<Integer> coins) {
		if (amount == 0) {
			return 0;
		}

		if (amount < 0) {
			return -1;
		}
		int totalSteps = -1;
		for (int coin : coins) {
			int subAmount = amount - coin;
			int subCoins = minChange(subAmount, coins);
			if(subCoins >= 0) {
				totalSteps += 1;
			}

		}

		return totalSteps;
	}
}
