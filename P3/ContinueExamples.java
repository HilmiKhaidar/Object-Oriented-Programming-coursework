package P3;

public class ContinueExamples {
    public static void main(String[] args) {
        // =============== ContinueExample1 ===============
        System.out.println("=== ContinueExample1 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue; // Lewati i == 6
            }
            System.out.println(i);
        }

        // =============== ContinueExample2 ===============
        System.out.println("\n=== ContinueExample2 ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // Lewati j == 2
                }
                System.out.println(i + " " + j);
            }
        }

        // =============== ContinueExample3 ===============
        System.out.println("\n=== ContinueExample3 ===");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outer; // Lompat ke next i saat i==2 dan j==2
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
