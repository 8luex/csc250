import java.io.Serializable;

public class Treatment implements Serializable{
    private String treatmeantID;
    private String treatmeantName;
    private double price;

    public Treatment(String tId, String tName, double tPrice){
        treatmeantID = tId;
        treatmeantName = tName;
        price = tPrice;
    }

    public String getID() { return treatmeantID;}
    public String getName() { return treatmeantName;}
    public double getPrice() { return price;}

    public void setID(String tId) { treatmeantID = tId;}
    public void setName(String tName) { treatmeantName = tName;}
    public void setPrice(double tPrice) { price = tPrice;}
}
