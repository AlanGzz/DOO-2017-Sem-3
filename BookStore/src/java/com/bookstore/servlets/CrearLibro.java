/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class CrearLibro extends HttpServlet {

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
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Crear Libro</title>");
            out.print("<link rel='stylesheet' href='static/bookstore.css' />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Crear Libro at Bookstore</h1>");
            out.println("<article>");
            out.println("<header><h2>Se ha creado un libro.</h2></header>");
            out.println("<label>Nombre: " + request.getParameter("Nombre") + "</label><br/>");
            out.println("<label>Precio: " + request.getParameter("Precio") + "</label><br/>");
            out.println("<label>ISBN: " + request.getParameter("ISBN") + "</label><br/>");
            out.println("<label>Fecha de publicacion: " + request.getParameter("Fecha") + "</label><br/>");
            out.println("<label>Genero: " + request.getParameter("Genero") + "</label><br/>");
            out.println("<label>Editorial: " + request.getParameter("Editorial") + "</label><br/>");
            out.println("<label>Autor: " + request.getParameter("Autor") + "</label><br/>");
            out.println("</article>");
            out.println("</body>");
            out.println("</html>");
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
