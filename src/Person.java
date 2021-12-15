public class Person {
    private String name, address, phone, gender;
    private int age;
    public Person(String aName, int anAge, String anAddress, String aPhone, String aGender) {
        name = aName;
        age = anAge;
        address = anAddress;
        phone = aPhone;
        gender = aGender;
    }

    //Getter Person 
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getGender() { return gender; }

    //Setter Person
    public void setPersonName(String aName) {
        name = aName;
    }
    public void setPersonAge(int anAge) {
        age = anAge;
    }
    public void setPersonAddress(String anAddress) {
        address = anAddress;
    }
    public void setPersonPhone(String aPhone) {
        phone = aPhone;
    }
    public void setPersonGender(String aGender) {
        gender = aGender;
    }
}