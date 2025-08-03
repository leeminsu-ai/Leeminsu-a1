package pratice;

public class Memberservice {
	String id;
	String password;
	
public Memberservice(){
		this.id="hong";
		this.password="12345";
	
}
		
	boolean login(String id,String password)
	{
		if(this.id==id&&this.password==password)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void logout(String id)
	{
		System.out.println("로그아웃 되었습니다.");
	}
	
}
