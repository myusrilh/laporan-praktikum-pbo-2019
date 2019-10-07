package com.inheritance_tugas.komputer1841720184yusril;

public class Windows1841720184Yusril extends Laptop1841720184Yusril {

    public String fitur;

    public Windows1841720184Yusril() {
    }

    public Windows1841720184Yusril(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindowsYusril() {
        super.tampilLaptopYusril();
        System.out.println("Fitur               = " + fitur);
    }

}
