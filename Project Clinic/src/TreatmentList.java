import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class TreatmentList implements Serializable{
    private ArrayList<Treatment> aTreatments;
    private double priceTotal;

    public TreatmentList(ArrayList<Treatment> aT) {
        aTreatments = aT;
        setTotal();
    }

    public void setTotal() {
        for(int i=0; i<aTreatments.size(); i++) {
            priceTotal += aTreatments.get(i).getPrice();
        }
    }
    public ArrayList<Treatment> getList() { return aTreatments;}
    public double getPrice() { return priceTotal;}

    //Show Treatment List
    public String showList() {
        String formatStr = "";
        formatStr += "เลขที่\tการรักษา\t\t\tราคา\n";
        for(int i=0; i<aTreatments.size(); i++) {
            Treatment treatment = aTreatments.get(i);
            DecimalFormat df = new DecimalFormat("#,###.00");
            formatStr += treatment.getID() + "\t" +
            treatment.getName() + "\t\t\t" +
            df.format(treatment.getPrice()) +  "\n";
        }
        return formatStr;
    }
}
