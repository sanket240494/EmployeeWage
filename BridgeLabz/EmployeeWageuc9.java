package com.BridgeLabz;

public class EmployeeWageuc9 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private String company;
    private int empRatePerHoure;
    private int numOfWorkingDays;
    private int maxHoursPerMonths;
    private int totalEmpWage;

    EmployeeWageuc9(String company, int empRatePerHoure, int numOfWorkingDays, int maxHoursPerMonths) {
        this.company = company;
        this.empRatePerHoure = empRatePerHoure;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonths = maxHoursPerMonths;
    }

    public EmployeeWageuc9() {
    }

    public void computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHoursPerMonths && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 8;
                    break;
                case IS_FULL_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = +empHrs;
            System.out.println("TotalWorking Days : " + totalWorkingDays + " Total Employee Houre : " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHoure;
        System.out.println("Total Employee Wage for Company : " + company + " Is : " + totalEmpWage);
    }

    @Override
    public String toString() {
        return "EmployeeWageuc9 [company = " + company + ", totalEmpWage = " + totalEmpWage + "]";
    }

    public static void main(String[] args) {
        EmployeeWageuc9 Ibm = new EmployeeWageuc9("Ibm", 20, 2, 10);
        EmployeeWageuc9 Reliance = new EmployeeWageuc9("Reliance", 10, 4, 20);
        Ibm.computeEmpWage();
        System.out.println(Ibm);
        Reliance.computeEmpWage();
        System.out.println(Reliance);


    }
}

