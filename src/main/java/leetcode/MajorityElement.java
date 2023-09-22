package leetcode;

public class MajorityElement {
    public int findMajorityElement(int[] nums){
        int top = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0) {
                top = nums[i];
                count++;
            }
            else {
                if (top != nums[i]){
                    count--;
                } else {
                    count++;
                }
            }
        }
        return top;
    }
}
