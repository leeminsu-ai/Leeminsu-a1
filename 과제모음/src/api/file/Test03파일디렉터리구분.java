package api.file;

import java.io.File;

public class Test03파일디렉터리구분 {

	public static void main(String[] args) {
		File a=new File("files","sample.txt3");
		File b=new File("files","sample4.txt");
		File c=new File("files","sample.txt");
		
		System.out.println("a가 파일인가?"+a.isFile());
		System.out.println("b가 파일인가?"+b.isFile());
		System.out.println("c가 파일인가?"+c.isFile());
		
		System.out.println(b.isDirectory());
		System.out.println(c.isDirectory());
	}

}
