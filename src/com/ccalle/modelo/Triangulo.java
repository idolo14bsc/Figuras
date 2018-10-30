/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Casa
 */
public class Triangulo {
    private float base;
    private float altura;
    private float resultado;

    public Triangulo() {
    } 

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
        
    }

    /**
     * @param base the base to set
     */
    public void setBase() {
        this.base = base;
        base = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la Base:"));
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura() {
        this.altura = altura;
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la Altura:"));
        
    }
    

    public void areaTriangulo() {
        JOptionPane.showMessageDialog(null,"El ares es:"+(base*altura)/2 );
    }
    
    
    
    
    
    
    
}
