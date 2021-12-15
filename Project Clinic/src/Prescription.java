import java.io.Serializable;
import java.util.ArrayList;

public class Prescription implements Serializable{
    private ArrayList<Medicine> medicineList;
    private int amount;
    private double Total;

    public Prescription(ArrayList<Medicine> mList) {
        medicineList = mList;
        amount = mList.size();
        SetTotal();
    }

    public void SetTotal() {
        Total = 0;
        for(int i=0; i<medicineList.size(); i++) {
            Total += medicineList.get(i).getTotalPrice();
        }
    }

    public ArrayList<Medicine> getMedicineList() { return medicineList;}
    public int getAmount() { return amount;}
    public double getTotal() { return Total;}

    public String showList() {
        String medicineInfo = "";
        
        for(int i=0; i<medicineList.size(); i++) {
            String mId = medicineList.get(i).getID();
            String mName = medicineList.get(i).getName();
            double mPrice = medicineList.get(i).getPrice();
            int mAmount = medicineList.get(i).getAmount();
            double mTotal = medicineList.get(i).getTotalPrice();
            String formatStr = "%s \t%s \t%.2f \t%d \t%,.2f\n";
            medicineInfo += String.format(formatStr, mId, mName, mPrice, mAmount, mTotal);
        }
        medicineInfo += String.format("Total: \t\t\t\t%,.2f \n", Total);
        return medicineInfo;
    }
}