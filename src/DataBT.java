import java.util.ArrayList;
import java.util.Collections;

public class DataBT implements IBinTree {
 int data;
 IBinTree left;
 IBinTree right;

 DataBT(int data, IBinTree left, IBinTree right) {
  this.data = data;
  this.left = left;
  this.right = right;
 }

 // an alternate constructor for when both subtrees are empty
 DataBT(int data) {
  this.data = data;
  this.left = new MtBT();
  this.right = new MtBT();
 }

 // determines whether this node or node in subtree has given element
 public boolean hasElt(int e) {
  return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
 }

 // adds 1 to the number of nodes in the left and right subtrees
 public int size() {
  return 1 + this.left.size() + this.right.size();
 }

 // adds 1 to the height of the taller subtree
 public int height() {
  return 1 + Math.max(this.left.height(), this.right.height());
 }

 //-----------------------------------------Added Code----------------------------------------------

 //getLeftChild: consumes a IBinTree return the left child tree.
 public IBinTree getLeftChild(){
  return this.left;
 }

 //getLeftChild: consumes a IBinTree return the right child tree.
 public IBinTree getRightChild(){
  return this.right;
 }

 //getData: consumes a IBinTree and return data for IBinTree interface.
 public int getData(){
  return this.data;
 }

 //isHeap: consumes a DataBT and return true if the tree is a heap with following conditions:
 //        if the node has no children then the tree is a heap,
 //        if the node has no right child and the left child's data is greater than the node's then the tree is a heap,
 //        if the node has no left child and the right child's data is greater than the node's then the tree is a heap,
 //        if the node's children's data are greater than the node's then the tree is a heap,
 public boolean isHeap(){

  //Both are empty nodes
  if(this.left.equals(new MtBT()) && this.right.equals(new MtBT())){

   return true;
  }
  //Right node is empty, check left.
  else
  if(this.right.equals(new MtBT())
          && this.left.getData() >= this.data
          && this.left.isHeap()){

   return true;
  }
  //Left node is empty, check right.
  else
  if(this.left.equals(new MtBT())
          && this.right.getData() >= this.data
          && this.right.isHeap()){

   return true;
  }
  //Check both nodes.
  else
  if(this.right.getData() >= this.data
          && this.left.getData() >= this.data
          && this.right.isHeap()
          && this.left.isHeap()){

   return true;
  }
  //The tree is not a heap.
  return false;
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
 public boolean containsAfterRem(IHeap heap){
  ArrayList<Integer> heapElements = new ArrayList<>();
  ArrayList<Integer> binaryElements = new ArrayList<>();

  TreeData heapData = new TreeData();
  TreeData binaryData = new TreeData();

  heapData.storeKeyValues(heap);
  binaryData.storeKeyValues(this);

  heapElements = heapData.values;
  if(!heapElements.equals(new ArrayList<Integer>())){
   heapElements.remove(Collections.min(heapElements));
  }
  binaryElements = binaryData.values;

  return compareLists(heapElements, binaryElements);
 }

 //compareLists: consumes two lists and return true if both lists are the same.
 public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
  Collections.sort(list1);
  Collections.sort(list2);

  return list1.equals(list2);
 }

 //equals: consumes a DataBT and a heap then returns true if both are equal,
 //        however, there is no need to compare a heap to a non-empty node, thus returns false.
 public boolean equals(IBinTree heap){
  return false;
 }

}
