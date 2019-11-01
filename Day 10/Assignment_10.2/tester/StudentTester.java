package tester;

import school.*;
import schoolexception.StudentHandlingException;

import static school.Student.*;

import java.util.*;

import static utils.ValidationRules.*;

public class StudentTester {

    public static void main(String[] args) {

        HashMap<String, Student> hm = new HashMap<>();

        Student tempStudent;

        try (Scanner sc = new Scanner(System.in)) {
            boolean loop = true;
            int option;

            while (loop) {

                System.out.println("\t\t____________MENU__________"    );
                System.out.println("\n1.  Register new Student"        );
                System.out.println("\n2.  Display all Students"        );
                System.out.println("\n3.  Search PRN in Database"      );
                System.out.println("\n4.  Update Student Marks"        );
                System.out.println("\n5.  Filter Student by Birth Date");
                System.out.println("\n6.  Filter Student by Course"    );
                System.out.println("\n7.  Remove Student"              );
                System.out.println("\n8.  Sort by PRN"                 );
                System.out.println("\n9.  Find Topper for a course"    );
                System.out.println("\n10. EXIT"                        );
                System.out.println("\nPlease select an option ...\n"   );

                option = sc.nextInt();
                sc.nextLine(); // Eats New Line Character
                try {
                    switch (option) {

                        case 1: {

                            System.out.println("Enter Student PRN: ");
                            String temp = sc.nextLine();
                            String prn = validatePRN(hm, temp);

                            System.out.println("Enter Student Name: ");
                            String name = validateName(sc.nextLine());

                            System.out.println("Enter Email: ");
                            String email = validateEmail(sc.nextLine());

                            System.out.println("Enter Course: ");
                            Course course = validateCourse(sc.nextLine());

                            System.out.println("Enter Date (dd.mm.yyyy): ");
                            Date date = validateDate(sc.nextLine());

                            System.out.println("Enter Marks: ");
                            int marks = validateMarks(sc.nextInt());

                            tempStudent = new Student(prn, name, email, marks, date, course);
                            hm.putIfAbsent(prn, tempStudent);
                            // students.add(tempStudent);
                            break;
                        }
                        case 2: {

                            System.out.println("print using toString:");
                            System.out.println(hm);

                            System.out.println("print using values(): ");
                            for (Student std : hm.values()) {
                                System.out.println(std);
                            }

                            System.out.println("Print using keySet(): ");
                            for (String sPRN : hm.keySet()) {
                                System.out.println(hm.get(sPRN));
                            }

                            System.out.println("Print Using Entry & getKey & getValue: ");
                            // Set< Map.Entry< String,Student> > stf = hm.entrySet();
                            for (Map.Entry<String, Student> me : hm.entrySet()) {
                                System.out.println(me.getKey() + ": ");
                                System.out.println(me.getValue());
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Enter PRN to search");
                            String searchPRN = sc.next();
                            System.out.println("Searching " + searchPRN);
                            if (hm.containsKey(searchPRN))
                                System.out.println(searchStudent(hm, searchPRN));
                            else
                                System.out.println("Student Not Found!");
                            break;
                        }
                        case 4: {
                            System.out.println("Enter PRN to search");
                            String searchPRN = sc.next();
                            if (hm.containsKey(searchPRN)) {
                                System.out.println("Enter the Marks: ");
                                searchStudent(hm, searchPRN).setMarks(sc.nextInt());
                                System.out.println("Student Marks Updated!");
                            } else {
                                System.out.println("Student with entered PRN (" + searchPRN + ") not Present in DataBase!");
                            }

                        }

                        case 5: {
                            System.out.println("Enter Date (dd.mm.yyyy): ");
                            Date date = validateDate(sc.nextLine());
                            filterByDate(hm, date);
                            break;
                        }

                        case 6: {
                            System.out.println("Enter school.Course: ");
                            Course course = validateCourse(sc.nextLine());
                            filterByCourse(hm, course);
                            break;
                        }

                        case 7: {
                            System.out.println("Enter Student PRN: ");
                            String prn = sc.nextLine();
                            try {
                                hm.remove(prn);
                                System.out.println("Student Removed!");
                            } catch (Exception e) {
                                throw new StudentHandlingException("No Student Registered with PRN (" + prn + ")");
                            }
                            break;
                        }

                        case 8: {
                            ArrayList<String> sortedKeys = new ArrayList<>(hm.keySet());
                            Collections.sort(sortedKeys);
                            System.out.println("Sorted By PRN: ");
                            for (String x : sortedKeys)
                                System.out.println(hm.get(x));
                            break;
                        }
                        case 9: {
                            int max = 0;
                            String topper = null;
                            System.out.println("Enter school.Course: ");
                            Course course = validateCourse(sc.nextLine());
                            for (Student std : hm.values()) {
                                if (std.getCourse() == course) {
                                    if (max < std.getMarks()) {
                                        max = std.getMarks();
                                        topper = std.getPrn();
                                    }
                                }
                            }
                            System.out.println("Topper for " + course + " is: ");
                            System.out.println(hm.get(topper));
                            break;
                        }

                        case 10: {
                            sc.close();
                            loop = false;
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }

            }

        }
    }
}