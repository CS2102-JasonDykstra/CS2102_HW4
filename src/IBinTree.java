import java.lang.Math;
import java.util.ArrayList;

public interface IBinTree {
 // determines whether element is in the tree
 boolean hasElt(int e);
 // returns number of nodes in the tree; counts duplicate elements as separate items
 int size();
 // returns depth of longest branch in the tree
 int height();

 //-----------------------------------------Added Code----------------------------------------------

 IBinTree getLeftChild();

 IBinTree getRightChild();

 int getData();

 boolean isHeap();

 boolean containsAfterAdd(IHeap heap, int elt);

 boolean containsAfterRem(IHeap heap);

 public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2);

 boolean equals(IBinTree heap);

}

