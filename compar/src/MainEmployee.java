public class MainEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee("Ali Ahmadi",33,1500,3);
        Employee employee1=new Employee("Saeed mohamadi",40,2500,10);
       EmployeeComprator employeeComprator=new EmployeeComprator();
        System.out.println( "Result of CompaTo: "+employee.compareTo(employee1));
        System.out.println("Result of Comprator: "+employeeComprator.compare(employee,employee1));
    }

}
