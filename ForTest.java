package ppractice;

public class ForTest {

	public static void main(String[] args) {
		// 구구단 무식한방법
		int i=1;
		System.out.println("2*1=2");
		System.out.println("2*2=4");
		System.out.println("2*3=6");
		System.out.println("2*4=8"); //.....
		System.out.print(String.format("2*%d=%2d\n", 1,2*1)); //굳이요 대체왜 하는거임? 앞의 2d이건 자릿수임 2곱하라는뜻아님
	
		System.out.printf("2 * %d = %2d\n", i,2*i); i++;//이걸 반복문으로 만든다면?
		
		for(i=1; i<=9; i++) {
			System.out.printf("2 * %d = %2d\n", i,2*i);
		}
	}

}
