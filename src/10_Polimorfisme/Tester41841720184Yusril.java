package com.polymorphism.prakjs10smt3;

public class Tester41841720184Yusril {

    public static void main(String[] args) {
        Owner1841720184Yusril ow = new Owner1841720184Yusril();
        ElectricityBill1841720184Yusril eBill = new ElectricityBill1841720184Yusril(5, "R-1");
        ow.payYusril(eBill);
        System.out.println("-----------------------------------");
        
        PermanentEmployee1841720184Yusril pEmp = new PermanentEmployee1841720184Yusril("Dedik", 500);
        ow.payYusril(pEmp);
        System.out.println("-----------------------------------");
        
        InternshipEmployee1841720184Yusril iEmp = new InternshipEmployee1841720184Yusril("Sunarto", 5);
        ow.showMyEmployeeYusril(pEmp);
        System.out.println("-----------------------------------");
        ow.showMyEmployeeYusril(iEmp);
    }
    
}
