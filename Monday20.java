import java.util.Scanner;

public class Monday20 {
    static void main() {
        double[] data = { 1.0d, 2.0d, 27.0d, 123.1d, 52.3d };
        double[] averages = AverageTest(data);
        System.out.println("Average A: " + averages[0] + "\nAverage B: " + averages[1] + "\n");

        System.out.println("There are " + Differ(12, 29) + " difference(s) between 12 and 29\n");

        System.out.println("Average grade: " + AverageGrade2());
    }

    // Compute the average of a user-inputed amount of numbers
    public static double AverageGrade() {
        System.out.print("Enter amonut of numbers: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double grades = 0;

        // Process n times
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = console.nextInt();
            grades += grade;
        }

        return grades / n;
    }

    // Computer the average from an unknown amount of numbers
    public static double AverageGrade2() {
        System.out.println("Enter grade, or DONE to stop.");

        int n = 1;
        double average = 0.0d;
        Scanner console = new Scanner(System.in);

        for (;;n++) {
            System.out.print("Grade " + n + ": ");
            String text = console.next();

            if (text.equalsIgnoreCase("DONE")) break;
            try {
                double grade = Double.parseDouble(text);
                average += (grade - average) / n;
            } catch (NumberFormatException e) {
                System.out.println("Failed to process grade.  Please try again.");
                n--;
            }
        }

        return average;
    }

    // Both averages should be the same
    public static double[] AverageTest(double[] data) {
        // Add all numbers and divide by length
        double cummulated = 0.0d;
        for (int i = 0; i < data.length; i++)
            cummulated += data[i];
        double averageA = cummulated / data.length;


        // On-the-fly computation
        double averageB = 0.0d;
        for (int i = 0; i < data.length; i++) {
            averageB += ( data[i] - averageB ) / (i + 1);
        }

        double[] averages = { averageA, averageB };
        return averages;
    }

    // On-paper example test
    static int Differ(int a, int b) {
        String A = Integer.toBinaryString(a);
        String B = Integer.toBinaryString(b);

        System.out.println(A);
        System.out.println(B);

        int differences = 0;
        for (int i = 0; i < A.length(); i++)
            if (A.charAt(i) != B.charAt(i))
                differences++;

        return differences;
    }
}
