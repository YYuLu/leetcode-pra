/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    public int searchInsertPosition(int [] nums, int target){
        int n = nums.length;
        int left = 0, right = n - 1, mid = 0;
        while (left <= right) {
            mid = (right - left) >> 1 + left;
            if (target <= nums[mid]) {
                right = mid
            }
        }
    }
}