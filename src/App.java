import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        int average = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);
                sum += num;
                count += 1;
            } catch (Exception e) {
                break;
            }

        }


        if (count == 0) {
            average = 0;
        } else {
            average = sum / count;
        }

        System.out.println(" Sum = " + sum + " Average = " + average);


    }

}
