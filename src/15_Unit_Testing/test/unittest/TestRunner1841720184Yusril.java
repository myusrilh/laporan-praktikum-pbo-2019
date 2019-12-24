package unittest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Anggota1841720184YusrilTest;
import unittest.database.Kategori1841720184YusrilTest;

public class TestRunner1841720184Yusril {

    public static void main(String[] args) {
        Result mResult =  new JUnitCore().runClasses(MessageProcessorTest1841720184Yusril.class);
        showMessageResultYusril(mResult, MessageProcessorTest1841720184Yusril.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Kategori1841720184YusrilTest.class);
        showMessageResultYusril(mResult, Kategori1841720184YusrilTest.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Anggota1841720184YusrilTest.class);
        showMessageResultYusril(mResult, Anggota1841720184YusrilTest.class.getSimpleName());
    }
    
    public static void showMessageResultYusril(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for (Failure failure: mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
    
}
