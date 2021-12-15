import java.io.EOFException;
import java.util.Vector;

public class Doctor extends Person {
    private String id, specialty;
    private double salary;
    public Doctor(String dId, String dSpecialty, double dSalary, 
                    String aName, int aAge, String aAddress, 
                    String aPhone, String aGender) {
        super(aName, aAge, aAddress, aPhone, aGender);
        id = dId;
        specialty = dSpecialty;
        salary = dSalary;
    }
    //Initialize Doctor File(.txt)
    public static void initialize() throws EOFException {
        try {
            DoctorDA.initialize();
        } catch (Exception e) {
            System.out.println("initialize doctor data error");
        }
        
    }

    //Terminate Doctor File(.txt)
    public static void terminate() {
        try {
            DoctorDA.terminate();
        } catch (Exception e) {
            System.out.println("terminate doctor data error");
        }
    }

    //Getter Doctor
    public String getDoctorId() { return id; }
    public String getDoctorSpecialty() { return specialty; }
    public double getDoctorSalary() { return salary; }
    
    //Setter Docter
    public void setDoctorSpecialty(String dSpecialty) {
        specialty = dSpecialty;
    }
    public void setDoctorSalary(double dSalary) {
        salary = dSalary;
    }

    //Show Info Doctor
    public String toString() {
        String formatStr = "ID: %s\t\t Doctor Name: %s\t\t Age: %d\n" +
        "Gender: %s\t\t Address: %s\t\t\t Phone: %s\n" +
        "Specialty: %s\t Salary: %.2f.-\n" +
        "-------------------------------------------------------------------------";

        String DoctorInfo = String.format(formatStr, getDoctorId(), getName(), getAge(), getGender(), getAddress(), getPhone(), getDoctorSpecialty(), getDoctorSalary());
        return DoctorInfo;
    }

    //Doctor List
    public static void ShowList() {
        Vector<Doctor> DoctorList = new Vector<Doctor>();
        DoctorList = DoctorDA.getAll();
        Doctor aDoctor = null;

        for(int i=0; i<DoctorList.size(); i++) {
            aDoctor = DoctorList.elementAt(i);
            String dId = aDoctor.getDoctorId();
            String dSpecialty = aDoctor.getDoctorSpecialty();
            double dSalary = aDoctor.getDoctorSalary();
            String aName = aDoctor.getName();
            int aAge = aDoctor.getAge();
            String aAddress = aDoctor.getAddress();
            String aPhone = aDoctor.getPhone();
            String aGender = aDoctor.getGender();

            String formatStr = "ID: %s\t\t Doctor Name: %s\t\t Age: %d\n" +
                               "Gender: %s\t\t Address: %s\t\t\t Phone: %s\n" +
                               "Specialty: %s\t Salary: %.2f.-\n" +
                               "-------------------------------------------------------------------------";

            String DoctorInfo = String.format(formatStr, dId, aName, aAge, aGender, aAddress, aPhone, dSpecialty, dSalary);
            System.out.println(DoctorInfo);
        }
    }
}