/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Local;

/**
 *
 * @author dlpol
 */
@Local
public interface calbeanLocal {

    Integer sumar(int val1, int val2);

    Integer restar(int val1, int val2);

    Integer multiplicar(int val1, int val2);

    Integer dividir(int val1, int val2);

    Integer modulo(int val1, int val2);

    Integer potencia(int val1, int val2);
    
}
