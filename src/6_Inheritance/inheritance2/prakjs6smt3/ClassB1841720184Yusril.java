package com.inheritance2.prakjs6smt3;

public class ClassB1841720184Yusril extends ClassA1841720184Yusril {

    private int z;
    
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void setXBaruYusril(int x){
        super.setXYusril(x);
    }
    public void setYBaruYusril(int y){
        super.setYYusril(y);
    }
    
    public void getNilaiZYusril() {
        System.out.println("nilai Z: " + z);
    }
    
    public void getJumlahYusril(){
        super.getNilaiYusril();
        System.out.println("jumlah: "+(super.getXYusril()+super.getYYusril()+z));
    }
}
