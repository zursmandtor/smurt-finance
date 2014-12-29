package com.rudenko.android.wallet21.entities.budget;

/**
 * Create entity Budget
 */
public class Budget {

	private String name;
    private String sumIncome;
    private String sumExpense;
    private String balans;

    public Budget() {
    }

    public Budget(String name, String sumIncome, String sumExpense, String balans) {
		this.name = name;
		this.sumIncome = sumIncome;
		this.sumExpense = sumExpense;
		this.balans = balans;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSumIncome() {
        return sumIncome;
    }

    public void setSumIncome(String sumIncome) {
        this.sumIncome = sumIncome;
    }

    public String getSumExpense() {
        return sumExpense;
    }

    public void setSumExpense(String sumExpense) {
        this.sumExpense = sumExpense;
    }

    public String getBalans() {
        return balans;
    }

    public void setBalans(String balans) {
        this.balans = balans;
    }
}
