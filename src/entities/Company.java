package entities;

public class Company extends TaxPayer{

	private Double helthExpenditures;
	
	public Company() {
		super();
	}
	public Company(String name, Double anualIncome, Double helthExpenditures) {
		super(name, anualIncome);
		this.helthExpenditures = helthExpenditures;
	}
	public Double getHelthExpenditures() {
		return helthExpenditures;
	}
	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}
	@Override
	public Double tax() {
		return null;
	}
}