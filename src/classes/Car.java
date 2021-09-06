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
public class Car implements Comparable<Car> {
    
    private int ccValue;
    private boolean used;
    
    public Car(int ccValue, boolean  used){
        this.ccValue = ccValue;
        this.used = used;
    }

    public int getCcValue() {
        return ccValue;
    }

    public void setCcValue(int ccValue) {
        this.ccValue = ccValue;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public int compareTo(Car c) {
            
        if(this.ccValue < c.getCcValue()){
            return -1;
        }else if (this.ccValue == c.getCcValue()){
            return 0;
        }else{
            return 1;
        }
        
    }
    
    @Override
    public String toString(){
        return "CC: "+ccValue+ " is used: "+used;
    }
    
}
