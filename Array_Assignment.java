import java.util.Arrays;

public class Array_Assignment {
	
	public static void res(int arr[]) {
		int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum + arr[i];
        }
        System.out.println("Sum of Array: "+sum);
	}
	
	public static int getAverage(int[] marks){
	    int total = 0;
	    for (int i=0; i<marks.length; i++) {
	      total = total + marks[i];
	    }
	    return total/marks.length;
	  }
	
	public static int getMod(int arr[]) {
		int max = 0;
		int mod = arr[0];
		for(int i = 0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(max<=count) {
				max=count;
				mod=arr[i];
			}
		}
		return mod;
		}

	public static void main(String[] args) {
		
		int arr[] = new int[] {4,2,5,4};
        res(arr);
        System.out.println("Average : " + getAverage(arr));
        System.out.println("Mod : " + getMod(arr));
    	
	}

}
