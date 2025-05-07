import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    // que tipo de conceito é usado aqui? (associação, agregação, composição?)
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showAllBonuses() {
        System.out.println("Bonuses for Department: " + name);
        for (Employee e : employees) {
            System.out.printf("%s: %.2f%n", e.getName(), e.calculateBonus());
        }
    }
}

