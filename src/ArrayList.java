/**
 * ArrayList.java
 * Authors: Luke O’Drobinak, Franklin Young, Ethan Ayers
 * Date: 10/5/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/
    public class ArrayList<T> {
    private Node<T> rootNode;


    public ArrayList() {//Default constructor
    }

    public boolean add(T data) {
        Node<T> currentNode = rootNode;
        if (rootNode.getValue()!=null) {
            while (currentNode.getChildNode().getValue() == null) {
                currentNode = currentNode.getChildNode();
            }
            Node<T> addedNode = new Node<>(data, currentNode, null);
            currentNode.setChildNode(addedNode);
        } else {
            rootNode.setValue(data);
        }
        return true;
    }

    public void add(int i, T data){
        if (rootNode==(null)) {
            rootNode = new Node<>(data);
        } else {
            Node<T> currentNode = rootNode;
            for(int n = 0; n<i; n++) {
                if (currentNode.getChildNode() != null) {
                    currentNode = currentNode.getChildNode();
                }
            }
            Node<T> addedNode = new Node<>(data, currentNode, null);
            currentNode.setChildNode(addedNode);
        }
    }

    public T remove(int i){
        Node<T> currentNode = rootNode;
        T returnValue = currentNode.getValue();
        if(i == 0){
            rootNode = currentNode.getChildNode();
            currentNode.getChildNode().setParentNode(null);
        }else if(i== size()-1){
            while(currentNode.getChildNode() != null){
                currentNode = currentNode.getChildNode();
            }
            currentNode.setParentNode(null);
            currentNode.getParentNode().setChildNode(null);
        }else{
            for(int n = 0; n<=i; n++) {
                currentNode= currentNode.getChildNode();
            }
            Node<T> childNode = new Node<>();
            currentNode.setChildNode(childNode);
            System.out.println(currentNode.getParentNode());
            Node prevNode = currentNode.getParentNode();
            System.out.println(currentNode.getChildNode());
            Node nextNode = currentNode.getChildNode();

            prevNode.setChildNode(nextNode);
            nextNode.setParentNode(prevNode);
        }

        return returnValue;
    }

    public int size(){
        Node<T> currentNode = rootNode;
        int counter = 1;
        while(currentNode.getChildNode() != null){
            currentNode = currentNode.getChildNode();
            counter++;
        }
        return counter;
    }

    public T get(int i) {
        Node<T> currentNode = rootNode;
        for (int n = 0; n <= i; n++) {
            if (currentNode.getChildNode() != null) {
                currentNode = currentNode.getChildNode();
            }
        }
        return currentNode.getValue();
    }

    public void set(int i, T data) {
        Node<T> currentNode = rootNode;
        for (int n = 0; n <= i; n++) {
            if (currentNode.getChildNode() != null) {
                currentNode = currentNode.getChildNode();
            }
        }
        currentNode.setValue(data);
    }

    public String toString() {
        Node<T> currentNode = rootNode;
        String output = "[";
        while(currentNode.getChildNode() != null){
            output += currentNode.getValue().toString() + ", ";
            currentNode = currentNode.getChildNode();
        }
        output += currentNode.getValue().toString() + "]";
        return output;
    }

}





// T get(int i)
//
// T set(int i, T data)
//
// int size()
