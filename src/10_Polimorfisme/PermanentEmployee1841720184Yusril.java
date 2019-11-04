package com.polymorphism.prakjs10smt3;

public class PermanentEmployee1841720184Yusril extends Employee1841720184Yusril implements Payable1841720184Yusril {

    private int salary;

    public PermanentEmployee1841720184Yusril(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalaryYusril() {
        return salary;
    }

    public void setSalaryYusril(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountYusril() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfoYusril() {
        String info = super.getEmployeeInfoYusril() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
