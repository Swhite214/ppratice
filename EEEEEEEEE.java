package ppractice;

public class EEEEEEEEE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a;
		int b;
		for(i=0;i<5;i++) {
			for(a=1;a<5-i; a++) {
				System.out.print(" ");
			}
			
			for(b=0;b<i*2+1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int z=4; z>0; z--) {// z<0아님 z>0이여야함
			for(int y=5;y>z; y--) {
				System.out.print(" ");
			}
			for(int x=0; x<z*2-1;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			
	
	


