package opp.btt_day5.b7_1;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", true, "Premium");
        double serviceExpense = 100.0;
        double productExpense = 50.0;

        Visit visit = new Visit(customer, serviceExpense, productExpense);
        System.out.println(visit);

        double totalExpense = visit.getTotalExpense();
        System.out.println("Total Expense: $" + totalExpense);
    }
}
