package yusril.percobaan4;

import java.util.ArrayList;

public class InputData1841720184Yusril {
    ArrayList<Mahasiswa1841720184Yusril> ListMahasiswa;

    public InputData1841720184Yusril() {
        this.ListMahasiswa = new ArrayList();
    }
    
    public void isiDataYusril(String Nim, String Nama, String Alamat){
        Mahasiswa1841720184Yusril mhs = new Mahasiswa1841720184Yusril(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720184Yusril> getDataYusril(){
        return ListMahasiswa;
    }
    
}
