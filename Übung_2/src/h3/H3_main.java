package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 50;
		int j = 20;
		int k = -10;
		
		//Ausdruck 1: i>J
		//Ausdruck 2: i>200
		//Ausdruck 3: j>100
		
		if ((i>j) && !(i>200) && !(j>100)) {
			k=1;
		}
		if ((i>j) && (i>200) && !(j>200)){
			k=2;
		}
		if ((i>j) && (i>200) && (j>100)) {
			k=3;
		}
		if(!(i>j) && !(i>200) && !(j>100)) {
			k=4;
		}
		
		
		System.out.println("k = " +k);
	}
}
			
		

	

