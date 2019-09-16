package com.mycompany.motorencapsulation1841720184Yusril;

public class MotorDemo1841720184Yusril {

    public static void main(String[] args) {
//        Instansiasi objek motor
        Motor1841720184Yusril motor = new Motor1841720184Yusril();
        motor.nyalakanMesinYusril();
        int i = 0;
        do {
            motor.tambahKecepatanYusril();
            i++;
            motor.printStatusYusril();
        } while (i < 22);
    }

}
