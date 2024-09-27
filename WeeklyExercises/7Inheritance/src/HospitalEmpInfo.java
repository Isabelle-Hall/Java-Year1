public class HospitalEmpInfo {
    public static void main(String[] args)
    {
        HospitalEmps.Doctor doctor1 = new HospitalEmps.Doctor("Smith", 1001, "Cardiology");
        doctor1.doctorInfo();

        HospitalEmps.Nurse nurse1 = new HospitalEmps.Nurse("Nurse Johnson", 2004, 10);
        nurse1.nurseInfo();

        HospitalEmps.Cleaner cleaner1 = new HospitalEmps.Cleaner("Leon Davis", 5011, "A&E");
        cleaner1.cleanerInfo();
    }
}