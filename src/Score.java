import java.util.Scanner;

class Student {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int kor, int eng, int mat) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public void printInfo() {
        System.out.println(name + " " + kor + " " + eng + " " + mat);
    }
}

public class Score {
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

           
        }
        int totalKor = 0;
        int totalEng = 0;
        int totalMat = 0;
        int totalSum = 0;

        for (int i = 0; i < numStudents; i++) {
        	Student s = students[i];
        	System.out.print("이름 국어 영어 수학 총점 평균" + '\n');
            System.out.println("-----------------------");
            s.printInfo();

            totalKor += s.getKor();
            totalEng += s.getEng();
            totalMat += s.getMat();
            totalSum += (s.getKor() + s.getEng() + s.getMat());
        }

        double avg = (double) totalSum / (numStudents * 3);

        System.out.println("--------------------------");
        System.out.printf("총합 %d %d %d %d %.2f%n", totalKor, totalEng, totalMat, totalSum, avg);
    }
}