import java.util.Scanner;

// Complete the function
// Take input for a and s
class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        sc.nextLine(); // Clear the input buffer

        while (t-- > 0) {
            int a = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            String s = sc.nextLine();

            System.out.println(a);
            System.out.println(s);
        }
    }
}