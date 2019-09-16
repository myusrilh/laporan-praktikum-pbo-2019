package com.mycompany.tugasjobsheet3smt3;

public class EncapDemo1841720184Yusril {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge <= 30 && newAge >= 18) {
            if (newAge > 30) {
                age = 30;
            } else {
                age = newAge;
            }
        } else if (newAge > 0 && newAge < 18) {
            System.out.println("Umur anda saat ini berada dibawah batas umur!");
        } else if (newAge > 30) {
            System.out.println("Umur anda sudah melebihi batas!");
        } else {
            System.out.println("Maaf inputan anda salah!");
        }
    }

}
