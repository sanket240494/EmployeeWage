package com.BridgeLabz;

public class CompanyEmployeeWage {
    private final String company;
    private final int empRatePerHrs;


    public int getEmpRatePerHrs() {
        return empRatePerHrs;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }
    public int getNumberOfWorkingDays(){
        return numOfWorkingDays;
    }

    private final int numOfWorkingDays;
    private final int maxHoursPerMonths;
    private int totalEmpWage;

    public CompanyEmployeeWage(String company, int empRatePerHrs, int numOfWorkingDays, int maxHoursPerMonths) {
        this.company = company;
        this.empRatePerHrs = empRatePerHrs;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonths = maxHoursPerMonths;

    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;

    }

    @Override
    public String toString() {
        return " Total Emp Wage For Company :  " + company + " is : " + totalEmpWage;
    }
}

