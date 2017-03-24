/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mr.BOSS
 */
public class AddPro extends HttpServlet {

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
       // processRequest(request, response);
        int proid=Integer.parseInt(request.getParameter("proid"));
        String ptype=request.getParameter("type");
        String pname=request.getParameter("proname");
        String pprice=request.getParameter("price");
        String sprice=request.getParameter("sell");
        String marketed=request.getParameter("from");
        String brand=request.getParameter("brand");
        int pquantity=Integer.parseInt(request.getParameter("quantity"));
        
        PrintWriter out = response.getWriter();
        
        
        try{    String url = "jdbc:derby://localhost:1527/Shop";
            String username="bose";
            String password="bose";
            Connection con = DriverManager.getConnection (url,username,password);
        Statement stmt = con.createStatement();
            int n=stmt.executeUpdate("insert into products values("+proid+",'"+ptype+"','"+pname+"','"+pprice+"','"+sprice+"','"+marketed +"','"+brand+"',"+pquantity+")");
        if(n>0)
             {
                 RequestDispatcher rd=request.getRequestDispatcher("addp.html");
             rd.forward(request, response);
             }
             else
             {
                RequestDispatcher rd=request.getRequestDispatcher("home.html");
             rd.forward(request, response);
             }
        
        
        
        
        }catch(SQLException e){
           RequestDispatcher rd=request.getRequestDispatcher("index.html");
             rd.forward(request, response);
        }
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
