package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 500;
		int j = 40;
		int k = 30;
		int min = i;
		int max = i;
		if (j<min) min = j;
		if (k<min) min = k;
		if (j>max) max = j;
		if (k>max) max = k;
		
		System.out.println("min:" + min);
		System.out.println("max:" + max);
	
	}
	

}
