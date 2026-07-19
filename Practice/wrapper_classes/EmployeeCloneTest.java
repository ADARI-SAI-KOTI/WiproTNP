/*
Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. After making the clone, change the properties of the original employee object and print the properties of both the original and clone object and note down your observation.
*/

class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class EmployeeCloneTest {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John Doe", 101, 50000.0);
            System.out.println("Original Object: " + emp1);

            Employee emp2 = (Employee) emp1.clone();
            System.out.println("Cloned Object: " + emp2);

            System.out.println("\n--- Modifying the Original Object ---");
            emp1.setName("Jane Smith");
            emp1.setId(102);
            emp1.setSalary(60000.0);

            System.out.println("Original Object (After Modification): " + emp1);
            System.out.println("Cloned Object (Remains Unchanged): " + emp2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}