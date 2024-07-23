
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraLogica;


@WebServlet(name = "SvEliminarUsuarios", urlPatterns = {"/SvEliminarUsuarios"})
public class SvEliminarUsuarios extends HttpServlet {
    
    //Instancia para comunicarme con la Controladors de la Logica
    ControladoraLogica control = new ControladoraLogica();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id")); //En parameter, ponemos el id de verUsuarioa
        control.borrarUsuario(id); //Creamos método para borrar usuario
        
        response.sendRedirect("SvUsuarios");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
