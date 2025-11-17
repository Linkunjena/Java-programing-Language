class Solution
 {
    public int halveArray(int[] nums) 
    {
        PriorityQueue<Double>pq= new PriorityQueue<>((a,b)->Double.compare(b,a));
        double sum=0;

        for( int i=0;i< nums.length;i++)
        {
             sum+=nums[i];
             pq.add( (double)nums[i] );
        }
        double half= sum/2;

        double removed=0;
        int steps=0;
        
        // we need to keep on removing till the removed sum is less than half
        while( removed < half)
        {
            double element= pq.poll();
            element= element/2;

            removed+=element;
            pq.add( element);
            steps++;
        }

        return steps;
    }
}