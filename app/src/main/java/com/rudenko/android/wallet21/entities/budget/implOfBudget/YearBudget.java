package com.rudenko.android.wallet21.entities.budget.implOfBudget;





import com.rudenko.android.wallet21.entities.budget.Budget;

import java.util.Date;
import java.util.List;

public class YearBudget extends Budget {

    private Date year;
    private List<MonthBudget> monthBudgets;

    public YearBudget(Date year, List<MonthBudget> monthBudgets) {
        this.year = year;
        this.monthBudgets = monthBudgets;
    }

    public YearBudget(String name, String sumIncome, String sumExpense, String balans, Date year, List<MonthBudget> monthBudgets) {
        super(name, sumIncome, sumExpense, balans);
        this.year = year;
        this.monthBudgets = monthBudgets;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public List<MonthBudget> getMonthBudgets() {
        return monthBudgets;
    }

    public void setMonthBudgets(List<MonthBudget> monthBudgets) {
        this.monthBudgets = monthBudgets;
    }
}
