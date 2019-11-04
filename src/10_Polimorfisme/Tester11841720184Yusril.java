package com.polymorphism.prakjs10smt3;

public class Tester11841720184Yusril {

    public static void main(String[] args) {
        PermanentEmployee1841720184Yusril pEmp = new PermanentEmployee1841720184Yusril("Dedik", 500);
        InternshipEmployee1841720184Yusril iEmp = new InternshipEmployee1841720184Yusril("Sunarto", 5);
        ElectricityBill1841720184Yusril eBill = new ElectricityBill1841720184Yusril(5, "A-1");
        Employee1841720184Yusril e;
        Payable1841720184Yusril p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;

    }

}
