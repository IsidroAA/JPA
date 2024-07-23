
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    
     //Instancia para comunicarme con la Controladors de la Logica
     ControladoraLogica control = new ControladoraLogica();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Traemos al usuario y contraseña mediante reques
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        
        //El que hace la validación debe ser la lógica
        boolean validacion = false;
        validacion = control.comprobaringreso(usuario, contrasenia);
         
        //Si es verdadero se tiene que crear la session y asignarla al usuario
        if(validacion == true){
            HttpSession missesion = request.getSession(true);
            missesion.setAttribute("usuario", contrasenia);
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("errorLogin.jsp");
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
