import java.io.Serializable;

public class Medicine implements Serializable{ 
    private String medicineID;
    private String medicineName;
    private double medicinePrice;
    private int amount;
    private double totalPrice;

    public Medicine(String mId, String mName, double mPrice, int mAmount){
      medicineID = mId;
      medicineName = mName;
      medicinePrice = mPrice;
      amount = mAmount;
      setTotalPrice();
    }

    public void setTotalPrice(){
      totalPrice = medicinePrice * amount;
    }

    public String getID() { return medicineID;}
    public String getName() { return medicineName;}
    public double getPrice() { return medicinePrice;}
    public int getAmount() { return amount;}
    public double getTotalPrice() { return totalPrice;}
  }