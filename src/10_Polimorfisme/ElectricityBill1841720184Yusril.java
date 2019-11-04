package com.polymorphism.prakjs10smt3;

public class ElectricityBill1841720184Yusril extends Employee1841720184Yusril implements Payable1841720184Yusril {

    private int kwh;
    private String category;

    public ElectricityBill1841720184Yusril(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }
    
    
    
    public int getKwhYusril() {
        return kwh;
    }

    public void setKwhYusril(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryYusril() {
        return category;
    }

    public void setCategoryYusril(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountYusril() {
        return kwh * getBasePriceYusril();
    }

    public int getBasePriceYusril() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfoYusril() {
        return "kWH = " + kwh + "\n"+
                "Category = "+category+"("+getBasePriceYusril()+" per kWH)\n";
    }

}
