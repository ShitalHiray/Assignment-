/*Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in. */

//Program Code:

public class StudentResult {
    public static void main(String[] args) {
               int subject1 = 35; 
        int subject2 = 50;
        int subject3 = 40;
        
        int failCount = 0;
        
             if (subject1 <= 40) {
            failCount++;
        }
        if (subject2 <= 40) {
            failCount++;
        }
        if (subject3 <= 40) {
            failCount++;
        }
        
        if (failCount == 0) {
            System.out.println("Student Passed!");
        } else {
            System.out.println("Student Failed in " + failCount + " subject(s).");
        }
    }
}


//Output:Student Failed in 2 subject(s).
