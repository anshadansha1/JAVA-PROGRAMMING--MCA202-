
import java.util.Scanner;

class P11_8_salesman {
    private String name;
    private int salesmanCode;
    private double salesAmount;
    private double commission;

    public P11_8_salesman(String name, int salesmanCode, double salesAmount) {
        this.name = name;
        this.salesmanCode = salesmanCode;
        this.salesAmount = salesAmount;
        calculateCommission();
    }

    private void calculateCommission() {
        if (salesAmount < 2000) {
            commission = salesAmount * 0.08; // 8% commission
        } else if (salesAmount >= 2000 && salesAmount <= 5000) {
            commission = salesAmount * 0.10; // 10% commission
        } else {
            commission = salesAmount * 0.12; // 12% commission
        }
    }

    public void display() {
        System.out.println("Salesman Name: " + name);
        System.out.println("Salesman Code: " + salesmanCode);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Salesman Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Salesman Code: ");
        int salesmanCode = scanner.nextInt();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        P11_8_salesman salesman = new P11_8_salesman(name, salesmanCode, salesAmount);
        System.out.println("\nSalesman Details:");
        salesman.display();

        scanner.close();
    }
}