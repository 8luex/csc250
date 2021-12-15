import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class PatientDA {
    static Vector<Patient> patients = new Vector<>();
    static String FileName = "patinets.txt";

    // Insert Data - ObjectInputStream
    public static void initialize()throws Exception 
    {   patients = new Vector<>();
        FileInputStream inputFile = new FileInputStream(FileName);
        ObjectInputStream in = new ObjectInputStream(inputFile);
        try { 
            for (;;) {
                Patient input = (Patient) in.readObject();
                patients.addElement(input);
            }
        }
        catch (EOFException exc) { in.close(); }
        catch (IOException exc) { exc.printStackTrace();}
    }

    // Sava Data - ObjectOutputStream
    public static void terminate() throws Exception 
    {
        try {
            FileOutputStream outputFile = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(outputFile);
            
            for(int i=0; i<patients.size(); i++) {
                out.writeObject(patients.elementAt(i));
            }
            out.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("terminate patient complete.");
    }

    // Add Prescription
    public static void Add(Patient patient) {
        patients.addElement(patient);
        System.out.println("Insert patient complete.");
    }

    // Get all Prescription
    public static Vector<Patient> getAll(){
        return patients;
    }

    // Find Patient
    public static Patient FindPatient(String patiID) throws Exception {
        Patient patient = null;
        boolean foundit = false;

        for(int i=0; i<patients.size(); i++)
        {
            patient = (Patient) patients.elementAt(i);
            if (patiID.equals(patient.getPatientId())) {
                foundit = true;
                break;
            }
        } 
        if (!foundit) 
            throw new Exception("This ID not found");
        else {
            return patient;}
    }
}
