import java.util.Comparator;
public class EmployeeComprator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.age<o2.age? -1:(o1.age==o2.age?0:1));
    }
}
