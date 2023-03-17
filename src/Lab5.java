/*-------------------------------------------------------------
// AUTHOR: Justin Lee
// FILENAME: Lab5.java
// SPECIFICATION: Practice using making classes and using objects.
// FOR: CS 1400 - Lab #5
// TIME SPENT: 40 minutes
//-----------------------------------------------------------*/
import java.util.*;
public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sBroncoId;
        double sGrade;
        String pName, pDesc, pFname;

        // Read some input data
        System.out.println("The student's first name?");
        sFirstname = scan.nextLine();
        System.out.println("The student's last name?");
        sLastname = scan.nextLine();
        System.out.println("The student's Bronco Id?");
        sBroncoId = scan.nextLine();
        System.out.println("Program name?");
        pName = scan.nextLine();
        System.out.println("Program desc?");
        pDesc = scan.nextLine();
        System.out.println("Program filename?");
        pFname = scan.nextLine();
        System.out.println("Program grade?");
        sGrade = scan.nextDouble();
        scan.nextLine();
        System.out.println("");
        scan.close();
        Student student1 = new Student(sFirstname, sLastname, sBroncoId);
        System.out.println("Making a student record\n...[" + student1.toString() + "]");
        student1.setGrade(sGrade);
        Program program1 = new Program(pName, pDesc, pFname, student1);

    }
}
