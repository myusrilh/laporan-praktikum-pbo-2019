package com.relasiclass.percobaan1;

public class Laptop1841720184Yusril {

    private String merk;
    private Processor1841720184Yusril proc;

    public Laptop1841720184Yusril() {
    }

    public Laptop1841720184Yusril(String merk, Processor1841720184Yusril proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerkYusril() {
        return merk;
    }

    public void setMerkYusril(String merk) {
        this.merk = merk;
    }

    public Processor1841720184Yusril getProcYusril() {
        return proc;
    }

    public void setProcYusril(Processor1841720184Yusril proc) {
        this.proc = proc;
    }
    
    public void infoYusril(){
        System.out.println("Merk Laptop = "+merk);
        proc.infoYusril();
    }

}
