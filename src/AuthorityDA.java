import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class AuthorityDA {
    static Vector<Authority> authorities;
    public static void initialize() throws FileNotFoundException {
        authorities = new Vector<Authority>();
        String inputFileName = "authoritys.txt";

        try {
            String auId = "";
            String auPosition = "";
            double auSalary = 0;
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
                    case 1: auId = line; break;
                    case 2: aName = line; break;
                    case 3: auPosition = line; break; 
                    case 4: auSalary = Double.parseDouble(line); break;
                    case 5: aAge = Integer.parseInt(line); break;
                    case 6: aGender = line; break;
                    case 7: aPhone = line; break;
                    case 8: aAddress = line; break;
                }
                if (count == 8) {
                    Authority aAu;
                    try {
                        aAu = new Authority(auId, auPosition, auSalary, aName, aAge, aAddress, aPhone, aGender);
                        authorities.addElement(aAu);
                        System.out.println("insert authority data complete...");
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
		System.out.print("Input Authority File : ");
		String outputFileName = console.next();
		try
		{
			String auId = "";
            String auPosition = "";
            double auSalary = 0.0;
            String aName = "";
            int aAge = 0;
            String aAddress = "";
            String aPhone = "";
            String aGender = "";
			PrintWriter out = new PrintWriter(outputFileName);
			for(int i=0; i<authorities.size();i++)
			{	
				Authority aAuthority = (Authority) authorities.elementAt(i);
                auId = aAuthority.getAuthorityId();
                auPosition = aAuthority.getAuthorityPosition();
                auSalary = aAuthority.getAuthoritySalary();
                aName = aAuthority.getName();
                aAge = aAuthority.getAge();
                aAddress = aAuthority.getAddress();
                aPhone = aAuthority.getPhone();
                aGender = aAuthority.getGender();

				String line = auId+" "+aName+" "+auPosition+" "+auSalary+" "+aAge+" "+aGender+" "+aPhone+" "+aAddress;
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

    //getAll Authority
    public static Vector<Authority> getAll() {return authorities;}

    //Find Authority
    public static Authority checkAuthorityId(String authorityID) throws Exception {
        Authority aAu = null;
        boolean foundState = false;
        for(int i=0; i<authorities.size() && !foundState; i++) {
            aAu = authorities.elementAt(i);
            if (authorityID.equals(aAu.getAuthorityId())) {
                foundState = true;
                break;
            }
        }
        if (!foundState) {
            throw new Exception("System not found");
        }
        return aAu;
    }
}

