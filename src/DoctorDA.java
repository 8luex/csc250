import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class DoctorDA {
    static Vector<Doctor> doctors;
    public static void initialize() throws FileNotFoundException {
        doctors = new Vector<Doctor>();
        String inputFileName = "doctors.txt";

        try {
            String dId = "";
            String dSpecialty = "";
            double dSalary = 0;
            String aName = "";
            int aAge = 0;
            String aAddress = "";
            String aPhone = "";
            String aGender = "";

            File inputFile = new File(inputFileName);
			Scanner in = new Scanner(inputFile);
            int count = 0;

            while(in.hasNext()) {
                count++;
                String line = in.next();
                switch (count) {
                    case 1: dId = line; break;
                    case 2: dSpecialty = line; break;
                    case 3: dSalary = Double.parseDouble(line); break;
                    case 4: aName = line; break;
                    case 5: aAge = Integer.parseInt(line); break;
                    case 6: aAddress = line; break;
                    case 7: aPhone = line; break;
                    case 8: aGender = line; break;
                }
                if (count == 8) {
                    Doctor aDoc;
                    try {
                        aDoc = new Doctor(dId, dSpecialty, dSalary, aName, aAge, aAddress, aPhone, aGender);
                        doctors.addElement(aDoc);
                        System.out.println("insert doctor data complete...");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    count = 0;
                }
            }in.close();
            System.out.println("-------------------------------------------------------------------------");
        } catch (Exception exception) {
            System.out.println("The system cannot find the file specified");
        }
    }
    public static void terminate()throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Input Doctor File : ");
		String outputFileName = console.next();
		try
		{
			String dId = "";
            String dSpecialty = "";
            double dSalary = 0.0;
            String aName = "";
            int aAge = 0;
            String aAddress = "";
            String aPhone = "";
            String aGender = "";
			PrintWriter out = new PrintWriter(outputFileName);
			for(int i=0; i<doctors.size();i++)
			{	
				Doctor aDoctor = (Doctor) doctors.elementAt(i);
                dId = aDoctor.getDoctorId();
                dSpecialty = aDoctor.getDoctorSpecialty();
                dSalary = aDoctor.getDoctorSalary();
                aName = aDoctor.getName();
                aAge = aDoctor.getAge();
                aAddress = aDoctor.getAddress();
                aPhone = aDoctor.getPhone();
                aGender = aDoctor.getGender();

				String line = dId+" "+dSpecialty+" "+dSalary+" "+aName+" "+aAge+" "+aAddress+" "+aPhone+" "+aGender;
				try
					{
						out.println(line);
					}
				catch (Exception e)
					{
						System.out.println(e);
					}
			}
			out.close();
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("Could not open file");
		} 	
	}

    //getAll Doctor
    public static Vector<Doctor> getAll() {return doctors;}

    //Find Doctor
    public static Doctor checkDoctorId(String doctorID) throws Exception {
        Doctor aDoctor = null;
        boolean foundState = false;
        for(int i=0; i<doctors.size() && !foundState; i++) {
            aDoctor = doctors.elementAt(i);
            if (doctorID.equals(aDoctor.getDoctorId())) {
                foundState = true;
                break;
            }
        }
        if (!foundState) {
            throw new Exception("System not found");
        }
        return aDoctor;
    }
}
