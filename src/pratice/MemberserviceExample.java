package pratice;

public class MemberserviceExample {

	public static void main(String[] args) {	
			Memberservice memberservice=new Memberservice();
			boolean result=memberservice.login("hong","12345");
			if(result)
			{
				System.out.println("로그인 되었습니다");
				memberservice.logout("hong");
				
			}
			else {
				System.out.println("id 또는 password가 올바르지않습니다");
			}

	}

}
