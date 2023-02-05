package exercise1.com.java;
// import exercise1.com.java.*;

public class Student implements Comparable<Student> {
    String Name;
    String StudentType;
    int QuizzesScore;
    //constructor
    public Student(String Name, String StudentType, int QuizzesScore){
        this.Name = Name;
        this.StudentType = StudentType;
        this.QuizzesScore = QuizzesScore;
    }

    @Override
    public int compareTo(Student s){
        return this.QuizzesScore - s.QuizzesScore;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentType() {
        return StudentType;
    }

    public void setStudentType(String studentType) {
        StudentType = studentType;
    }

    public int getQuizzesScore() {
        return QuizzesScore;
    }

    public void setQuizzesScore(int quizzesScore) {
        QuizzesScore = quizzesScore;
    }
    
}
