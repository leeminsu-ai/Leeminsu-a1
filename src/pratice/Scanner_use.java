package pratice;

import java.util.Scanner;

public class Scanner_use {

	public static void main(String[] args)throws Exception {
		Scanner a=new Scanner(System.in);
		
		System.out.print("첫번쨰수");
		String strNum1=a.next();
		
		System.out.print("두번째수");
		String strNum2=a.next();
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result=num1+num2;
		System.out.println("덧셈결과:"+result);
	}

}
