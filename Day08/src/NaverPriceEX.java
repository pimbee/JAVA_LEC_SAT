import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverPriceEX {

	public static void main(String[] args) throws Exception{
		
		while(true){
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("검색어를 입력해주세요 : ");
			String search_text = sc.nextLine();
						
			String url = "https://search.shopping.naver.com/search/all?query=%s&cat_id=&frm=NVSHATC"; //숫자는 모두 %d로, 문자열은 %s
			url = String.format(url, search_text);
			
			//1.연결
			Connection conn = Jsoup.connect(url);
			
			//2.html가져오기
			Document html = conn.get();
			//System.out.println(html.toString());
			
			//3.html에서 내가 원하는 목록
			Elements ele = html.select(".list_basis > div > div");//list_basis라는 html클래스명을 찝는다.
											//자바스크립트에서는 이런방법을 selector
			
			
			//System.out.println(ele.toString());
			//4.상품목록 html만 가져오기
			for(Element val :ele ) {
				String goodsName = val.select(".basicList_link__1MaTN").text();
				String price = val.select(".price_num__2WUXn").text();
				String link = val.select(".basicList_link__1MaTN").attr("href");
				System.out.println(goodsName);
				System.out.println(price);
				System.out.println(link);
				//System.out.println(val.toString());
				System.out.println("-----------------------------------");
			}
			
			//프로그램종료여부
			System.out.println("프로그램을 종료하시겠습니까? (Y/N) : ");
			String command = sc.nextLine();
			if(command.toUpperCase().equals("Y")) {
				break;
			}
			
		}
	}
	
}
