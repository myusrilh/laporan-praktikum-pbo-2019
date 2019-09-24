package com.relasiclass.percobaan3;

public class MainPercobaan31841720184Yusril {

    public static void main(String[] args) {
        Pegawai1841720184Yusril masinis = new Pegawai1841720184Yusril("1234","Spongebob Squarepants");
        Pegawai1841720184Yusril asisten = new Pegawai1841720184Yusril("4567","Patrick Star");
        KeretaApi1841720184Yusril keretaApi = new KeretaApi1841720184Yusril("Gaya Baru","Bisnis",masinis,asisten);
        
        System.out.println(keretaApi.infoYusril());
    }
    
}
