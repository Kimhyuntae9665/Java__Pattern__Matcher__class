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
			String input = s.nextLine().trim(); //trim�� �� �� ���� �����ִ� �Լ�
			
			if(input.equals("")) { //�Է¹��� ���ڿ��� �������� Ȯ��
				continue;
			}else if(input.equalsIgnoreCase("Q")) { //equalsIgnoreCase("Q") : ��ҹ��� ���о��� ��� �� ��
				System.exit(0);
			}
			
//			�ڹٿ����� ���Խ�(Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���ϴµ� ����ϴ� ���� ���)�� Ȱ���� ���ڿ��� ����, Ž���� ���� Pattern,Matcher Ŭ������ �������ش�.
//			���Խ��� ��) ��ȭ��ȣ,�ֹε�Ϲ�ȣ,�̸��ϰ� ���� �������ִ� ����
//			����ڰ� �� ���Ĵ�� ����� �Է��ߴ��� ������ �ؾ��ϴ� ��찡 ���� �ֽ��ϴ�.==>����ǥ����
//			������ ���� �����ϴ� Pattern class , Matcher class   	������ ���� �����ϴ� Pattern class , Matcher class	������ ���� �����ϴ� Pattern class , Matcher class
			
			
//		    pattern�� ���� ����� ���Ŀ� Matcher class�� matcher() �Լ� �̿�.
//		    pattern ��ü ���� ����, 
		    
		    
		    String pattern = ".*"+input+".*";
		    Pattern p = Pattern.compile(pattern); //Pattern class�� ��ü ������ֱ� compile(pattern)�Լ��� �̿��ؼ� Pattern class�� ��ü ����� 
		    //.*+pattern+.*������ ��ü�� �������.
		    for(int i=0;i<phoneNumArr.length;i++) {
		    	String phoneNum = phoneNumArr[i];
		    	String tmp = phoneNum.replace("-", "");//�߰��� '-' ���ֱ�
		    	
		    	Matcher m = p.matcher(tmp); //pattern�� ��ü��(p�� pattern) matcher(pattern�� �°� ������ ���� �ؽ�Ʈ )�޼ҵ带 ����� Matcher class ��ü ����
		    	
		    	if(m.find()) { //��ü m ���� p(����)�� ��ġ�ϴ� tmp(�ؽ�Ʈ)�� �߰ߵǸ� true��ȯ
		    		list.add(phoneNum);
		    	}
		    }
			
			
			
		    if(list.size()>0) {
		    	System.out.println(list);
		    	list.clear(); //�迭�� ��� null�� �ʱ�ȭ size�� 0���� �ʱ�ȭ
		    }else {
		    	System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
		    }
		    

			
			
		}

	}

}
