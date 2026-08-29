package record;
public class SubjectMarks {

    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Error: Please provide marks for 5 subjects as command-line arguments.");
            System.out.println("Usage: java SubjectMarks <mark1> <mark2> <mark3> <mark4> <mark5>");
            return;
        }

        double[] marks = new double[5];
        double total = 0;
        
        for (int i = 0; i < 5; i++) {
            marks[i] = Double.parseDouble(args[i]);
            total += marks[i];
        }

        double average = total / 5.0;

        // Output results
        System.out.println("--- Student Marks Summary ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Marks   : " + total);
        System.out.printf("Average Marks : %.2f\n", average);
    }
}
