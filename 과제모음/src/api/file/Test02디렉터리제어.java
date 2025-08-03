package api.file;

import java.io.File;

public class Test02디렉터리제어 {

	public static void main(String[] args) {

		File dir=new File("./files");
		
		if(dir.exists()) {
			System.out.println("대상이존재합니다");
		}
		
		System.out.println("상대위치="+dir.getPath());
		System.out.println("절대위치="+dir.getAbsolutePath());
		String[]names=dir.list();
		for(String name:names) {
			System.out.println("이름:"+name);
			
		}
		
	//.listFiles()디렉터리 내부의 모든 요소들을 객체로 반환
		File[]files=dir.listFiles();
		for(File file:files) {
			System.out.println(file.getName());
			System.out.println(file.length());
			
		}
		
	
		
	}

}
