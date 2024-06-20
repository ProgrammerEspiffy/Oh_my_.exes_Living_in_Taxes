package entities;

public class Individual extends TaxPayer{

    private Double healthExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000){
            return getAnualIncome() * 0.15 - healthExpenses * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenses * 0.5;
        }
    }
}
