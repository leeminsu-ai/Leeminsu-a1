package pratice;

public class All_value {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=10; j++)
			{
				if(4*i+4*j==60)
				{
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}
