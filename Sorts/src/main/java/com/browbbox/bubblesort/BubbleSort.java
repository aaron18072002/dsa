package com.browbbox.bubblesort;

public class BubbleSort {

  public static void main(String[] args) {
    int[] nums = new int[]{5, 3, 2, 7, 8, 1, 2};

    bubbleSort(nums);
  }

  private static void printf(int no, int[] nums) {
    System.out.print(no + ": ");
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  private static void bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
      printf(i, nums);
    }
  }

  private static void interchangeSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
      printf(i, nums);
    }
  }
}
