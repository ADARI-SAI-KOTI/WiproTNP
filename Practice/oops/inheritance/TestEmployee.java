public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Sai", 500000, 2022, "NI12345");

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("NI Number: " + emp.getNationalInsuranceNumber());
    }
}