import java.io.Serializable;
import java.util.Date;

public class PaymentSlip implements Serializable{
	private Date invoiceDate;
	private double total;
	private Prescription prescription;
	private TreatmentList treatmentList;

	public PaymentSlip(TreatmentList tl, Prescription pst){
		invoiceDate = new Date();
		treatmentList = tl;
		prescription = pst;
		total = tl.getPrice() + pst.getTotal();
	}


	public void setInvoiceDate(Date invoiceDate){
		this.invoiceDate = invoiceDate;
	}
	public void setAllMoney(double allMoney){
		this.total = allMoney;
	}

	public Date getInvoiceDate(){return this.invoiceDate;}
	public double getAllMoney(){return this.total;}
}