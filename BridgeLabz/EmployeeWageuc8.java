package com.BridgeLabz;

public class EmployeeWageuc8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
            totalEmpHrs += empHrs;
            System.out.println("TotalWorking Days : " + totalWorkingDays + " Total Employee Houre : " + empHrs);

        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee Wage for Company : " + company +  " Is : " + totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {
        computeEmpWage("IBM", 20, 14, 100);
        computeEmpWage("RELIANCE", 20, 14, 100);
    }
}
