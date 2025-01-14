public class Q6 {
    public static void main(String[] args) {
        int n = 500; // Total number of bulbs
        int[] bulbs = new int[n + 1]; // Array to track bulb status (0 = OFF, 1 = ON)

        // Simulate the toggling process
        for (int step = 1; step <= n; step++) {
            for (int i = step; i <= n; i += step) {
                bulbs[i] = 1 - bulbs[i]; // Toggle the bulb (ON -> OFF, OFF -> ON)
            }
        }

        // Collect and print bulbs that are OFF
        System.out.println("Bulbs that are OFF:");
        for (int i = 1; i <= n; i++) {
            if (bulbs[i] == 0) { // Check if the bulb is OFF
                System.out.print(i + " ");
            }
        }
    }
}

