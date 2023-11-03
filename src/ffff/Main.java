package ffff;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int c;
		while(true) {
		System.out.print("1.입력 ");
		System.out.print("2.삭제 ");
		System.out.print("3.출력 ");
		System.out.print("4.종료 ");
		
		c = s.nextInt(); 
		
		switch(c) {
			case 1:
				System.out.println("학생정보입력을 선택했습니다.");
				InputClass inputClass = new InputClass();
				inputClass.start();
				break;
			case 2:
				System.out.println("학생정보삭제을 선택했습니다.");
				DeleteClass deleteClass = new DeleteClass();
				deleteClass.delete();
				break;
			case 3:
				System.out.println("성적표출력을 선택했습니다.");
				Student stu = new Student();
				stu.Inpo();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				s.close();
				return;
				
			default:
				System.out.println("유효하지 않은 숫자입니다. 다시 선택하여 주세요.");
			}
		if(c >=1 && c<=3) {
			break;
		}
	  } 	
	}
}



