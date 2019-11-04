package com.polymorphism.prakjs10smt3;

public class InternshipEmployee1841720184Yusril extends Employee1841720184Yusril {

    private int length;

    public InternshipEmployee1841720184Yusril(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthYusril() {
        return length;
    }

    public void setLengthYusril(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfoYusril() {
        String info = super.getEmployeeInfoYusril() + "\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
