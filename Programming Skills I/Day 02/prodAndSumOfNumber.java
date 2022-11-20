class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        while(n>0)
        {
            int digit = n%10;
            n/=10;
            prod*=digit;
            sum+=digit;
        }
        return (prod-sum);
    }
}
