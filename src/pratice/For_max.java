package pratice;

public class For_max {

	public static void main(String[] args) {
		int max=0;
		int[] array= {1,2,3,8,2};
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("max:"+max);
	}

}
