import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sales, commission = 0.0;

        System.out.print("Enter sales volume: ");
        sales = input.nextDouble();

        if (sales <= 100) {
            commission = 0.0;
        } else if (sales <= 500) {
            commission = sales * 0.05;
        } else if (sales <= 1000) {
            commission = sales * 0.075;
        } else {
            commission = sales * 0.125;
        }

        System.out.printf("Total commission: RM %.2f", commission);
    }
}
