public class BinarySearchMain{

    public static void main(String[] args){

        MyBinaryNode<Integer> binary = new MyBinaryNode<>(13);
        binary.add(56);
        binary.add(30);
        binary.add(70);
        binary.add(22);
        binary.add(40);
        binary.add(60);
        binary.add(95);
        binary.add(11);
        binary.add(65);
        binary.add(3);
        binary.add(16);
        binary.add(63);
        binary.add(67);
        // This node will be excluded since the size exceeded
        binary.add(98);
        System.out.println("\n Size : "+binary.getSize());
        int searchKey = 63;
        if(binary.search(searchKey)){
            System.out.println(searchKey +" present in BST");
        }else{
            System.out.println(searchKey +" not present in BST");
        }
    }
}