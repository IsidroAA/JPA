

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>

<<h1>Alta Usuarios</h1>
<p>Espacio para dar de alta todos los Usuarios</p>  
    

                            <form class="user" action="SvUsuarios" method="POST">
                                
                                <div class="form-group coi">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsuario" name="nombreUsuario"                        
                                            placeholder="Nombre de Usuario">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="Contraseña">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="Rol">
                                    </div>
                
                                    
                                    
                                </div> 
     
                                <buttom class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Usuario
                                </buttom>
                                
                            </form>


<%@include file="components/bodysegunda.jsp"%>


