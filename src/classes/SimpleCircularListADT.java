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
public class SimpleCircularListADT implements IListable{

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public void add(Node node) {

        Node current = first;

        if (first == null) {
            first = node;
            last = node;
            last.setNext(first);
        } else if (first.getValue().compareTo(node.getValue()) > 0) {
            node.setNext(first);
            first = node;
            last.setNext(first);
        } else if (last.getValue().compareTo(node.getValue()) < 0) {
            last.setNext(node);
            last = node;
            node.setNext(first);
        } else {

            while (current.getNext() != first   ) {

                if (current.getNext().getValue().compareTo(node.getValue()) > 0) {

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

        do{
            result += current.showInformation() + "\n";
            current = current.getNext();
        }while (current != first);

        return result;

    }

    public int getSize() {
        return size;
    }

}
