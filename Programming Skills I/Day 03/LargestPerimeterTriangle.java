class Solution {
    public int largestPerimeter(int[] nums) {
        int a, b, c, sum = 0;
        Arrays.sort(nums);
        a=0;
        b=1;
        c=2;
        while(c<nums.length)
        {
            if((nums[a]+nums[b])>nums[c])
            {
                sum = nums[a]+nums[b]+nums[c];
            }
            a+=1;
            b+=1;
            c+=1;
        }
        return sum;
    }
}
