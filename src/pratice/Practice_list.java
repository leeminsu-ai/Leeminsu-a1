package pratice;

import java.util.Scanner;

public class Practice_list {

	public static void main(String[] args)throws Exception {
		Scanner list=new Scanner(System.in);
		System.out.print("1.이름:");
		String Name=list.nextLine();
		System.out.print("2.주민번호 앞 6자리");
		int Num=list.nextInt();
		list.nextLine();
		System.out.print("3.전화번호");
		String tel=list.nextLine();
		
		System.out.println("1.이름:"+Name);
		System.out.println("2.주민번호 앞 6자리:"+Num);
		System.out.println("3.전화번호:"+tel);
		
		
		
	}

}
