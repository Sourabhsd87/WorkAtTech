class Solution {
	int getInversionCount(int[] array) {
		// Add your logic here
		int count=0;
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
			if(array[i]>array[j]){
				count++;
			}
			}
		}
		return count;
	}
	
}
