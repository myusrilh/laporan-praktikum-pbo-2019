package yusril.percobaan1;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
//import java.util.TreeSet;

public class DemoHashSet1841720184Yusril {

    public static void main(String[] args) {
//        TreeSet mSetCity = new TreeSet<String>(); //mengurutkan sekalian
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");

        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();

        while (mIterator.hasNext()) {
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
