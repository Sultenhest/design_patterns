package composite;// import statements

public class SalesDepartment implements Department {
    public Integer id;
    public String name;

    public SalesDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}