
public class SystemClassMethodEX {

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		
		//사용자 컴퓨터의 환경변수를 출력
		for(String var : System.getenv().keySet()) {
			System.out.println(var+"="+System.getenv(var));
		}

	}

}
