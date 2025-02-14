// https://leetcode.com/problems/missing-number/description/
// missing Numbers - 268

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 3 };
        missingNumber(arr);

    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        // Cyclic sort element
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) { // ignore number at last element
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Searching of element that is missing in array

        // 1)Case 1 - If element is missing
        for (int m = 0; m < nums.length; m++) {
            if (nums[m] != m) {
                return m;
            }
        }
        // 2)Element is already at end
        return nums.length;

    }

    // Swap method
    static void swap(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}