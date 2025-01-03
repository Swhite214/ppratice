package ppractice;

public class EFSDFDSFSD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution(); //solution 클래스 접근권한
		int[] asdf = solution.solution(10, 3);
		for(int i = 0 ; i < asdf.length ; i++) {
			System.out.print(asdf[i] + " ");
		}
	}

}

class Solution{ //클래스 2개이상은 가능하지만 public은 붙이면 안됨 파일 이름 혼동함
	//String name = "D";
	//멤버 메서드
	public int[] solution(int n, int k) {
        int[] answer = {};
        for(int i=1; i<=n; i++){
            if(i%k==0){
                answer=new int[answer.length+1]; //새로운 메모리 공간을 하나 만든다 기존의 배열갯수에서
                answer[answer.length-1]=i;//문제는 새로운거 만들다가 기존의 저장해놨던 인덱스값이 사라지고 새로운 값만저장
            }//즉 지금 이코드로는 마지막 값만 저장됨
        }
        return answer;
    }
}

class solution2{
	public int[] solution(int n, int k) {
        int[] answer = {};
        for(int i=1; i<=n; i++){
            if(i%k==0){
                //임시로 데이터 저장공간 확보
                int[] temp=new int[answer.length+1]; //그러므로 temp라는 배열에 값을 담아야함
                for(int j = 0; j<answer.length; j++){
                    temp [j]=answer[j];
                }
                temp[temp.length-1]=i;
                answer=temp;//그후 템프는 if안에서 선언했기에 if탈출하면 사라짐 즉 다시 answer에 복사해야됨
            }
        }
        return answer;
    }
}
class solution3{
	public int[] solution(int n, int k) {
        int[] answer = {};
        for(int i=1; i<=n; i++){
            if(i%k==0){
                //임시로 데이터 저장공간 확보
                int[] temp=new int[answer.length+1]; //그러므로 temp라는 배열에 값을 담아야함
                //temp = Arrays.copyOf(answer, answer.length+1); 이런방법도있음 라이브러리 사용
                System.arraycopy(answer,0,temp,0,answer.length);//자동복사 간단하쥬?
                /*for(int j = 0; j<answer.length; j++){
                    temp [j]=answer[j];
                }*/
                //temp[temp.length-1]=i;
                //answer=temp;//그후 템프는 if안에서 선언했기에 if탈출하면 사라짐 즉 다시 answer에 복사해야됨
            }
        }
        return answer;
    }
}