import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;


public class Exercise9_6 {

	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println(">>");
			String input = s.nextLine().trim(); //trim은 앞 뒤 공백 없애주는 함수
			
			if(input.equals("")) { //입력받은 문자열이 공백인지 확인
				continue;
			}else if(input.equalsIgnoreCase("Q")) { //equalsIgnoreCase("Q") : 대소문자 구분없이 사용 할 때
				System.exit(0);
			}
			
//			자바에서는 정규식(특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식 언어)을 활용해 문자열을 검증, 탐색을 돕는 Pattern,Matcher 클래스를 제공해준다.
//			정규식의 예) 전화번호,주민등록번호,이메일과 같이 정해져있는 형식
//			사용자가 그 형식대로 제대로 입력했는지 검증을 해야하는 경우가 종종 있습니다.==>정규표현식
//			검증을 위해 존재하는 Pattern class , Matcher class   	검증을 위해 존재하는 Pattern class , Matcher class	검증을 위해 존재하는 Pattern class , Matcher class
			
			
//		    pattern을 먼저 만들고 이후에 Matcher class로 matcher() 함수 이용.
//		    pattern 객체 먼저 생성, 
		    
		    
		    String pattern = ".*"+input+".*";
		    Pattern p = Pattern.compile(pattern); //Pattern class의 객체 만들어주기 compile(pattern)함수를 이용해서 Pattern class의 객체 만들기 
		    //.*+pattern+.*패턴의 객체를 만들었다.
		    for(int i=0;i<phoneNumArr.length;i++) {
		    	String phoneNum = phoneNumArr[i];
		    	String tmp = phoneNum.replace("-", "");//중간에 '-' 없애기
		    	
		    	Matcher m = p.matcher(tmp); //pattern의 객체에(p는 pattern) matcher(pattern에 맞게 썻는지 비교할 텍스트 )메소드를 사용해 Matcher class 객체 만듥
		    	
		    	if(m.find()) { //객체 m 에서 p(패턴)에 일치하는 tmp(텍스트)가 발견되면 true반환
		    		list.add(phoneNum);
		    	}
		    }
			
			
			
		    if(list.size()>0) {
		    	System.out.println(list);
		    	list.clear(); //배열을 모두 null로 초기화 size도 0으로 초기화
		    }else {
		    	System.out.println("일치하는 번호가 없습니다.");
		    }
		    

			
			
		}

	}

}
