import java.util.ArrayList;
import java.util.Collections;

public class MtBT implements IBinTree {
 MtBT(){}

 // returns false since empty tree has no elements
 public boolean hasElt(int e) {
  return false;
 }

 // returns 0 since enpty tree has no elements
 public int size() {
  return 0;
 }

 // returns 0 since empty tree has no branches
 public int height() {
  return 0;
 }

 //-----------------------------------------Added Code----------------------------------------------

 //getLeftChild: consumes a IBinTree return the left child tree.
 //              returns null since empty tree does not have a left child.
 public IBinTree getLeftChild(){
  return null;
 }

 //getLeftChild: consumes a IBinTree return the right child tree.
 //              returns null since empty tree does not have a right child.
 public IBinTree getRightChild(){
  return null;
 }

 //getData: consumes a IBinTree and return data for IBinTree interface.
 //         returns 0 since getData will not be used on an empty node and an empty node does not have a key.
 public int getData(){
  return 0;
 }

 //isHeap: consumes a MtBT and return true because an empty tree is a heap.
 public boolean isHeap(){
  return true;
 }

 //containsAfterAdd: consumes a DataBT, a heap, and an integer,
 //                  then returns true if both binary trees contain the same data nodes.
 public boolean containsAfterAdd(IHeap heap, int elt){
  ArrayList<Integer> heapElements = new ArrayList<>();
  ArrayList<Integer> binaryElements = new ArrayList<>();

  TreeData heapData = new TreeData();
  TreeData binaryData = new TreeData();

  heapData.storeKeyValues(heap);
  binaryData.storeKeyValues(this);

  heapElements = heapData.values;
  heapElements.add(elt);
  binaryElements = binaryData.values;

  return compareLists(heapElements, binaryElements);
 }

 //containsAfterRem: consumes a DataBT and a heap,
 //                  then returns true if both binary trees contain the same data nodes
 public boolean containsAfterRem(IHeap heap) {
  ArrayList<Integer> heapElements = new ArrayList<>();
  ArrayList<Integer> binaryElements = new ArrayList<>();

  TreeData heapData = new TreeData();
  TreeData binaryData = new TreeData();

  heapData.storeKeyValues(heap);
  binaryData.storeKeyValues(this);

  heapElements = heapData.values;
  heapElements.remove(Collections.min(heapElements));
  binaryElements = binaryData.values;

  return compareLists(heapElements, binaryElements);
 }

 //compareLists: consumes two lists and return true if both lists are the same.
 public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
  Collections.sort(list1);
  Collections.sort(list2);

  return list1.equals(list2);
 }

 //equals: consumes a DataBT and a heap then returns true if both heaps and a MtBT contain no children.
 public boolean equals(IBinTree heap){

  return heap.getLeftChild() == null && heap.getRightChild() == null;
 }
}
