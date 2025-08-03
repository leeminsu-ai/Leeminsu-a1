package day11;

public class GalaxyFold7 extends Phone {
	public GalaxyFold7(int number,char data,char color)
	{
		super(number,data,color);
	}
	
	@Override
	void show(int number,char color)
	{
		System.out.println(number+color);
		
	}
	 @Override
	void sms()
	{
		 System.out.println("갤럭시폴드 문자기능 실행");
	}
	 
}
