\\Does not work
public class MergeSort implements SortingAlgorithm{
	
	public void sort(int[] a, int[] top, int[] bot) {
		int top_index = 0;
		int bot_index = 0;
		int a_index = 0;
		while (top_index < top.length && bot_index < bot.length) {
			if (top[top_index] <= bot[bot_index]) {
				a[a_index++] = top[top_index++];
			} else {
				a[a_index++] = bot[bot_index++];
			}		
		}
		
		while (top_index < top.length) {
			a[a_index++] = top[top_index++];
		}
		
		while (bot_index < bot.length) {
			a[a_index++] = bot[bot_index++];
		}
	}
	
	
	public void partition(int[] a, int[] top, int[] bot) {
		
		if (a.length == 1) {
			
		}
		
		int [] top2 = new int[a.length/2];
		int [] bot2 = new int[a.length - a.length/2]; 
		
		int x = a.length - a.length/2;
		System.out.println("x= " + x);
		for (int i=0; i < top2.length; i++) {
			top2[i] = a[i];
		}
		
		for (int j=0; j< bot2.length; j++) {
			bot2[j] = a[x++];
			System.out.println("== "+a[j]);
		}
		
		sort(a, top2, bot2);

	}
	
	@Override
	public void sort(int[] a) {
		int [] top = new int[a.length/2];
		int [] bot = new int[a.length - a.length/2];  // May be off by 1.
		partition(a, top, bot);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

		
	}

}
