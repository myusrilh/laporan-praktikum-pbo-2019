package com.polymorphism.tugaszombiejs10;

public class Barrier1841720184Yusril implements Destroyable1841720184Yusril {

    int strength;

    public Barrier1841720184Yusril(int strength) {
        this.strength = strength;
    }

    public int getStrengthYusril() {
        return strength;
    }

    public void setStrengthYusril(int strength) {
        this.strength = strength;
    }
    
    public void destroyYusril(){
        destroyedYusril();
    }
    
    @Override
    public void destroyedYusril() {
        strength -= 9;
    }

    public String getBarrierInfoYusril() {
        return "Barrier Strength = " + strength;
    }

}
