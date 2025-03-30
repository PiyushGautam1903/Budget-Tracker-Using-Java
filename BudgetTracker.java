import java.util.*;

public class BudgetTracker {
    private ArrayList<Double> expenses;
    private ArrayList<Double> incomes;
    private double balance;

    public BudgetTracker() {
        expenses = new ArrayList<Double>();
        incomes = new ArrayList<Double>();
        balance = 0;
    }

    public void addExpense(double expense) {
        expenses.add(expense);
        balance -= expense;
    }

    public void addIncome(double income) {
        incomes.add(income);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    public void printExpenses() {
        System.out.println("Expenses: ");
        for (double expense : expenses) {
            System.out.println(expense);
        }
    }

    public void printIncomes() {
        System.out.println("Incomes: ");
        for (double income : incomes) {
            System.out.println(income);
        }
    }

    public static void main(String[] args){
        BudgetTracker tracker = new BudgetTracker();
        boolean tracker1 = true;
        int option;
        double income, expense;
        Scanner sc = new Scanner(System.in);
        while(tracker1 == true){
            System.out.println("Choose among the following option: \n1.Add Income\n2.Add Expense\n3.Balance left\n4.Incomes\n5.Expenses\n6.Exit");
            option = sc.nextInt();
            switch(option){
                case 1:
                System.out.print("Enter income: ");
                income = sc.nextDouble();
                tracker.addIncome(income);
                break;
                case 2:
                System.out.print("Enter expenses: ");
                expense = sc.nextDouble();
                tracker.addExpense(expense);
                break;
                case 3:
                double balance = tracker.getBalance();
                System.out.println("Your current balance: "+ balance);
                break;
                case 4:
                System.out.println("Your incomes are: ");
                tracker.printIncomes();
                break;
                case 5:
                System.out.println("Your expenses are: ");
                tracker.printExpenses();
                break;
                case 6:
                tracker1 = false;
                break;
                default:System.out.println("Enter valid option!!");
            }
        }
        sc.close();
    }
}