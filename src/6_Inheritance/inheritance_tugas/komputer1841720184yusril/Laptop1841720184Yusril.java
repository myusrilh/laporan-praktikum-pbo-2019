package com.inheritance_tugas.komputer1841720184yusril;

public class Laptop1841720184Yusril extends Komputer1841720184Yusril {

    public String jnsBatrei;

    public Laptop1841720184Yusril() {
    }

    public Laptop1841720184Yusril(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptopYusril() {
        super.tampilDataYusril();
        System.out.println("Jenis Baterai       = " + jnsBatrei);
    }
}
