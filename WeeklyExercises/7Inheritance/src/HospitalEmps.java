public class HospitalEmps {

    public static class Doctor {
        String name;
        String specialism;
        int empNo;

        public Doctor(String name, int empNo, String specialism) {
            this.name = name;
            this.empNo = empNo;
            this.specialism = specialism;
        }
        public void doctorInfo() {
            System.out.println("Doctor " + name + " Emp#" + empNo + " specializes in " + specialism);
        }
    }

    public static class Nurse {
        String name;
        int patientNo;
        int empNo;

        public Nurse(String name, int empNo, int PatientNo) {
            this.name = name;
            this.empNo = empNo;
            this.patientNo = PatientNo;
        }
        public void nurseInfo() {
            System.out.println("Nurse " + name + " Emp#" + empNo + " has " + patientNo + " patients");
        }
    }

    public static class Cleaner {
        String name;
        String department;
        int empNo;

        public Cleaner(String name, int empNo, String department) {
            this.name = name;
            this.empNo = empNo;
            this.department = department;
        }
        public void cleanerInfo() {
            System.out.println("Cleaner " + name + " Emp#" + empNo + " of " + department + " is sweeping");
        }
    }
}



