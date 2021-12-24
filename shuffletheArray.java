class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length/2;i++)
        {
                output[2*i]=nums[i];
                output[2*i+1]=nums[nums.length/2+count];
                count++;
        }
        return output;
    }
}
