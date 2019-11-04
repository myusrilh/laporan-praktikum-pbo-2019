package com.polymorphism.tugaszombiejs10;

public class WalkingZombie1841720184Yusril extends Zombie1841720184Yusril {

    public WalkingZombie1841720184Yusril(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healYusril() {
        double bonus;
        switch (level) {
            case 1:
                bonus = health * 0.2;
                health += bonus;
                break;
            case 2:
                bonus = health * 0.2;
                health += bonus;
                break;
            case 3:
                bonus = health * 0.2;
                health += bonus;
                break;
            default:
                System.out.println("level melebihi batas");
                break;
        }
    }

    @Override
    public void destroyedYusril() {
        double kurang = 0.02 * health;
        health -= kurang;
    }

    @Override
    public String getZombieInfoYusril() {
        String info = "Walking Zombie Data =\n";
        info += "Health = " + health + "\n";
        info += "Level = " + level + "\n";
        return info;
    }

}
