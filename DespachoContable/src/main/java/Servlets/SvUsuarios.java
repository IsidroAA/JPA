package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    //Instancia para comunicarme con la Controladors de la Logica
    ControladoraLogica control = new ControladoraLogica();

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>(); //Lista que se a convertido en arraylist
        listaUsuarios = control.getUsuarios();//Se encargara de darnos o devolvernos toda la lista de usuarios mediante una instancia de la controladora
        //La anterior se conecta con LogicaController
        //Aremos una sesión
        HttpSession missesion = request.getSession(); //Se guarda el dato de la BD en la sesion yyyyyy
        missesion.setAttribute("MiPrimera", listaUsuarios);
        //Aqui primero vamos a mandarlo al servlet y despues al jsp
        response.sendRedirect("verUsuarios.jsp");//yyyy la sesion redirige a el jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //No utilizaremos el get, usaremos el post porque estamos haciendo un alta de un usuario y aqui aremos lo necesario
        //para dar de alta a un usuario, pasarlos a la lógica y posteriormente a la BD
        
        String nombreUsu = request.getParameter("nombreUsuari"); //Recibiendo datos desde altaUsuario
        String cont = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        control.crearUsuario(nombreUsu, cont, rol); //Id es generado automaticamente
        
        response.sendRedirect("index.jsp");  //Aqui una vez finalizado el proceso me redirige al Index principal
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
