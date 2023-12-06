package ch05.check;

public class Number7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int maxValue = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(maxValue < array[i]) {
				maxValue = array[i];
				
			} 
			
		}
		System.out.println(maxValue);
	}
}
