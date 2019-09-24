package com.relasiclass.percobaan1;

/**
 *
 * @author asus
 */
public class Processor1841720184Yusril {

    private String merk;
    private double cache;

    public Processor1841720184Yusril() {
    }

    public Processor1841720184Yusril(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerkYusril() {
        return merk;
    }

    public void setMerkYusril(String merk) {
        this.merk = merk;
    }

    public double getCacheYusril() {
        return cache;
    }

    public void setCacheYusril(double cache) {
        this.cache = cache;
    }
    
    public void infoYusril(){
        System.out.printf("Merk Processor = %s\n",merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

}
