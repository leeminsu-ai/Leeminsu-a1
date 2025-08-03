package pratice;

import java.util.Scanner;

public class Login_enter {

	public static void main(String[] args) throws Exception{	
		
		Scanner Login=new Scanner(System.in);
		System.out.print("아이디:");
		String name=Login.nextLine();
		
		System.out.print("비밀번호");
		String strpassword=Login.nextLine();
		int password=Integer.parseInt(strpassword);
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패:패스워드틀림");
			}
		}
		else {
			System.out.println("로그인실패:아이디 존재하지 않음");
		}
	}
	}


