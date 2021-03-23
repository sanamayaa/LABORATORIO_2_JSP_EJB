/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Local;

/**
 *
 * @author SANTIAGO AMAYA
 */
@Local
public interface calbeanLocal {

    Integer sumar(int val1, int val2);
    
    Integer restar(int rval1, int rval2);
    
    Integer multiplicar(int mval1, int mval2);
    
    Integer dividir(int dval1, int dval2);
    
    Integer modulo(int mdval1, int mdval2);
    
    
    
}
