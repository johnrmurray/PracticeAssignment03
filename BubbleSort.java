public class BubbleSort implements SortingAlgorithm{
	
	public void sort(int[] a) {
		boolean swapped = true;
		for (int j = 0; j < a.length && swapped; j++) {
			swapped = false;
			for (int i=0; i < a.length-1; i++) {
				if (a[i] > a[i+1]) {
					swap(a, i, i+1);
					swapped = true;
				}
	 		}
		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
//		}
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
