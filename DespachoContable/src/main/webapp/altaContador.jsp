
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>

<<h1>Alta Contador</h1>
<p>Espacio para dar de alta a todos los Contadores</p>  
    

 <form class="user">
                                <div class="form-group coi">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="adn"
                                            placeholder="ADN">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido"
                                            placeholder="Apellido">
                                    </div>
                                    
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="Telefono">
                                    </div>
                                    
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="Dirección">
                                    </div>
                                    
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechanacimiento"
                                            placeholder="Fecha Nacimiento">
                                    </div>
                                    
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad"
                                            placeholder="Especialidad">
                                    </div>
                                    
                                    <!-- Aqui van los horarios y usuarios -->
                                    
                                    
                                    
                                </div> 
     
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Crear Contador
                                </a>
                                
                            </form>


<%@include file="components/bodysegunda.jsp"%>


