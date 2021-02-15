public class MtHeap extends MtBT implements IHeap {
 MtHeap(){}

 @Override
 // If you add an element to a MtHeap, you create a new DataHeap
 public IHeap addElt(int e) {
  return new DataHeap(e, new MtHeap(), new MtHeap());
 }

 @Override
 // The min element of an empty heap returns an empty heap.
 public IHeap remMinElt() {
  return new MtHeap();
 }

 @Override
 // An empty heap should always lose a competition for which root is smaller (for the merge function)
 public boolean isBigger(int e) {
  return true;
 }

 @Override
 // An empty heap merged with another heap is the other heap (identity).
 public IHeap merge(IHeap withHeap) {
  return withHeap;
 }

 //-----------------------------------------Added Code----------------------------------------------

 //getLeftChild: consumes a IHeap return the left child tree.
 //              returns null since empty tree does not have a left child.
 public IHeap getLeftChild(){
  return null;
 }

 //getLeftChild: consumes a IHeap return the right child tree.
 //              returns null since empty tree does not have a right child.
 public IHeap getRightChild(){
  return null;
 }

 //equals: consumes a DataBT and a heap then returns true if both heaps and a MtBT contain no children.
 public boolean equals(IBinTree heap) {
  return heap.getLeftChild() == null && heap.getRightChild() == null;
 }

}
