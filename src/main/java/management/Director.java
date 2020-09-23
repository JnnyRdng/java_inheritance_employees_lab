package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String NI, double salary, String dept, double budget) {
        super(name, NI, salary, dept);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        return 0.02 * getSalary();
    }
}
