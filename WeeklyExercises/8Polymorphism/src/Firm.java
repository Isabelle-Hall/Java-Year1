//********************************************************************
//  Firm.java       Java Foundations
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm {

    public static void main(String[] args) {
        Personnel personnel = new Personnel();
        personnel.displayVacation();
    }

    static class Staff {
        private String empName;
        private String empRole;

        public Staff(String name, String role) {
            this.empName = name;
            this.empRole = role;
        }

        public String getName() {
            return empName;
        }

        public String getRole() {
            return empRole;
        }
    }

    static class Manager extends Staff {
        public Manager(String name) {
            super(name, "Manager");
        }

        public int calculateVacation() {
            return 12;
        }
    }

    static class Receptionist extends Staff {
        public Receptionist(String name) {
            super(name, "Receptionist");
        }

        public int calculateVacation() {
            return 8;
        }
    }

    static class Personnel {
        private Staff[] employees;

        // Constructor
        public Personnel() {
            employees = new Staff[3];
            employees[0] = new Manager("Mark");
            employees[1] = new Receptionist("Susan");
            employees[2] = new Receptionist("Dorothy");
        }

        public void displayVacation() {
            for (Staff employee : employees) {
                String role = employee.getRole();
                int vacationDays;

                if (role.equals("Manager")) {
                    vacationDays = ((Manager) employee).calculateVacation();
                } else {
                    vacationDays = ((Receptionist) employee).calculateVacation();
                }

                System.out.println(employee.getName() + " - " + employee.getRole() + " - Vacation Days: " + vacationDays);

            }
        }
    }
}
