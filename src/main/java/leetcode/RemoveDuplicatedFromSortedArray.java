package leetcode;

public class RemoveDuplicatedFromSortedArray {
    public int removeDuplicated(int[] nums){
        int sortedLastIdx = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[sortedLastIdx] != nums[j]){
                nums[sortedLastIdx + 1] = nums[j];
                sortedLastIdx++;
            }
        }
        return sortedLastIdx + 1;
    }
}
