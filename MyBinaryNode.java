public class MyBinaryNode<T extends Comparable<T>>{

    Node<T> root;
    int size;

    public MyBinaryNode(int size){
        this.size = size;
    }

    public void add(T key){

        this.root = addReccursive(this.root, key);
    }

    public Node<T> addReccursive(Node<T> currentRoot, T newKey){
        if(getSize() == this.size){
            return currentRoot;
        }
        if(currentRoot == null){
            return new Node<>(newKey);
        }
        else{
            if(newKey.compareTo(currentRoot.key) <= 0){
                currentRoot.left = addReccursive(currentRoot.left, newKey);
            }
            else {
                currentRoot.right = addReccursive(currentRoot.right, newKey);
            }
        }
        return currentRoot;
    }

    public int getSize(){
        return getSizeReccursive(this.root);
    }
    public int getSizeReccursive(Node<T> currentRoot){
        int count = 0;
        if(currentRoot == null){
            return 0;
        }
        else{
            count = 1 + getSizeReccursive(currentRoot.left) + getSizeReccursive(currentRoot.right);
        }
        return count;
    }
    private class Node<T extends Comparable<T>>{

        T key;
        Node<T> left, right;
        Node(T key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
}