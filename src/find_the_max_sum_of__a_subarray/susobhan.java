package find_the_max_sum_of__a_subarray;


public class susobhan {
	public static void main(String args[]) {
		int arr[] = {-5,4,6,-3,4,-1};
		int n = arr.length;
		
		int maxsum=0;
		for(int i =0;i<n-1;i++) {
			int sum =0;
			    sum=arr[i]+arr[i+1];
			for(int j=i+2;j<n;j++) {
				sum=sum+arr[j];//
				
				if(sum>maxsum) {
					maxsum = sum;
				}
			}
			
			
		
			
		}
		System.out.print(maxsum+" ");
		
	}

}
