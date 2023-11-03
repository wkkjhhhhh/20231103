package asd;

public class Student {
	private String name;
    private int kor;
    private int eng;
    private int mat;
    private int totalScore;
    private int avg;
    
    	
    
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int kor, int eng, int mat) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.totalScore = kor+eng+mat;
        this.avg = totalScore /3;
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
    public int getTotalScore() {
        return totalScore;
    }
    public int getavg() {
    	return avg;
    }
    public void printInfo() {
        System.out.println(name + " " + kor + " " + eng + " " + mat +" "+ totalScore+" "+avg);
    }
}
 

