package composite;

public class FinancialDepartment implements Department {
    public Integer id;
    public String name;

    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
