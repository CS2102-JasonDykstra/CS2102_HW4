import java.util.ArrayList;

public class TreeData {
    ArrayList<Integer> values = new ArrayList<Integer>();

    //storeKeyValues: consumes a binary tree and return an array list containing the key values
    public ArrayList<Integer> storeKeyValues(IBinTree root) {
        treeTravel(root);
        return values;
    }

    //treeTravel: consumes a binary tree and add the key values into a list.
    private void treeTravel(IBinTree node) {
        if (!node.equals(new MtHeap())) {
            treeTravel(node.getLeftChild());
            values.add(node.getData());
            treeTravel(node.getRightChild());
        }
    }
}
