<%@page import="java.util.Collections.list(...)"%>
<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections.list(...)"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>

<h1> Apartado de Visualización de Usuarios</h1>


<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
                    <p class="mb-4">Lista de Usuarios</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Usuarios Registrados</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre Usuario</th>
                                            <th>Rol</th>
                                            <th style="width:210px">Acción</th>
                                        </tr>
                                        
                                    </thead>
                                    <tfoot>
                                        
                                        <tr>
                                           <th>Id</th>
                                            <th>Nombre Usuario</th>
                                            <th>Rol</th>
                                            <th style="width:210px">Acción</th>
                                        </tr>
                                        
                                    </tfoot>
                                    
                                    <% 
                                        //Aqui esta haciendo un casteo y esta trayendo los datos de la ArrayList convirtiendolos a List
                                    List<Usuario> listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios");
                           
                                    %>
                                    
                                    <tbody>
                                        <% for(Usuario usu:listaUsuarios){ %>
                                        <tr>
                                            <td id="id_usu<%=usu.getId_usuario()%>"<%=usu.getId_usuario()%> </td>
                                            <td><%=usu.getNombreUsuario()%></td>
                                            <td><%=usu.getRol()%></td>
                                            
                                            <td style="display:flex;width:230px;">
                                                <form name="eliminar" action="SvEliminarUsuarios" method="POST"> <!-- Esto manda el codigo al servlet -->
                                                    <buttom type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px; "> 
                                                        <i class="fas fa-trash-alt"></i> Eliminar
                                                    </buttom>
                                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"> <!-- Esto manda el codigo al servlet -->
                                                </form>
                                                <form name="editar" action="SvEditarUsuarios" method="GET">
                                                    <buttom type="submit" class="btn btn-primary btn-user btn-block"; style="margin-left: 5px;"> <!-- Esto manda el codigo al servlet -->
                                                        <i class="fas fa-pencil-alt"></i> Editar
                                                    </buttom>
                                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"><!-- Esta parte manda el codigo al servlet -->
                                                </form>
                                            </td>
                                        </tr>  
                                        <% } %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
    

<%@include file="components/bodysegunda.jsp"%>