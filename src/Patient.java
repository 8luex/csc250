import java.util.ArrayList;

public class Patient extends Person {
    private String id, bloodtype, intolerance;
    private ArrayList<String> treatmenthistory;
    public Patient(String pId, String pBloodtype, 
                    String pIntolerance, ArrayList<String> pTreatmenthistory, 
                    String aName, int aAge, String aAddress, 
                    String aPhone, String aGender) {
        super(aName, aAge, aAddress, aPhone, aGender);
        id = pId;
        bloodtype = pBloodtype;
        intolerance = pIntolerance;
        treatmenthistory = pTreatmenthistory;
    }
    public void createNewPatient(String patientID) {}
    public void lookUp(String patientID) {}
    public void checkPatientId(String patientID) {}

    public String getPatientId() { return id; }
    public String getPatientBloodtype() { return bloodtype; }
    public String getPatientIntolerance() { return intolerance; }
    public ArrayList<String> getPatienttreatmenthistory() { return treatmenthistory; }
    public void setPatientBloodtype(String pBloodtype) {
        bloodtype = pBloodtype;
    }
    public void setPatientIntolerance(String pIntolerance) {
        intolerance = pIntolerance;
    }
    public void setPatientTreatmenthistory(ArrayList<String> pTreatmenthistory) {
        treatmenthistory = pTreatmenthistory;
    }
}