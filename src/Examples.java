import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class Examples {

    public Examples() {
        HOriginal = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HDuplicate = new DataHeap(2,
                new DataHeap(2,
                        new DataHeap(4,
                                new MtHeap(),
                                new DataHeap(8)),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HValue = new DataHeap(27);


        HNegative = new DataHeap(-27,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HEmpty = new MtHeap();


        HAdded = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(19),
                                new MtHeap())));


        HAdded2 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(7,
                                new DataHeap(12),
                                new MtHeap()),
                        new DataHeap(14)));


        HAdded3 = new DataHeap(1,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HAdded4 = new DataHeap(-10,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HAdded5 = new DataHeap(2,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HAdded6 = new DataHeap(27);


        HInvalidHeap1 = new DataHeap(27,
                new DataHeap(4,
                        new DataHeap(2),
                        new DataHeap(10)),
                new DataHeap(14,
                        new DataHeap(16),
                        new DataHeap(12,
                                new DataHeap(8),
                                new MtHeap())));


        HAddTooMany = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(27),
                                new DataHeap(27,
                                        new DataHeap(27),
                                        new DataHeap(27)))));


        HEltTooMany1 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(14),
                                new DataHeap(14,
                                        new DataHeap(27),
                                        new MtHeap()))));


        HWrongTotal1 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(27)));


        HRemoved = new DataHeap(4,
                new DataHeap(8,
                        new MtHeap(),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HRemoved2 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HRemoved3 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HThrowFalse = new DataHeap(9,
                new DataHeap(99,
                        new DataHeap(999,
                                new DataHeap(9999,
                                        new DataHeap(9999),
                                        new MtHeap()),
                                new MtHeap()),
                        new MtHeap()),
                new MtHeap());


        HInvalidHeap2 = new DataHeap(4,
                new DataHeap(10,
                        new DataHeap(8),
                        new MtHeap()),
                new DataHeap(12,
                        new DataHeap(6,
                                new DataHeap(14),
                                new MtHeap()),
                        new MtHeap()));


        HRemoveTooMany = new DataHeap(8,
                new DataHeap(10,
                        new DataHeap(12),
                        new DataHeap(14)),
                new DataHeap(6,
                        new DataHeap(12),
                        new MtHeap()));


        HEltTooMany2 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new DataHeap(14)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(14),
                                new MtHeap())));


        HWrongTotal2 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new MtHeap()));


        testCompareList1.add(1);
        testCompareList1.add(2);
        testCompareList1.add(3);


        testCompareList2.add(2);
        testCompareList2.add(3);
        testCompareList2.add(1);


        testCompareList3.add(1);
        testCompareList3.add(2);
        testCompareList3.add(5);


        testCompareList4.add(1);
        testCompareList4.add(2);
    }


    HeapChecker HC = new HeapChecker();
    IHeap HOriginal;
    IHeap HDuplicate;
    IHeap HValue;
    IHeap HNegative;
    IHeap HEmpty;
    IBinTree HAdded;
    IBinTree HAdded2;
    IBinTree HAdded3;
    IBinTree HAdded4;
    IBinTree HAdded5;
    IBinTree HAdded6;
    IBinTree HInvalidHeap1;
    IBinTree HAddTooMany;
    IBinTree HEltTooMany1;
    IBinTree HWrongTotal1;
    IBinTree HRemoved;
    IBinTree HRemoved2;
    IBinTree HRemoved3;
    IBinTree HThrowFalse;
    IBinTree HInvalidHeap2;
    IBinTree HRemoveTooMany;
    IBinTree HEltTooMany2;
    IBinTree HWrongTotal2;
    DataBT testDataBT = new DataBT(1);
    TreeData testTreeData = new TreeData();

    ArrayList<Integer> testCompareList1 = new ArrayList<>();
    ArrayList<Integer> testCompareList2 = new ArrayList<>();
    ArrayList<Integer> testCompareList3 = new ArrayList<>();
    ArrayList<Integer> testCompareList4 = new ArrayList<>();

    ArrayList<Integer> HOriginalList = new ArrayList<>();


    @Test
    public void testCompareListsTrue(){
        assertTrue(testDataBT.compareLists(testCompareList1, testCompareList2));
    }

    @Test
    public void testCompareListsNotSameElements(){
        assertFalse(testDataBT.compareLists(testCompareList1, testCompareList3));
    }

    @Test
    public void testCompareListsNotSameSize(){
        assertFalse(testDataBT.compareLists(testCompareList1, testCompareList4));
    }

    @Test
    public void testEqualsTrue(){
        MtHeap testMtHeap = new MtHeap();
        assertTrue(testMtHeap.equals(new MtHeap()));
    }

    @Test
    public void testAddEltTesterAddEnd(){
        assertTrue(HC.addEltTester(HOriginal, 19, HAdded));
    }

    @Test
    public void testAddEltTesterAddMiddle(){
        assertTrue(HC.addEltTester(HOriginal, 7, HAdded2));
    }

    @Test
    public void testAddEltTesterAddBeginning(){
        assertTrue(HC.addEltTester(HOriginal, 1, HAdded3));
    }

    @Test
    public void testAddEltTesterAddNegative(){
        assertTrue(HC.addEltTester(HOriginal, -10, HAdded4));
    }

    @Test
    public void testAddEltTesterAddDuplicate(){
        assertTrue(HC.addEltTester(HOriginal, 2, HAdded5));
    }

    @Test
    public void testAddEltTesterAddOnEmpty(){
        assertTrue(HC.addEltTester(HEmpty, 27, HAdded6));
    }

    @Test
    public void testAddEltTesterAddOnEmpty2(){
        assertFalse(HC.addEltTester(HEmpty, 27, HEmpty));
    }

    @Test
    public void testAddEltTesterThrowFalse(){
        assertFalse(HC.addEltTester(HOriginal, 27, HThrowFalse));
    }

    @Test
    public void testAddEltTesterInvalidHeap(){
        assertFalse(HC.addEltTester(HOriginal, 27, HInvalidHeap1));
    }

    @Test
    public void testAddEltTesterAddedTooMany(){
        assertFalse(HC.addEltTester(HOriginal, 27, HAddTooMany));
    }

    @Test
    public void testAddEltTesterEltTooMany(){
        assertFalse(HC.addEltTester(HOriginal, 27, HEltTooMany1));
    }

    @Test
    public void testAddEltTesterWrongTotal(){
        assertFalse(HC.addEltTester(HOriginal, 27, HWrongTotal1));
    }

    @Test
    public void testRemMinEltTesterNormalRemoval(){
        assertTrue(HC.remMinEltTester(HOriginal, HRemoved));
    }

    @Test
    public void testRemMinEltTesterRemoveDuplicate(){
        assertTrue(HC.remMinEltTester(HDuplicate, HRemoved2));
    }

    @Test
    public void testRemMinEltTesterRemoveNegative(){
        assertTrue(HC.remMinEltTester(HNegative, HRemoved3));
    }

    @Test
    public void testRemMinEltTesterRemoveOneValue(){
        assertTrue(HC.remMinEltTester(HValue, HEmpty));
    }

    @Test
    public void testRemMinEltTesterRemoveEmpty(){
        assertTrue(HC.remMinEltTester(HEmpty, HEmpty));
    }

    @Test
    public void testRemMinEltTesterRemoveEmpty2(){
        assertFalse(HC.remMinEltTester(HEmpty, HThrowFalse));
    }

    @Test
    public void testRemMinEltTesterThrowFalse(){
        assertFalse(HC.remMinEltTester(HOriginal, HThrowFalse));
    }

    @Test
    public void testRemMinEltTesterInvalidHeap(){
        assertFalse(HC.remMinEltTester(HOriginal, HInvalidHeap2));
    }

    @Test
    public void testRemMinEltTesterAddedTooMany(){
        assertFalse(HC.remMinEltTester(HOriginal, HRemoveTooMany));
    }

    @Test
    public void testRemMinEltTesterEltTooMany(){
        assertFalse(HC.remMinEltTester(HOriginal, HEltTooMany2));
    }

    @Test
    public void testRemMinEltTesterWrongTotal(){
        assertFalse(HC.remMinEltTester(HOriginal, HWrongTotal2));
    }

}