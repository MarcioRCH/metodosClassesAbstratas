package entities;

public class Individual extends TaxPayer{

	private Double helthExpenditures;
	
	public Individual() {
		super();
	}
	public Individual(String name, Double anualIncome, Double helthExpenditures) {
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
		double tax = 0.0;
		if(anualIncome < 20000.00) {
			tax = anualIncome * 0.15;
		}else if(anualIncome > 20000.00) {
			tax = anualIncome * 0.25;
		}else if(anualIncome < 20000.00 && helthExpenditures != 0) {
			tax = (anualIncome * 0.15) - (helthExpenditures * 0.50);
		}else if(anualIncome > 20000.00 && helthExpenditures != 0) {
			tax = (anualIncome * 0.25) - (helthExpenditures * 0.50);
		}
		return tax;
	}
}