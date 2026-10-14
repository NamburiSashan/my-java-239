package tasks;

class Student {
    int rollNumber;
    String studentName;
    int[] marks;

    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    double calculatePercentage() {
        double percentage = ((double) calculateTotal() / (marks.length * 100)) * 100;

        return Math.round(percentage * 100.0) / 100.0;
    }

    String getGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    String getResult() {
        if (calculatePercentage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    String getRemark() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "Excellent Performance";
        } else if (percentage >= 80) {
            return "Very Good Performance";
        } else if (percentage >= 70) {
            return "Good Performance";
        } else if (percentage >= 60) {
            return "Satisfactory Performance";
        } else if (percentage >= 50) {
            return "Needs Improvement";
        } else {
            return "Poor Performance";
        }
    }

    void displayDetails() {
        String formattedName = studentName.trim().toUpperCase();

        System.out.println("===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Student Name    : " + formattedName);
        System.out.println("Name Length     : " + formattedName.length());

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "       : " + marks[i]);
        }

        System.out.println("\nTotal Marks     : " + calculateTotal());
        System.out.println("Average Marks   : " + calculateAverage());
        System.out.println("Highest Marks   : " + findHighest());
        System.out.println("Lowest Marks    : " + findLowest());
        System.out.println("Percentage      : " + calculatePercentage() + "%");
        System.out.println("Grade           : " + getGrade());
        System.out.println("Result          : " + getResult());
        System.out.println("Remark          : " + getRemark());
    }
}

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {

        int[] marks = {85, 92, 78, 88, 95};

        Student student = new Student(
                101,
                "  Rahul Sharma  ",
                marks
        );

        student.displayDetails();
    }
}