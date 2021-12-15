/** 
 * Line: 22 - Getter Authority
 * Line: 27 - Setter Authority
 * Line: 35 - Show Info Authority | (toString)
 * Line: 47 - Authority List | (ShowList)
 */

import java.util.Vector;

public class Authority extends Person {
    private String id, position;
    private double salary;
    public Authority(String auId, String auPosition, double auSalary, 
                    String aName, int aAge, String aAddress, 
                    String aPhone, String aGender) {
        super(aName, aAge, aAddress, aPhone, aGender);
        id = auId;
        position = auPosition;
        salary = auSalary;
    }

    //Getter Authority
    public String getAuthorityId() { return id; }
    public String getAuthorityPosition() { return position; }
    public double getAuthoritySalary() { return salary; }

    //Setter Authority
    public void setAuthorityPosition(String auPosition) {
        position = auPosition;
    }
    public void setAuthoritySalary(double auSalary) {
        salary = auSalary;
    }

    //Show Info Authority
    public String toString() {
        String formatStr = "ID: %s\t\t\t Authority Name: %s\t Age: %d\n" +
        "Position: %s\t\t Salary: %.2f.-\n" +
        "Gender: %s\t Address: %s\t Phone: %s\n" +
        "-------------------------------------------------------------------------";

        String AuthorityInfo = String.format(formatStr, getAuthorityId(), getName(), getAge(), getAuthorityPosition(), getAuthoritySalary(), getGender(), getAddress(), getPhone());
        return AuthorityInfo;
    }

    //Authority List
    public static void ShowList() {
        Vector<Authority> AuthorityList = new Vector<Authority>();
        AuthorityList = AuthorityDA.getAll();
        Authority aAuthority = null;

        for(int i=0; i<AuthorityList.size(); i++) {
            aAuthority = AuthorityList.elementAt(i);
            String auId = aAuthority.getAuthorityId();
            String auPosition = aAuthority.getAuthorityPosition();
            double auSalary = aAuthority.getAuthoritySalary();
            String aName = aAuthority.getName();
            int aAge = aAuthority.getAge();
            String aAddress = aAuthority.getAddress();
            String aPhone = aAuthority.getPhone();
            String aGender = aAuthority.getGender();

            String formatStr = "ID: %s\t\t\t Authority Name: %s\t Age: %d\n" +
            "Position: %s\t\t Salary: %.2f.-\n" +
            "Gender: %s\t Address: %s\t Phone: %s\n" +
            "-------------------------------------------------------------------------";
    
            String AuthorityInfo = String.format(formatStr, auId, aName, aAge, auPosition, auSalary, aGender, aAddress, aPhone);
            System.out.println(AuthorityInfo);
        }
    }

}