package Calculate;

public class Calculation {
	public static int findMax(int arr[]) {
		if (arr.length == 0) {
			return 0;
		}
		int max = arr[0];
		
		for (int i =1;i<arr.length;i++) {
			if (max<arr[i])
				max = arr[i];
			}
		return max;
	}
		
}
