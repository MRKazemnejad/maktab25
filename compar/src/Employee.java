public class Employee implements Comparable<Employee>{
    double salary;
    int age;
    String name;
    int experience;

    public Employee(String name,int age,double salary,int experience){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.experience=experience;
    }

    @Override
    public int compareTo(Employee o) {
        return (this.experience<o.experience? -1:(this.experience==o.experience? 0:1));
    }
}
