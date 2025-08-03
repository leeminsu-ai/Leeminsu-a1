package pratice;

	import java.util.Scanner;
public class Student_average_score {

	public static void main(String[] args) {
			boolean run=true;
			int studentNum=0;
			int[]scores=null;
			Scanner scanner=new Scanner(System.in);
			
			while(run) {
				System.out.println("-------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("-------------------");
				System.out.println("선택>");
				
				int selectNo=Integer.parseInt(scanner.nextLine());
				if(selectNo==1) {
					System.out.print("학생수:");
					studentNum=scanner.nextInt();
					scanner.nextLine();
					scores=new int[studentNum];
				}
					else if(selectNo==2)
					{
						if(studentNum==0)
						{
							System.out.println("학생수부터 정해주세요");
							return;
						}
						for(int i=0; i<studentNum; i++)
						{	System.out.println("Scores["+i+"]:");
							scores[i]=scanner.nextInt();
						}
						scanner.nextLine(); 
					}
					else if(selectNo==3) {
						for(int i=0; i<scores.length; i++)
						{
							System.out.println("Scores["+i+"]:"+scores[i]);
						}
					}
					else if(selectNo==4)
					{
						double avg=0;
						int sum=0;
						int best=0;
						for(int i=0; i<scores.length; i++) {
							sum+=scores[i];
							if(scores[i]>best) {
								best=scores[i];
							}
						}
						avg=(double)sum/(scores.length);
						System.out.println("최고점수:"+best);
						System.out.println("평균:"+avg);
					}
					else {
						System.out.println("프로그램 종료");
						run=false;
					}
				}
			
			}
	}

