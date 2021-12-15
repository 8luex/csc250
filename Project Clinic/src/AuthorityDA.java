import java.io.File;
import java.io.FileNotFoundException;
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
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    count = 0;
                }
            }in.close();
        } catch (Exception exception) {
            System.out.println("The system cannot find the file specified");
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
            throw new Exception("ไม่พบรหัสเจ้าหน้าที่ในระบบ");
        }
        return aAu;
    }
}

