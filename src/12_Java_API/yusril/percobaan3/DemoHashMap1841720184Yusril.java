package yusril.percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap1841720184Yusril {

    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());

        Collection mCollection = hMapItem.values();
        Iterator mIterator = mCollection.iterator();
        while (mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());

        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from HashMap\n", mObject);
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());

    }

}
