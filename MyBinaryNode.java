public class MyBinaryNode<T extends Comparable<T>>{

    Node<T> root;
    public void add(T key){

        this.root = addReccursive(this.root, key);
    }

    public Node<T> addReccursive(Node<T> currentRoot, T newKey){

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