class Solution {
	int largestContiguousSum(int[] arr){
		int maxsum=Integer.MIN_VALUE;
		int sum=0;
		for(int num:arr){
			sum=Math.max(num,num+sum);
			maxsum=Math.max(sum,maxsum);
		}
		return maxsum;
	}
}
