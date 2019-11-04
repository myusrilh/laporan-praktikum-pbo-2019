package com.polymorphism.tugaszombiejs10;

public class Tester1841720184Yusril {

    public static void main(String[] args) {
        WalkingZombie1841720184Yusril wz = new WalkingZombie1841720184Yusril(100, 1);
        JumpingZombie1841720184Yusril jz = new JumpingZombie1841720184Yusril(100, 2);
        Barrier1841720184Yusril b = new Barrier1841720184Yusril(100);
        Plant1841720184Yusril p = new Plant1841720184Yusril();
        System.out.println("" + wz.getZombieInfoYusril());
        System.out.println("" + jz.getZombieInfoYusril());
        System.out.println("" + b.getBarrierInfoYusril());
        System.out.println("------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroyYusril(wz);
            p.doDestroyYusril(jz);
            p.doDestroyYusril(b);
        }
        System.out.println("" + wz.getZombieInfoYusril());
        System.out.println("" + jz.getZombieInfoYusril());
        System.out.println("" + b.getBarrierInfoYusril());
    }

}
