package entities;

public class Company extends TaxPayer{

	private Double numberOfEmployees;
	
	public Company() {
		super();
	}
	public Company(String name, Double anualIncome, Double numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	public Double getHelthExpenditures() {
		return numberOfEmployees;
	}
	public void setHelthExpenditures(Double numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public Double tax() {
		double tax = 0.0;
		if(numberOfEmployees > 10) {
			tax = anualIncome * 0.14;
		}else {
			tax = anualIncome * 0.16;
		}
		return tax;
	}
}