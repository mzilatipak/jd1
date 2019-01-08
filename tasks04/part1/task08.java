package by.htp.tasks4.p1;

public class task08 {
	public static void main(String[] args) {
		int[] ar = {1, -2, 0, 4, -5, 0, 7, 8, -9};
		int i, otr = 0, pol = 0, nol = 0;
		
		for (i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				pol += 1;				
			}else if (ar[i] < 0) {
				otr += 1;
			}else {
				nol += 1;				
			} 
		}
		System.out.println("polozhitelnih: "+pol+"; otricatelnih: "+otr+"; noley :"+nol);
	}
} 

