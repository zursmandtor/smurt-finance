package com.rudenko.android.wallet21.entities.budget.implOfBudget;



import com.rudenko.android.wallet21.entities.budget.Budget;
import com.rudenko.android.wallet21.entities.operation.Operation;

import java.util.Date;
import java.util.List;


public class DayBudget extends Budget {

    private List<Operation> listOfDailyOperations;
    private Date dateOfDayBudget;

    public DayBudget(List<Operation> listOfDailyOperations, Date dateOfDayBudget) {
        this.listOfDailyOperations = listOfDailyOperations;
        this.dateOfDayBudget = dateOfDayBudget;
    }

    public DayBudget(String name, String sumIncome, String sumExpense, String balans, List<Operation> listOfDailyOperations) {
        super(name, sumIncome, sumExpense, balans);
        this.listOfDailyOperations = listOfDailyOperations;
    }

    public List<Operation> getListOfDailyOperations() {
        return listOfDailyOperations;
    }

    public void setListOfDailyOperations(List<Operation> listOfDailyOperations) {
        this.listOfDailyOperations = listOfDailyOperations;
    }

    public Date getDateOfDayBudget() {
        return dateOfDayBudget;
    }

    public void setDateOfDayBudget(Date dateOfDayBudget) {
        this.dateOfDayBudget = dateOfDayBudget;
    }
}
