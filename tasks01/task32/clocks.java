package task32;

import java.time.*;

public class clocks {
	public static void main(String[] args) {
		long m=2030;
		long n=950; 
		long k=4700;
		long s1=m+n+k;
		
		long p=4800;
		long q=120;
		long r=9030;
		long s2=p+q+r;
		
		long rez=s1+s2;
		
		System.out.println(LocalTime.ofSecondOfDay(rez));	
		
		
	}
	
}
