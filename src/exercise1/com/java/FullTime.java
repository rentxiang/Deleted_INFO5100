package exercise1.com.java;
// import exercise1.com.java.*;



public class FullTime extends Student {
    int Exam1Score;
    int Exam2Score;
    public FullTime(String Name, String StudentType, int QuizzesScore, int Exam1Score, int Exam2Score){
        super(Name, StudentType, QuizzesScore);
        this.Exam1Score = Exam1Score;
        this.Exam2Score = Exam2Score;
    }
}
