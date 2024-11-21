package com.dsa.array;

public class _1295_Find_Numbers {

  private static int findNumber(int[] nums) {
    int count = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      int countOfNumbers = getCountOfNumbers(nums[i]);
      if (countOfNumbers % 2 == 0) {
        count++;
      }
    }

    return count;
  }

  private static int getCountOfNumbers(int number) {
    if (number == 0) {
      return 1;
    }

    int count = 0;
    while (number != 0) {
      count++;
      number = number / 10;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{12, 345, 2, 6, 7896};
    System.out.println(findNumber(nums));
  }

}
