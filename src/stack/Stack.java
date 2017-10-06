/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Angelica
 * @param <T>
 */
public class Stack <T> {

    //Atributos
    private Node top;
    private int size;

    //Constructor
    public Stack() {
    this.top = null;
    this.size = 0;
    }

    //Métodos
    public Node getTop() {
    return top; }

    
    public int getSize() {
    return size; }

    
    public boolean isEmpty() {
    return top == null; }
    
    
     public void DeleteStack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
    Node nodo = new Node(data);
    if (isEmpty()) {
    top = nodo;
    } else {
    nodo.setNext(top);
    top = nodo; }
    size++;
    }

    public void pop() {
    if (!isEmpty()) {
    top = top.getNext();
    size--;
    } else {
    System.out.println("La pila no tiene elementos");  }
    }

    public void showStack() {
    if (!isEmpty()) {
    Node pivote = top;
    do {
    System.out.println(pivote.getData());
    System.out.println("↓");
    pivote = pivote.getNext();
    } while (pivote != null); }
    }
    
}
