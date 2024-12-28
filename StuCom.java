/*      @author: Sattaporn Kowarakun
 *      sattaporn_kowarakun@cmu.ac.th
 *      672115046
 */

import java.io.*;
import java.util.*;

class Student{
    int SID;
    String firstName;
    String lastName;

    //Create Student constructor
    public Student(int SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //toString method for display
    @Override
    public String toString() {
        return SID + " " + firstName + " " + lastName;
    }
}//End Student class


public class StuCom{

    public static void main(String[] args) {
        //Default output if didn't type any argument
        if (args.length < 2) {
            System.out.println("Command: java StuCom [argument] [input file]");
            return;
        }

        String arguments = args[0];
        String inputFile = args[1];

        Vector<Student> students = new Vector<>();

        //Read the file
        try (Scanner in = new Scanner(new File(inputFile))) {
            //Skip the unnecessary first 7 line
            for (int i = 0; i < 7; i++) {
                in.nextLine();
            }
            //Read and store student information
            while (in.hasNextLine()) {
                String dataLine = in.nextLine();
                StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
                stu.nextToken();
                int SID = Integer.parseInt(stu.nextToken().trim());
                String firstName = stu.nextToken().trim();
                String lastName = stu.nextToken().trim();
                students.addElement(new Student(SID, firstName, lastName));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        //Arguments selection
        switch (arguments) {
            case "-n": //Sort by student number
                sortByStudentNumber(students);
                break;
            case "-f": //Sort by first name
                sortByFirstName(students);
                break;
            case "-l": //Sort by last name
                sortByLastName(students);
                break;
            case "-s": //Search by first name
                if (args.length < 3) {
                    //Default output if didn't type first name
                    System.out.println("Command: java StuCom -s [input file] [first name]");
                    return;
                }
                searchByFirstName(students, args[2]);
                return;
            default:
                System.out.println("Invalid option. Use -n, -f, -l, or -s.");
                return;
        }

        //Print sorted students
        for (Student s : students) {
            System.out.println(s);
        }
    }//End main method

    private static void sortByStudentNumber(Vector<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).SID > students.get(j + 1).SID) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }//End sortByStudentNumber method

    private static void sortByFirstName(Vector<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).firstName.compareTo(students.get(j + 1).firstName) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }//End sortByFirstName method

    private static void sortByLastName(Vector<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).lastName.compareTo(students.get(j + 1).lastName) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }//End sortByLastName method

    private static void searchByFirstName(Vector<Student> students, String firstName) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).firstName.equalsIgnoreCase(firstName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found at index " + index + ": " + students.get(index));
        } else {
            System.out.println("Student with first name " + firstName + " not found.");
        }
    }//End searchByFirstName method
}//End StuCom class