package com.BridgeLabz;

public class EmployeeWageuc10 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numofCompany = 0;
    private CompanyEmployeeWage[] companyEmpWageArray;

    public EmployeeWageuc10() {
        companyEmpWageArray = new CompanyEmployeeWage[5];

    }

    private void addCompanyEmpWage(String company, int empRatePerHrs, int numOfWorkingDays, int maxHoursPerMonths) {
        companyEmpWageArray[numofCompany] = new CompanyEmployeeWage(company, empRatePerHrs, numOfWorkingDays, maxHoursPerMonths);
        numofCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numofCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmployeeWage.getNumOfWorkingDays() && totalWorkingDays < companyEmployeeWage.getNumOfWorkingDays()) {
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empcheck) {
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
            System.out.println(" Total Working Days : " + totalWorkingDays + " Total Employee Hours : " + empHrs);
        }
        return totalEmpHrs * companyEmployeeWage.getEmpRatePerHrs();

    }

    public static void main(String[] args) {
        EmployeeWageuc10 employeeWageuc10 = new EmployeeWageuc10();
        employeeWageuc10.addCompanyEmpWage("Ibm", 20, 2, 10);
        employeeWageuc10.addCompanyEmpWage("Reliance", 10, 4, 20);
        employeeWageuc10.computeEmpWage();
    }
}


