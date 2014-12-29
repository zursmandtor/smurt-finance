package com.rudenko.android.wallet21.entities.operation;


import java.util.Date;

public class Operation {

    private Date date;
    private TypeOfOperation typeOfOperation;
    private String currency;
    private Double sum;
    private String note;

    public Operation() {
    }

    public Operation(Date date, TypeOfOperation typeOfOperation, String currency, Double sum, String note) {
        this.date = date;
        this.typeOfOperation = typeOfOperation;
        this.currency = currency;
        this.sum = sum;
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeOfOperation getTypeOfOperation() {
        return typeOfOperation;
    }

    public void setTypeOfOperation(TypeOfOperation typeOfOperation) {
        this.typeOfOperation = typeOfOperation;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void makeOperation (){

    }

}
