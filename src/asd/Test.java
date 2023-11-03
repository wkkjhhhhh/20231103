package asd;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numStudents = 3;
	        
	        Student[] students = new Student[numStudents];
	        for (int i = 0; i < numStudents; i++) {
	        	Student s = new Student();
	        	 
	        	System.out.println("학생 " + (i + 1) + "의 정보를 입력하세요:");
	            System.out.print("이름: ");
	            String name = scanner.next();
	            System.out.print("국어 성적: ");
	            int kor = scanner.nextInt();
	            System.out.print("영어 성적: ");
	            int eng = scanner.nextInt();
	            System.out.print("수학 성적: ");
	            int mat = scanner.nextInt();
	        
	            s.setName(name);
	            s.setScore(kor, eng, mat);
	            students[i] = s;
	            int Total = s.getTotalScore();
	            double Avg = (double) Total / 3;
	        }
	            System.out.print("이름 국어 영어 수학 총점 평균" + '\n');
	            System.out.println("-----------------------");
	        	
	        	int totalKor = 0;
	        	int totalEng = 0;
	        	int totalMat = 0;
	        	int totalSum = 0;

	        for (int i = 0; i < numStudents; i++) {
	        	Student s = students[i];
	            s.printInfo();
	            
	            totalKor += s.getKor();
	            totalEng += s.getEng();
	            totalMat += s.getMat();
	            totalSum += s.getTotalScore();
	        }

	        double avg = (double) totalSum / (numStudents * 3);

	        System.out.println("--------------------------");
	        System.out.printf("총합 %d %d %d %d %.2f%n", totalKor, totalEng, totalMat, totalSum, avg);
	        
	        }
		}
