package com.mycompany.motorencapsulation1841720184Yusril;

public class Motor1841720184Yusril {

//atribut class motor1841720184Yusril
    private int kecepatan = 0;
    private boolean kontakOn = false;

    //method untuk menyalakan mesin yaitu membuat kontakOn menjadi true
    public void nyalakanMesinYusril() {
        kontakOn = true;
    }

    //method untuk mematikan mesin yaitu membuat kontakOn menjadi false
    public void matikanMesinYusril() {
        kontakOn = false;
        kecepatan = 0;
    }

    //method untuk menambah nilai kecepatan
    public void tambahKecepatanYusril() {
        if (kontakOn == true) {
            if (kecepatan <= 100 && kecepatan >= 0) {
                kecepatan += 5;
            } else {
                System.out.println("Anda sudah melewati kecepatan 100. Jangan ngebut, nanti benjut!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off");
        }
    }

    //method untuk mengurangi nilai kecepatan
    public void kurangiKecepatanYusril() {
        if (kontakOn == true) {
            if (kecepatan > 0) {
                kecepatan -= 5;
            } else {
                System.out.println("Kendaraan anda sudah berhenti, keceptan tidak bisa kurangi lagi!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off");
        }
    }

    //method untuk menampilkan data
    public void printStatusYusril() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan);
    }
}
