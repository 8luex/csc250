import java.io.Serializable;
import java.util.Date;

public class TreatmentHistory implements Serializable{
    private String historyID;
    private Patient patient;
    private Date date;
    private Doctor doctor;
    private String symptom;
    private TreatmentList treatmentList;
    private Prescription prescription;
    private PaymentSlip paymentSlip;

    public TreatmentHistory(String hID, Patient pati, Doctor doc, String sDetail){
        historyID = hID;
        patient = pati;
        doctor = doc;
        date = new Date();
        symptom = sDetail;
        treatmentList = null;
        prescription = null;
        paymentSlip = null;
    }

    public String getID() { return historyID;}
    public Patient getPatient() { return patient;} 
    public Date getDate() { return date;}
    public Doctor getDoctor() { return doctor;}
    public String getSymptom() { return symptom;}
    public TreatmentList getTreatmentList() { return treatmentList;}
    public Prescription getPrescription() { return prescription;}
    public PaymentSlip getPaymentSlip() { return paymentSlip;}

    public void setSymptom(String detail) { symptom = detail;}
    public void setTreatmentList(TreatmentList tl) { treatmentList = tl;}
    public void setPrescription(Prescription pre) { prescription = pre; System.out.println("Add prescription complete");}
    public void setPaymentSlip(PaymentSlip slip) { paymentSlip = slip; System.out.println("Add payment complete");}
}