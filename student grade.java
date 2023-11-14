import java.util.ArrayList;
import java.util.Scanner;

 class studentgrade {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student name and grade");
            System.out.println("2. list of students and grades");
            System.out.println("3. Calculate average grade");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    students.add(studentName);

                    System.out.print("Enter grade for " + studentName + ": ");
                    double grade = scanner.nextDouble();
                    grades.add(grade);
                    System.out.println("Student and grade added successfully!");
                    break;

                case 2:
                    System.out.println("List of students and grades:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i) + ": " + grades.get(i));
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No students to calculate average.");
                    } else {
                        double sum = 0;
                        for (Double studentGrade : grades) {
                            sum += studentGrade;
                        }
                        double avg = sum / students.size();
                        System.out.println("Average grade: " + avg);
                    }
                    break;


                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }
}