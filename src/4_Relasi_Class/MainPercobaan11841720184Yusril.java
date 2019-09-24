package com.relasiclass.percobaan1;

public class MainPercobaan11841720184Yusril {

    public static void main(String[] args) {
        Processor1841720184Yusril p = new Processor1841720184Yusril("Intel i5",3);
        Laptop1841720184Yusril L = new Laptop1841720184Yusril("Thinkpad",p);
        
        Processor1841720184Yusril p1 = new Processor1841720184Yusril();
        p1.setMerkYusril("Intel i5");
        p1.setCacheYusril(4);
        Laptop1841720184Yusril L1 = new Laptop1841720184Yusril();
        L1.setMerkYusril("Thinkpad");
        L1.setProcYusril(p1);
        L1.infoYusril();
    }
    
}
