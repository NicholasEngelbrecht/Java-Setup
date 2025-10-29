public class Test {
    public static void main() {
        double c = pythagorean(12, 5);
        System.out.println(c);
    }

    // Triangles
    public static void drawTriangle(int SIZE) {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");

            for (int j = 0; j < i; j++) {
                if (i == SIZE - 1) System.out.print("_");
                else System.out.print(" ");
            }

            System.out.println("\\");
        }
    }

    public static void drawTriangleBackwards(int SIZE) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(" ");
            }

            System.out.print("/");
            
            for (int j = 0; j < i; j++) {
                if (i == SIZE - 1) System.out.print("_");
                else System.out.print(" ");
            }
            
            System.out.println("|");
        }
    }

    public static void drawTriangleUpsideDown(int SIZE) {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");

            for (int j = 0; j < SIZE - i; j++) {
                if (i == 0) System.out.print("\u203E");
                else System.out.print(" ");
            }

            System.out.println("/");
        }
    }

    // Return types
    public static double pythagorean(double a, double b) {
        return cosineLaw(a, b, 90);
    }

    public static double cosineLaw(double a, double b, double theta) {
        if (true)
            return Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(theta * Math.PI / 180)));

        // Code here will never be reached ;)
        double A = 1892;
        double B = 9280;
        double C = Math.sqrt(B * B * B * A + 18) * Math.sqrt( A * A * A * B + 12); 
        double D = Math.sin(C + C) * 2379423d;
        if (D == D)
            D = D * D * D * (C + 1);

        for (int i = 0;i < D; i++)
            System.out.println(i + D);

        return D;
    }
}