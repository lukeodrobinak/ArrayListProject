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
}


// boolean add(T data)
//
// void add(int i, T data)
//
// T remove(int i)
//
// T get(int i)
//
// T set(int i, T data)
//
// int size()