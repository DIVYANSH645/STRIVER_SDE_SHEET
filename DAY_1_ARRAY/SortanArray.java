<<<<<<< HEAD
package DAY_1_ARRAY;

=======
>>>>>>> 33b33c8389a9910846ce66a2f9b7d2b79fb8ea83
class SortColors{
//     Complexity
// Time complexity: O(n)
// Space complexity: O(1)
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        // Example usage
        SortColors s= new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        s.sortColors(nums);
        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

