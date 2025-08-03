package transporation1;

public class Drone extends Electronic implements Flyable  {
	@Override
	void move() {
		System.out.println("드론이 움직입니다");
	}
public void flyable()
	{
		System.out.println("하늘을 납니다");
	}

 
}
