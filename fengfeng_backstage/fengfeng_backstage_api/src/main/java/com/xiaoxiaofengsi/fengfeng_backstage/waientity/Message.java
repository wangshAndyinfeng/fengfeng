package com.xiaoxiaofengsi.fengfeng_backstage.waientity;

import java.io.Serializable;

public class Message implements Serializable{
    private String budgetValue;

    public String getBudgetValue() {
        return budgetValue;
    }

    public void setBudgetValue(String budgetValue) {
        this.budgetValue = budgetValue;
    }
}
