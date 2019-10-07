package com.inheritance_tugas.komputer1841720184yusril;

public class Mac1841720184Yusril extends Laptop1841720184Yusril {

    public String security;

    public Mac1841720184Yusril() {
    }

    public Mac1841720184Yusril(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMacYusril() {
        super.tampilLaptopYusril();
        System.out.println("Security            = " + security);
    }

}
