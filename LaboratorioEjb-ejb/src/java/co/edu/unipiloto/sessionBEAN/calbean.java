/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author SANTIAGO AMAYA
 */
@Stateless
public class calbean implements calbeanLocal {

    @Override
    public Integer sumar(int val1, int val2) {
        return val1+val2;
    }
    
    public Integer restar(int rval1, int rval2) {
        return rval1-rval2;
    }
    
    public Integer multiplicar(int mval1, int mval2) {
        return mval1*mval2;
    }
    
    public Integer dividir(int dval1, int dval2) {
        return dval1/dval2;
    }
    
    public Integer modulo(int mdval1, int mdval2) {
        return mdval1%mdval2;
    }
    
    public Integer cuadrado(int cdval1, int cdval2) {
        int numsum = cdval1+cdval2;
        
        while(numsum>0){
        Integer cuadrados = (int)Math.pow(numsum, numsum);
        return cuadrados;
        }  
        
        return null ;
         
    }
   
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
