/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author cahuc
 */
public class DoubleNode<T extends Comparable> {

    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;

    
    public DoubleNode(T value) {
        this.value = value;
        this.next = null;
    }

    public DoubleNode(T value, DoubleNode next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public DoubleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }
    
    
    public String showInformation(){
        
        return value.toString();
    }

}
