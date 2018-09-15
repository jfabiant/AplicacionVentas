<%@page import="clases.UsuarioDatos"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="usrDatos" class="clases.UsuarioDatos" scope="request"/>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="public/main2.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<%
    String username = request.getParameter("username");
    String username_sesion = (String)session.getAttribute("username");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Aplicacion de ventas</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        
    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <a href="dashboard.jsp" class="navbar-brand"> <%= username_sesion %> </a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">

                <li class="nav-item dropdown ">
                    <a href="#" class="nav-link dropdown-toggle active ml-auto" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >Opciones</a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a href="index.jsp" class="dropdown-item">Cerrar sesión</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
        <div class="container">
            
            <div class="row mt-30" style="margin-top:30px;">
                <div class="col-md-4 col-sm-6">
                    <div class="box3">
                        <img src="https://images7.alphacoders.com/413/413186.jpg" height="320" width="440">
                        <div class="box-content">
                            <h3 class="title">Listar y buscar productos</h3>
                            <span class="post">Web Programming</span>
                            <p class="description">
                                Aqui se podran listar y se podran buscar los productos agregados.
                            </p>
                            <ul class="icon">
                                <li><a href="listar.jsp" class="fa fa-link"></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6">
                    <div class="box3">
                        <img src="http://hungernwnc.org/blog/wp-content/uploads/2017/05/shopping-cart-grocery-store-web.jpg" height="320" width="440">
                        <div class="box-content">
                            <h3 class="title">Agregar productos</h3>
                            <span class="post">Web Programming</span>
                            <p class="description">
                                Aqui se podran agregar nuevos productos.
                            </p>
                            <ul class="icon">
                                <li><a href="agregar.jsp" class="fa fa-link"></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>