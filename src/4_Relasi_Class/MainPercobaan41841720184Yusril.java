package com.relasiclass.percobaan4;

public class MainPercobaan41841720184Yusril {

    public static void main(String[] args) {
        Penumpang1841720184Yusril p = new Penumpang1841720184Yusril("12345","Mr.Krab");
        Gerbong1841720184Yusril gerbong = new Gerbong1841720184Yusril("A",10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.infoYusril());
    }
    
}
