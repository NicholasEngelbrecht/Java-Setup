import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Files {
    // Needs to throw an error if the file doesn't exist
    void main() throws FileNotFoundException {
        // Open a file and give it to a scanner
        File students = new File("Chapter 06/students.txt");
    
        // Check if file exists and ask for new file name if not
        Scanner scanner = new Scanner(System.in);
        while (!students.canRead()) {
            System.out.println("File \"" + students.getPath() + "\" does not exist.  Please input a new file name: ");
            students = new File(scanner.nextLine());
        }

        scanner.close();
        scanner = new Scanner(students);

        // Create new writable file
        File output = new File("Chapter 06/output.txt");
        PrintStream out = new PrintStream(output);

        // Loop through the scanner if there is a next token
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Scanner process = new Scanner(line);

            
            String given = process.next();
            String last = process.next();
            int year = process.nextInt();
            String grades = process.nextLine();

            out.println("--------------------------------");
            out.println("Name:   " + given + ", " + last);
            out.println("Year:   " + year);
            out.println("Grades: " + grades);
            out.println("--------------------------------\n");

            process.close();
        }

        out.close();
        scanner.close();
    }
}
