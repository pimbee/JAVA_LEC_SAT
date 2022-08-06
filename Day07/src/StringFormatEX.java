
public class StringFormatEX {
	public static void main (String [] args){
		int a  = 100;
		String message = ("홍길동, 만세 점수는" + a + "점입니다.");
		System.out.println(message);
		
		String message2 = ("%s,홍길동, 만세 점수는 %d점입니다.");
		message2 = String.format(message2,"하악하악", a);
		System.out.println(message2);
		
		String loginErrorMag = "아이디 %s(은)는 없는 아이디 입니다.";
		loginErrorMag = String.format(loginErrorMag,"홍길동");
		System.out.println(loginErrorMag);
		
		
		
		//StringBuffer
		//String은 같은 문자열 클래스
		//String 불변객체 "이종석" + "만세" -> "이종석","만세","이종석만세"
		//StringBuffer은 변경이 가능한 문자열 객체
		
		StringBuilder sb = new StringBuilder("이종석");
		sb.append("만세");
		System.out.println(sb); //이종석만세가 된다.
		
		String msg = "  까약까약  ";
		
		//length는 문자열의 공배까지의 포함
		System.out.println("문자열 msg는"+msg.length()+"자입니다.");
		
		//trim()앞뒤공백제거
		msg = msg.trim();
		System.out.println("문자열 msg는"+msg.length()+"자입니다.");
		
		//원칙적으로 중간 공백을 제거 하는 메서드는 없다.
		String trimVal = "까까 꾸꾸 꼬꼬";
		trimVal = trimAllBlankChar(trimVal);
		System.out.println("모든문자열제거 : "+trimVal);
		
	}
	
	public static String trimAllBlankChar(String src) {
		int Ien = src.length();//문자열의 길이를 구합니다.
		char dest[] = new char[Ien];
		src.getChars(0, Ien, dest, 0);
		String result = "";
		for(char var : dest) {
			if(var == ' ') {
				continue;
			}
			result += var;
		}
		
		return result;
	}
	
}
