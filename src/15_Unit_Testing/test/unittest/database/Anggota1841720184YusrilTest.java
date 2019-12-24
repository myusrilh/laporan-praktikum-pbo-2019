/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class Anggota1841720184YusrilTest {
    Anggota1841720184Yusril instance;
    public Anggota1841720184YusrilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Anggota1841720184Yusril("Yusril", "Gresik", "110");
        System.out.format("Start Testing : %s \n", instance.getNamaYusril());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getNamaYusril());
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        instance.saveYusril();
        ArrayList<Anggota1841720184Yusril> expResult = instance.getByNamaAlamatAndTelepon(instance.getNamaYusril(), instance.getAlamatYusril(), instance.getTeleponYusril());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of searchSultan method, of class Anggota1841720019Sultan.
     */
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Yusril";
        ArrayList<Anggota1841720184Yusril> result = instance.searchYusril(keyword);
        ArrayList<Anggota1841720184Yusril> expResult = instance.getByNamaAlamatAndTelepon(keyword,"","");
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of getIdanggotaYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetIdanggotaYusril() {
//        System.out.println("getIdanggotaYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        int expResult = 0;
//        int result = instance.getIdanggotaYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIdanggotaYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSetIdanggotaYusril() {
//        System.out.println("setIdanggotaYusril");
//        int idanggota = 0;
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.setIdanggotaYusril(idanggota);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNamaYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetNamaYusril() {
//        System.out.println("getNamaYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        String expResult = "";
//        String result = instance.getNamaYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNamaYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSetNamaYusril() {
//        System.out.println("setNamaYusril");
//        String nama = "";
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.setNamaYusril(nama);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAlamatYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetAlamatYusril() {
//        System.out.println("getAlamatYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        String expResult = "";
//        String result = instance.getAlamatYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAlamatYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSetAlamatYusril() {
//        System.out.println("setAlamatYusril");
//        String alamat = "";
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.setAlamatYusril(alamat);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTeleponYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetTeleponYusril() {
//        System.out.println("getTeleponYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        String expResult = "";
//        String result = instance.getTeleponYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTeleponYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSetTeleponYusril() {
//        System.out.println("setTeleponYusril");
//        String telepon = "";
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.setTeleponYusril(telepon);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getByIdYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetByIdYusril() {
//        System.out.println("getByIdYusril");
//        int id = 0;
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        Anggota1841720184Yusril expResult = null;
//        Anggota1841720184Yusril result = instance.getByIdYusril(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testGetAllYusril() {
//        System.out.println("getAllYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        ArrayList<Anggota1841720184Yusril> expResult = null;
//        ArrayList<Anggota1841720184Yusril> result = instance.getAllYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSearchYusril() {
//        System.out.println("searchYusril");
//        String keyword = "";
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        ArrayList<Anggota1841720184Yusril> expResult = null;
//        ArrayList<Anggota1841720184Yusril> result = instance.searchYusril(keyword);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testSaveYusril() {
//        System.out.println("saveYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.saveYusril();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteYusril method, of class Anggota1841720184Yusril.
//     */
//    @Test
//    public void testDeleteYusril() {
//        System.out.println("deleteYusril");
//        Anggota1841720184Yusril instance = new Anggota1841720184Yusril();
//        instance.deleteYusril();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
