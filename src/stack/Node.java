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
public class Node <T> {
    T data;
    Node next;
   
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    
    public void setData(T data){
        this.data = data; }
    
    public T getData(){
        return this.data; }
    
    public void setNext(Node n){
        this.next = n;  }
    
    public Node getNext(){
        return this.next; }
    
    
}