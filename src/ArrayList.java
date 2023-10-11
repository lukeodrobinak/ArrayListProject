/**
 * ArrayList.java
 * Authors: Luke O’Drobinak, Franklin Young, Ethan Ayers
 * Date: 10/5/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/
    public class ArrayList<T> {

    private T value;
    private Node<T> rootNode = null;


    public ArrayList() {//Default constructor
    }

    public boolean add(T data) {
        Node<T> currentNode = rootNode;
        if (rootNode.equals(null)) {
            rootNode = new Node<>(data);
        } else {
            while (currentNode.getChildNode().equals(null)) {
                currentNode = currentNode.getChildNode();
            }
            Node<T> addedNode = new Node<>(data, currentNode, null);
            currentNode.setChildNode(addedNode);
        }
        return true;
    }

    public void add(int i, T data){
        if (rootNode.equals(null)) {
            rootNode = new Node<>(data);
        } else {
            Node<T> currentNode = rootNode;
            for(int n = 0; n<i; n++) {
                if (currentNode.getChildNode != null) {
                    currentNode = currentNode.getChildNode();
                }
            }
            Node<T> addedNode = new Node<>(data, currentNode, null);
            currentNode.setChildNode(addedNode);
        }
    }

    public T remove(int i){
        Node<T> currentNode = rootNode;
        for(int n = 0; n<=i; n++) {
            if (currentNode.getChildNode != null) {
                currentNode = currentNode.getChildNode();
            }
            currentNode.getParentNode.setChildNode(currentNode.getChildNode);
            currentNode.getChildNode.setParentNode(currentNode.getParentNode);
            currentNode.setParentNode(null);
            currentNode.setChildNode(null);
        }
    }
}




// T remove(int i)
//
// T get(int i)
//
// T set(int i, T data)
//
// int size()