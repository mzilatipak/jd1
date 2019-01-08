package task36;


// ch - нечетные, h - четные

public class chetnechet {
	public static void main(String[] args) {
		int x = 1234, a, b, c, d; 
		a=x/1000;
		b=x/100 % 10;
		c=x/10 % 10;
		d=x % 10;
		int ch = 0, nch = 0;
		
		if (a%2==0) {
			ch = a; } 
			else {
			nch=a; 
		}
		if (b%2==0) {
			ch = ch+b; } 
			else {
			nch=nch+b; 
		}
		if (c%2==0) {
			ch = ch+c; } 
			else {
			nch=nch+c; 
		}
		if (d%2==0) {
			ch = ch+d; } 
			else {
			nch=nch+d; 
		}
			System.out.println(ch);
			System.out.println(nch);
			
			
			
			/*else if (b%2==0) {
				ch=a+b;		}
			else if (c%2==0) {
				ch=a+b+c;	}
			else if (d%2==0) {
				ch=a+b+c+d;
			}
		else  
		} */
		
		
		/*int a = 4512;
		StringBuilder s = new StringBuilder();
		System.out.println(a);
		while(a>0) {
		     s.insert(0, a%10);
		     a = a / 10;
		}
		System.out.println(s.toString()); */
		
		
	}
}
