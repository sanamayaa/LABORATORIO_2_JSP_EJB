/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBEAN.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dlpol
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String ecuacion=request.getParameter("ecuacion");
            int tamaño = ecuacion.length();
            String aux[] = new String[tamaño];
            String operador[] = new String [tamaño];
            int pos = 0;
            int sum = 0;
            int val1, val2;
            String aux2 ="";
            int index = 0;
            for (int i = 0; i < tamaño; i++) {
                if(ecuacion.charAt(i) == '+' || ecuacion.charAt(i) == '-' || ecuacion.charAt(i) == '*' || ecuacion.charAt(i) == '/' || ecuacion.charAt(i) == '%' || ecuacion.charAt(i) == '^')
                {
                    aux[pos] = aux2;
                    operador[index] = String.valueOf(ecuacion.charAt(i));
                    pos++;
                    index++;
                    aux2 = "";
                }
                else{
                    aux2= aux2 + ecuacion.charAt(i);
                }
            }
            aux[pos]=aux2;
            pos++;
            val1= Integer.parseInt(aux[0]) ;
            val2= Integer.parseInt(aux[1]) ;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            for(int i = 0; i<pos ; i++){
                if(operador[i].equals("+")){
                    out.println("<h1> suma = " + calcBean.sumar(val1, val2) + "</h1>");
                }
                else
                    if(operador[i].equals("-")){
                    out.println("<h1> resta = " + calcBean.restar(val1, val2) + "</h1>");
                    }
                else
                        if(operador[i].equals("*")){
                            out.println("<h1> multipliación = " + calcBean.multiplicar(val1, val2) + "</h1>");
                        }
                else
                            if(operador[i].equals("/")){
                            out.println("<h1> división = " + calcBean.dividir(val1, val2) + "</h1>");
                            }
                else
                                if(operador[i].equals("%")){
                                    out.println("<h1> modulo = " + calcBean.modulo(val1, val2) + "</h1>");
                                }
                else
                                   if(operador[i].equals("^")){
                                       out.println("<h1> potencia = " + calcBean.potencia(val1, val2) + "</h1>");
                                   }
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
