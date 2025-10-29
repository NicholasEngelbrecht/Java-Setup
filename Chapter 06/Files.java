import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    // Needs to throw an error if the file doesn't exist
    void main() throws FileNotFoundException {
        // Open a file and give it to a scanner
        File students = new File("Chapter 06/students.txt");
        Scanner scanner = new Scanner(students);

        // Loop through the scanner if there is a next token
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Scanner process = new Scanner(line);

            
            String given = process.next();
            String last = process.next();
            int year = process.nextInt();
            String grades = process.nextLine();

            System.out.println("--------------------------------");
            System.out.println("Name:   " + given + ", " + last);
            System.out.println("Year:   " + year);
            System.out.println("Grades: " + grades);
            System.out.println("--------------------------------\n");

            process.close();
        }

        scanner.close();
    }
}
