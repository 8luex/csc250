import java.io.EOFException;
import java.util.ArrayList;

public class Patient extends Person {
    private String id, bloodtype, intolerance;
    private Appointment appointment;
    private ArrayList<TreatmentHistory> treatmenthistory;
    public Patient(String pId, String pBloodtype, 
                    String pIntolerance, 
                    String aName, int aAge, String aAddress, 
                    String aPhone, String aGender) {
        super(aName, aAge, aAddress, aPhone, aGender);
        id = pId;
        bloodtype = pBloodtype;
        intolerance = pIntolerance;
        appointment = null;
        treatmenthistory = new ArrayList<TreatmentHistory>();
    }

    public String getPatientId() { return id; }
    public String getPatientBloodtype() { return bloodtype; }
    public String getPatientIntolerance() { return intolerance; }
    public Appointment getAppointment() { return appointment;}
    public ArrayList<TreatmentHistory> getAllPatienttreatmenthistory() { return treatmenthistory; }

    public void setPatientBloodtype(String pBloodtype) { bloodtype = pBloodtype;}
    public void setPatientIntolerance(String pIntolerance) { intolerance = pIntolerance;}
    public void setAppointment(Appointment appoint) { appointment = appoint;}

    public void AddPatientTreatmenthistory(TreatmentHistory pTreatmenthistory) {
        treatmenthistory.add(pTreatmenthistory);
    }

    public static void InsertDA(Patient patient) {
        try {
            PatientDA.Add(patient);
        } catch (Exception e) {
            System.out.println("Insert data patient error");
        }
    }

    public static void initialize() {
        try {
            PatientDA.initialize();
        } catch (EOFException e) {
            System.out.println("No patient data found in the DA file.");
        } catch (Exception e) {
            System.out.println("initialize patient data error");
        }
    }

    public static void terminate() {
        try {
            PatientDA.terminate();
        } catch (Exception e) {
            System.out.println("terminate error");
        }
    }

    
    public static Patient FindPatient(String patiID) throws Exception {
        Patient patient = PatientDA.FindPatient(patiID);
        return patient;
    }
}