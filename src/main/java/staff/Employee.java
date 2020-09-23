package staff;

import com.sun.istack.internal.NotNull;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "" && name != null) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        if (amount >= 1.00) {
            this.salary *= amount;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
