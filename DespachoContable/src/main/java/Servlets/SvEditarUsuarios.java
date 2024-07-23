
package Servlets;

import static java.awt.SystemColor.control;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Usuario;

@WebServlet(name = "SvEditarUsuarios", urlPatterns = {"/SvEditarUsuarios"})
public class SvEditarUsuarios extends HttpServlet {
    
    //Instancia para comunicarme con la Controladors de la Logica
    ControladoraLogica control = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int id = Integer.parseInt(request.getParameter("id")); //En parameter, ponemos el id de verUsuarioa
        Usuario usu = control.traerUsuario(id);
        
        //Obtener la request de la sesión
        HttpSession misession = request.getSession();
        misession.setAttribute("usuEditar", usu);
        response.sendRedirect("editarUsuarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario= request.getParameter("nombreUsuario");
        String contrasenia= request.getParameter("contrasenia");
        String rol= request.getParameter("rol");
        
        Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        control.editarUsuario(usu); //No incluimos id porque esta ya viene incluida en usu
        
        response.sendRedirect("SvUsuarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
