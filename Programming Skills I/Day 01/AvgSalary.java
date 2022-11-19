class Solution {
    public double average(int[] salary) {
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        double total = 0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>high)
                high=salary[i];
            if(salary[i]<low)
                low=salary[i];
            total+=salary[i];
        }
        double avg= (total-(high+low))/(salary.length-2);
        return avg;
    }
}
