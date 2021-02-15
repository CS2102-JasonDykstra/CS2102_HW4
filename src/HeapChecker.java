public class HeapChecker {

    public HeapChecker(){}

    //addEltTester: consumes an original heap, an integer, and an expected binary tree after the merge
    //              then returns true if the merge between the original heap and an integer is the same as the expected tree.
    public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {

        return (hAdded.isHeap() && hAdded.containsAfterAdd(hOrig, elt));
    }

    //remMinEltTester: consumes an original heap and an expected binary tree after the removal of the minimum node
    //                 then returns true the resulting merge after the removal in original heap is the same as the expected tree.
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {

        if (hOrig.equals(new MtHeap()) && hRemoved.equals(new MtHeap())){
            return true;
        }
        return (hRemoved.isHeap() && hRemoved.containsAfterRem(hOrig));
    }


}
