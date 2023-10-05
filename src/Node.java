/**
 * Node.java
 * Author: Luke O’Drobinak
 * Date: 09/21/2023
 * Collaborators: Franklin Young, Ethan Ayers, Hugh Karmozyn
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/
public class Node<T> {
    private Node parentNode;
    private Node childNode;
    private T value;

    public Node() {          //Default constructor
        parentNode = null;
        childNode = null;
        value = null;
    }

    public Node(T value) {  //Constructor for data input only
        this.value = value;
        parentNode = null;
        childNode = null;
    }

    public Node(T value, Node parentNode, Node childNode) {  //Constructor for data and node input
        this.value = value;
        this.parentNode = parentNode;
        this.childNode = childNode;
    }

    //Setters and getters for the node class
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setChildNode(Node childNode) {
        this.childNode = childNode;
    }

    public Node getChildNode() {
        return childNode;
    }

    //toString and equals methods (Overrides)
    public String toString() {
        if (value == null) {
            return "Node: null";
        } else {
            return "Node: " + value.toString();
        }
    }

    public boolean equals(Node node) {
        return this.value.equals(node.getValue());
    }

}
