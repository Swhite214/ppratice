package ppractice;

public class Gohome {
	public static void main(String [] args) {
		int a;
		int b;
		for(b=2;b<=9;b++) {
			for(a=1;a<=9;a++) {
				if(b%2==1) continue;
				System.out.println( b + "*" + a + "="+ b*a);
			}
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int x=1; x<=5; x++) {
				System.out.print("$");
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(int q=1;q<=5;q++) {
			for(int w=1;w<=q;w++) {
				System.out.print("$");
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(int r=1; r<=5; r++) {
			for(int t=0; t<6-r; t++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
