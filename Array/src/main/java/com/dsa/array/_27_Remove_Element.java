package com.dsa.array;

public class _27_Remove_Element {

  private static int removeElement(int[] nums, int num) {
    int length = nums.length;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == num) {
        for (int j = i; j < nums.length - 1; j++) {
          nums[j] = nums[j + 1];
        }
        length--;
      }
    }
    return length;
  }

  private static int removeWithCursor(int[] nums, int num) {
    int length = nums.length;
    int k = 0; //cursor
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != num) {
        nums[k] = nums[i];
        k++;
      } else {
        length--;
      }
    }
    return length;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{0, 1, 2, 2, 3, 4, 0, 2};
    int result = removeWithCursor(nums, 2);
    int[] num2 = nums;
    System.out.println(result);
  }

}
