package exercise1.com.java;
// import exercise1.com.java.*;

public class Main{
    public static void main(String[] args) {

        //Create an instance of Session, populate it with 20 students and dummy scores
        Session ses = new Session();
        //adding 20 students, Full-time student will use FullTime constructor
        ses.addStudent(new FullTime("Drake", "FullTime", 90, 80 , 70));
        ses.addStudent(new Student("Chris", "PartTime", 100));
        ses.addStudent(new FullTime("Wit", "FullTime", 88, 80, 78));
        ses.addStudent(new Student("Lee", "PartTime", 70));
        ses.addStudent(new FullTime("MJ", "FullTime", 50, 60 , 70));

        ses.addStudent(new FullTime("Mike", "FullTime", 22, 23, 24));
        ses.addStudent(new FullTime("Jimmy", "FullTime", 1, 0, 2));
        ses.addStudent(new FullTime("Scott", "FullTime", 100, 98, 89));
        ses.addStudent(new Student("Mu", "PartTime", 79));
        ses.addStudent(new FullTime("Raja", "FullTime", 90, 78, 90));

        ses.addStudent(new FullTime("Flex", "FullTime", 90, 90, 88));
        ses.addStudent(new Student("Joe", "PartTime", 92));
        ses.addStudent(new FullTime("Cow", "FullTime", 77, 85, 87));
        ses.addStudent(new Student("Dude", "PartTime", 89));
        ses.addStudent(new FullTime("Irelia", "FullTime", 50, 60, 70));

        ses.addStudent(new FullTime("Ana", "FullTime", 44, 50, 60));
        ses.addStudent(new FullTime("Alex", "FullTime", 60, 78, 80));
        ses.addStudent(new Student("Creek", "PartTime", 88));
        ses.addStudent(new FullTime("Griffin", "FullTime", 23, 79, 40));
        ses.addStudent(new FullTime("Jason", "FullTime", 98, 88, 76));

        
        // Call all public methods of Session and capture the output of those methods on console

        // Average quiz score
        ses.quizAver(ses);
        // Print score list
        ses.printQuiz(ses);
        //part-time student names
        ses.printPartime(ses);
        //full-time student exams scores
        ses.printFulltime(ses);
    }
}