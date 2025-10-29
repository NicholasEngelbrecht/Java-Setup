public class Wednesday29 {
    static void main() {
        fencedIn(12);
    }

    // The fence-posting problem
    public static void fencedIn(int size) {
        for (int i = 0; i < size; i++) {
            if (i > 0) System.out.print("-");
            System.out.print("|");
        }

        System.out.println();
    }
}