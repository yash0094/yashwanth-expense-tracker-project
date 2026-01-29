package expensetrackersystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExpenseDAO {
	public void addExpense(String title, String category, double amount, Date date) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO expenses(title, category, amount, expense_date) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, category);
            ps.setDouble(3, amount);
            ps.setDate(4, date);
            ps.executeUpdate();
            System.out.println("Expense added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAllExpenses() {
        try (Connection con = DBConnection.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM expenses");

            System.out.println("\nID | Title | Category | Amount | Date");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("title") + " | " +
                    rs.getString("category") + " | " +
                    rs.getDouble("amount") + " | " +
                    rs.getDate("expense_date")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
