package com.polymorphism.prakjs10smt3;

public class Owner1841720184Yusril {

    public void payYusril(Payable1841720184Yusril p) {
        System.out.println("Total Payment = " + p.getPaymentAmountYusril());
        if (p instanceof ElectricityBill1841720184Yusril) {
            ElectricityBill1841720184Yusril eb = (ElectricityBill1841720184Yusril) p;
            System.out.println("" + eb.getBillInfoYusril());
        } else if (p instanceof PermanentEmployee1841720184Yusril) {
            PermanentEmployee1841720184Yusril pe = (PermanentEmployee1841720184Yusril) p;
            pe.getEmployeeInfoYusril();
            System.out.println("" + pe.getEmployeeInfoYusril());
        }
    }

    public void showMyEmployeeYusril(Employee1841720184Yusril e) {
        System.out.println("" + e.getEmployeeInfoYusril());
        if (e instanceof PermanentEmployee1841720184Yusril) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}
