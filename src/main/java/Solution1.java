class Solution1 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 注意
        while(left <= right) { // 注意
            int mid = (left + right) / 2; // 注意
            if(nums[mid] == target) { // 注意
                // 相关逻辑
            } else if(nums[mid] < target) {
                left = mid + 1; // 注意
            } else {
                right = mid - 1; // 注意
            }
        }
        // 相关返回值
        return 0;
    }

    public static void main(String[] args) {
//        [1,3,5,6]
//        2
        int[] arr = new int[]{1,3,5,6};

        int i = searchInsert(arr, 2);
        System.out.println(i);

    }
}