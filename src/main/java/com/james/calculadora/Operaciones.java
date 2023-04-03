/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.james.calculadora;

/**
 * 
 * @author James Gramajo 
 */
public class Operaciones {
    
    public double calcular(double n1, double n2,String signo){
        double resultado=0;
        switch(signo){
            case "+":
                resultado=n1+n2;
                break;
            case "-":
                resultado=n1-n2;
                break;
            case "*":
                resultado=n1*n2;
                break;
            case "/":
                resultado=n1/n2;
                break;
            default:
                System.out.println("la operacion seleccionada es invalida");
        }
        
        return resultado;
        
    }

}
