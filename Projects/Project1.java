public class Project1 {

    static class Employee {
        int empNo;
        String empName;
        String joinDate;
        char designationCode;
        String department;
        int basic;
        int hra;
        int it;

        public Employee(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.empName = empName;
            this.joinDate = joinDate;
            this.designationCode = designationCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an Employee ID as a command-line argument.");
            return;
        }

        int searchId;
        try {
            searchId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Employee ID format. Please enter an integer.");
            return;
        }

        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        Employee foundEmployee = null;
        for (Employee emp : employees) {
            if (emp.empNo == searchId) {
                foundEmployee = emp;
                break;
            }
        }

        if (foundEmployee == null) {
            System.out.println("There is no employee with empid : " + searchId);
            return;
        }

        String designation;
        int da;

        switch (foundEmployee.designationCode) {
    case 'e' -> {
        designation = "Engineer";
        da = 20000;
    }
    case 'c' -> {
        designation = "Consultant";
        da = 32000;
    }
    case 'k' -> {
        designation = "Clerk";
        da = 12000;
    }
    case 'r' -> {
        designation = "Receptionist";
        da = 15000;
    }
    case 'm' -> {
        designation = "Manager";
        da = 40000;
    }
    default -> {
        designation = "Unknown";
        da = 0;
    }
}
        int finalSalary = foundEmployee.basic + foundEmployee.hra + da - foundEmployee.it;

        System.out.printf("%-10s %-12s %-12s %-15s %-10s%n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
        System.out.printf("%-10d %-12s %-12s %-15s %-10d%n", 
                foundEmployee.empNo, 
                foundEmployee.empName, 
                foundEmployee.department, 
                designation, 
                finalSalary);
    }
}