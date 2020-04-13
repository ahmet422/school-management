package schoolManagement;

public class Students {
	private int id;
	private static int studentId=0;
	private String name;
	private double feesPaid=0;
	private final double feesTotal = 30000.00;
	private int count = 0;
	
	
	public Students(String name) {
		this.id = ++studentId;
		this.name = name;
		count++;
	}


	public double getFeesPaid() {
		return feesPaid;
	}


	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}


	public double getFeesTotal() {
		return feesTotal;
	}
	
	public void pay(int amount){
		feesPaid+=amount;
	}


	public int getCount() {
		return count;
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}


	public void setCount(int count) {
		this.count = count;
	}

}
