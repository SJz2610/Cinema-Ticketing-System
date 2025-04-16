import java.util.Scanner;

public class SeatScheduling {
    private Showtime showtime; // Link to Showtime instance

    // Constructor
    public SeatScheduling(Showtime showtime) {
        this.showtime = showtime;
    }

    // Method to display seats
    public void displaySeats() {
        boolean[][] seatArr = showtime.getAvailableSeats(); // Retrieve seat layout
        char rowLabel = 'A'; // Labels rows from A to F

        System.out.print("\n       |Screen|\n\n  ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " "); // Print column numbers
        }
        System.out.println();

        for (int i = 0; i < seatArr.length; i++) {
            System.out.print(rowLabel + " "); // Print row labels
            for (int j = 0; j < seatArr[i].length; j++) {
                if (!seatArr[i][j]) { // False indicates available
                    System.out.print("o ");
                } else { // True indicates booked
                    System.out.print("x ");
                }
            }
            System.out.println();
            rowLabel++;
        }
        System.out.println("\no - Available");
        System.out.println("x - Unavailable\n");
    }

    // Method for user to choose seats
    public void chooseSeats(int count) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] seatArr = showtime.getAvailableSeats(); // Retrieve seat layout
        String[] selectedSeats = new String[count];

        int rowChoose = 0;
        int colChoose;

        for (int n = 0; n < count; n++) {
            boolean valid = false;
            while (!valid) {
                System.out.println("Seat " + (n + 1) + ": ");

                // For row selection
                char row;
                do {
                    System.out.print("Select row (A - F): ");
                    String input = scanner.nextLine();
                    if (input.length() == 1) {
                        row = Character.toUpperCase(input.charAt(0));
                        if (row >= 'A' && row <= 'F') {
                            rowChoose = row - 'A'; // Convert row label to array index
                            break;
                        } else {
                            System.out.println("Please enter A - F only.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a single letter (A - F).");
                    }
                } while (true);

                // For column selection
                int col;
                do {
                    try {
                        System.out.print("Select column (1 - 10): ");
                        col = scanner.nextInt();
                        if (col >= 1 && col <= 10) {
                            colChoose = col - 1; // Convert column number to array index
                            break;
                        } else {
                            System.out.println("Please enter 1 - 10 only.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number (1 - 10).");
                        scanner.nextLine(); // Clear buffer
                    }
                } while (true);

                // Validate seat availability
                if (seatArr[rowChoose][colChoose]) { // True indicates booked
                    System.out.println("This seat is already booked. Please select another.");
                } else {
                    valid = true;
                    seatArr[rowChoose][colChoose] = true; // Mark seat as booked
                    selectedSeats[n] = (char) ('A' + rowChoose) + Integer.toString(col + 1); // Store seat number
                }
                scanner.nextLine(); // Clear buffer
            }
        }

        // Display selected seats
        System.out.print("\nYour seat numbers are: ");
        for (String seat : selectedSeats) {
            System.out.print(seat + " ");
        }
        System.out.println();

        scanner.close();
    }
}