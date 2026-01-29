package expensetrackersystem;

import java.sql.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ExpenseDAO dao = new ExpenseDAO();

        while (true) {
            System.out.println("\n===== SMART EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    System.out.print("Date (YYYY-MM-DD): ");
                    Date date = Date.valueOf(sc.next());
                    dao.addExpense(title, category, amount, date);
                    break;

                case 2:
                    dao.viewAllExpenses();
                    break;

                case 3:
                    System.out.println("Thank you for using Expense Tracker!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }

	}

}
