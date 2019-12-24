package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
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
public class Kategori1841720184YusrilTest extends TestCase {
    Kategori1841720184Yusril instance;
    
    public Kategori1841720184YusrilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720184Yusril("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s \n", this.getName());
    }
    
    @Test
    public void testSave(){
        System.out.println("save Test");
        this.instance.saveYusril();
        ArrayList<Kategori1841720184Yusril> expResult = instance.getByNamaAndKeterangan(instance.getNamaYusril(), instance.getKeteranganYusril());
        assertTrue(expResult.size()>0);
    }
    
    @Test
    public void testSearch(){
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720184Yusril> result = instance.searchYusril(keyword);
        ArrayList<Kategori1841720184Yusril> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of toString method, of class Kategori1841720184Yusril.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIdkategoriYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testSetIdkategoriYusril() {
//        System.out.println("setIdkategoriYusril");
//        int idkategori = 0;
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.setIdkategoriYusril(idkategori);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNamaYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testSetNamaYusril() {
//        System.out.println("setNamaYusril");
//        String nama = "";
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.setNamaYusril(nama);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKeteranganYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testSetKeteranganYusril() {
//        System.out.println("setKeteranganYusril");
//        String keterangan = "";
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.setKeteranganYusril(keterangan);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIdkategoriYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetIdkategoriYusril() {
//        System.out.println("getIdkategoriYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        int expResult = 0;
//        int result = instance.getIdkategoriYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNamaYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetNamaYusril() {
//        System.out.println("getNamaYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        String expResult = "";
//        String result = instance.getNamaYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKeteranganYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetKeteranganYusril() {
//        System.out.println("getKeteranganYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        String expResult = "";
//        String result = instance.getKeteranganYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getByNamaAndKeterangan method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetByNamaAndKeterangan() {
//        System.out.println("getByNamaAndKeterangan");
//        String nama = "";
//        String keterangan = "";
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        ArrayList<Kategori1841720184Yusril> expResult = null;
//        ArrayList<Kategori1841720184Yusril> result = instance.getByNamaAndKeterangan(nama, keterangan);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getByIdYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetByIdYusril() {
//        System.out.println("getByIdYusril");
//        int id = 0;
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        Kategori1841720184Yusril expResult = null;
//        Kategori1841720184Yusril result = instance.getByIdYusril(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testGetAllYusril() {
//        System.out.println("getAllYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        ArrayList<Kategori1841720184Yusril> expResult = null;
//        ArrayList<Kategori1841720184Yusril> result = instance.getAllYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testSearchYusril() {
//        System.out.println("searchYusril");
//        String keyword = "";
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        ArrayList<Kategori1841720184Yusril> expResult = null;
//        ArrayList<Kategori1841720184Yusril> result = instance.searchYusril(keyword);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testSaveYusril() {
//        System.out.println("saveYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.saveYusril();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testDeleteYusril() {
//        System.out.println("deleteYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.deleteYusril();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of messageFormatYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testMessageFormatYusril() {
//        System.out.println("messageFormatYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        String expResult = "";
//        String result = instance.messageFormatYusril();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showMessageYusril method, of class Kategori1841720184Yusril.
//     */
//    @Test
//    public void testShowMessageYusril() {
//        System.out.println("showMessageYusril");
//        Kategori1841720184Yusril instance = new Kategori1841720184Yusril();
//        instance.showMessageYusril();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
