package com.dsa.array;

public class _88_Merge_Sorted_Array {

  private static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int ai : nums2) {
      insert(ai, nums1, m);
      m++;
    }
  }

  private static void insert(int num, int[] nums1, int m) {
    boolean isBigger = false;
    for (int k = 0; k < m; k++) {
      if (nums1[k] > num) {
        isBigger = true;
        for (int i = m - 1; i >= k; i--) {
          nums1[i + 1] = nums1[i];
        }
        nums1[k] = num;
        break;
      }
    }
    if (isBigger == false) {
      nums1[m - 1] = num;
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {2, 3, 4, 5, 0, 0, 0};
    int[] nums2 = {3, 0, 6};
    merge(nums1, 4, nums2, 3);
    System.out.println("DONE");
  }

}
