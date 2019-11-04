package com.polymorphism.tugaszombiejs10;

public class Plant1841720184Yusril {

    public void doDestroyYusril(Destroyable1841720184Yusril d) {
        if (d instanceof WalkingZombie1841720184Yusril) {
            WalkingZombie1841720184Yusril wz = (WalkingZombie1841720184Yusril) d;
            wz.destroyedYusril();
        } else if (d instanceof JumpingZombie1841720184Yusril) {
            JumpingZombie1841720184Yusril jz = (JumpingZombie1841720184Yusril) d;
            jz.destroyedYusril();
        } else if (d instanceof Barrier1841720184Yusril) {
            Barrier1841720184Yusril b = (Barrier1841720184Yusril) d;
            b.destroyYusril();
        }
    }
}
