
public class MultiArrayEX {

	public static void main(String[] args) {
		// ex) 1차원 배열선언
		int[] arrInt = new int[5];
		
		//한층에 방5개 짜리, 3층 건물을 기어봅시다.
		//생성후 따로 넣기
		int[][] arrIntmulti = new int[3][5];
		
		arrIntmulti[0][0] = 1;
		arrIntmulti[0][1] = 100;//.....
		
		//생성과 동시에 방에 데이터 채워넣기
		int[] arrInt2 = {10,20,30}; //1차원배열은 이렇게
		int[][] arrIntmulti2 = {
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		
		int[][] a = new int[3][5];
		for(int x=0; x<a.length; x++) { //a.length ==3
			for(int y=0; y<a[x].length; y++) {
				a[x][y]=x*y;
			}
		}
	}

}
