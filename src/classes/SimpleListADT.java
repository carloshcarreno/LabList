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
public class SimpleListADT implements IListable {

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public void add(Node node) {

        Node current = first;

        if (first == null) {
            first = node;
            last = node;
        } else if (first.getValue().compareTo(node.getValue()) > 0) {
            node.setNext(first);
            first = node;
        } else if (last.getValue().compareTo(node.getValue()) < 0) {
            last.setNext(node);
            last = node;
        } else {

            while (current.getNext() != null) {

                if(current.getNext().getValue().compareTo(node.getValue()) > 0){
                    
                    node.setNext(current.getNext());
                    current.setNext(node);                    
                    break;
                }
                
                current = current.getNext();
            }

        }
        
        size++;

    }

    public String print() {

        Node current = first;
        String result = "";

        while (current != null) {

            result += current.showInformation() + "\n";
            current = current.getNext();
        }

        return result;

    }
    
    public int getSize(){
        return size;
    }

}
