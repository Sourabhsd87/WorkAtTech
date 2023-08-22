class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
	
		int [] cum = new int [arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			cum[i]=sum;
		}
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<cum.length;i++){
			if(cum[i]>0){
			list.add(cum[i]);
			}
		}
		return list;
	}
}
