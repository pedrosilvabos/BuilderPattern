package org.academiadecodigo.tropadelete.SoupBuilder;

public enum Vegetables {
    BROCCOLI,
    SPINACH,
    NONE;


    public boolean exists(){
        if(this.toString().isEmpty()){
            return false;
        }
        return true;
    }
}