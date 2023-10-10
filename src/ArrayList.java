/**
 * ArrayList.java
 * Authors: Luke O’Drobinak, Franklin Young, Ethan Ayers
 * Date: 10/5/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/
    public class ArrayList<T>{

        private T value;


        public ArrayList() {//Default constructor
        }
        public boolean add(T data){

                Node<T> addedNode = new Node<>(data);

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