package com.rudenko.android.wallet21.entities.budget.implOfBudget;




import com.rudenko.android.wallet21.entities.budget.Budget;

import java.util.Date;
import java.util.List;


public class MonthBudget extends Budget {

    private Date month;
    private List<DayBudget> listDayBudgets;

    public MonthBudget(Date month, List<DayBudget> listDayBudgets) {
        this.month = month;
        this.listDayBudgets = listDayBudgets;
    }

    public MonthBudget(String name, String sumIncome, String sumExpense, String balans, Date month, List<DayBudget> listDayBudgets) {
        super(name, sumIncome, sumExpense, balans);
        this.month = month;
        this.listDayBudgets = listDayBudgets;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public List<DayBudget> getListDayBudgets() {
        return listDayBudgets;
    }

    public void setListDayBudgets(List<DayBudget> listDayBudgets) {
        this.listDayBudgets = listDayBudgets;
    }
}
