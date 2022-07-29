package com.BridgeLabz;

public class EmployeeWageuc1 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee Is Present");
        else
            System.out.println("Employee Is Absent");


    }

}
