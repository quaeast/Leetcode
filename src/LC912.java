class Solution912 {
    //pivotal = 0
    //begin, end []
    public static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivotal = array[begin];
        int left = begin + 1;
        int right = end;
        while (left-1 < right) {
            if (array[left] > pivotal) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                right--;
            } else {
                left++;
            }
        }
        left--;
        array[begin] = array[left];
        array[left] = pivotal;
        quickSort(array, begin, left - 1);
        quickSort(array, left + 1, end);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}

public class LC912 {
}
