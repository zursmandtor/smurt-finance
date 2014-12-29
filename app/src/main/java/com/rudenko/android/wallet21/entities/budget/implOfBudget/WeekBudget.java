package com.rudenko.android.wallet21.entities.budget.implOfBudget;



import com.rudenko.android.wallet21.entities.budget.Budget;

import java.util.List;

public class WeekBudget extends Budget {

    private List<DayBudget> listOfDayBudgets;

    public WeekBudget(List<DayBudget> listOfDayBudgets) {
        this.listOfDayBudgets = listOfDayBudgets;
    }

    public WeekBudget(String name, String sumIncome, String sumExpense, String balans, List<DayBudget> listOfDayBudgets) {
        super(name, sumIncome, sumExpense, balans);
        this.listOfDayBudgets = listOfDayBudgets;
    }

    public List<DayBudget> getListOfDayBudgets() {
        return listOfDayBudgets;
    }

    public void setListOfDayBudgets(List<DayBudget> listOfDayBudgets) {
        this.listOfDayBudgets = listOfDayBudgets;
    }
}
