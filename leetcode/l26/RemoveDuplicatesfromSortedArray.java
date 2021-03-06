package leetcode.l26;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
    System.out.println("输入数组为：" + Arrays.toString(nums));
    removeDuplicates(nums);
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    //双指针i，j
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i += 1;
        nums[i] = nums[j];
      }
    }

    System.out.println("处理后的数组为：" + Arrays.toString(Arrays.copyOfRange(nums, 0, i + 1)) + "，长度为：" + (i + 1)); //copyOfRange方法返回的下标不包含参数中的“to”代表的下标
    return i + 1;
  }
}
