

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>

<<h1>Editar Usuarios</h1>
<p>Espacio para editar los Usuarios</p>  
    
                        <% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar"); %>
                            <form class="user" action="SvEditarUsuarios" method="POST">
                                
                                <div class="form-group coi">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsuario" name="nombreUsuario"                        
                                            placeholder="Nombre de Usuario" value="<%=usu.getNombreUsuario()%>">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="Contraseña" value="<%=usu.getContraseña()%>">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                               placeholder="Rol" value="<%=usu.getRol()%>"> <!-- Con esto ya tendremos precargados los datos -->
                                    </div>
                
                                    
                                    
                                </div> 
     
                                <buttom class="btn btn-primary btn-user btn-block" type="submit">
                                    Modificar Usuario
                                </buttom>
                                
                            </form>


<%@include file="components/bodysegunda.jsp"%>


