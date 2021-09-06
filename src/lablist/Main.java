/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lablist;

import classes.Car;
import classes.Node;
import classes.SimpleCircularListADT;
import classes.SimpleListADT;
import classes.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author cahuc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
        SimpleCircularListADT list = new SimpleCircularListADT();

        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar \n3. Eliminar \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    String name = JOptionPane.showInputDialog("Digite el nombre");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
                    Student student = new Student(name, age);
                    
                    //String cc = JOptionPane.showInputDialog("Digite el cilidraje");
                    //Car car = new Car( Integer.parseInt(cc) ,false);
                    
                    Node node = new Node( student );
                    list.add(node);
                    break;
                case 2:
                    break;

                case 3:
                    break;
                case 4:
                    String students = list.print();
                    JOptionPane.showMessageDialog(null, students);
                    break;
            }

        } while (input != 0);
        
    }
    
}
