<%@page import="clases.UsuarioDatos"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="usrDatos" class="clases.UsuarioDatos" scope="request"/>

<html>
    <head>
        <title>Aplicacion de Ventas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="public/main.css"/>
    </head>
    <body id="LoginForm">
        <%
            HttpSession sesion = request.getSession();
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            ResultSet res = usrDatos.login(username, password);            

        %>
        
        <% if(username==null && password==null){ %>
        <div class="container">
            <div style="padding:40px;">
                <center><h1 class="form-heading">Aplicación de ventas</h1></center>
            </div>
        <div class="login-form">
        <div class="main-div">
            <div class="panel">
           <h2>Iniciar sesion</h2>
           <p>Por favor ingrese sus credenciales de usuario</p>
           </div>
            <form id="Login" action="index.jsp" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" id="inputEmail" placeholder="Username" name="username" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="password" required="">
                    
                </div>
                <div class="forgot">
                <a href="reset.html">¿Olvidaste tu contraseña?</a>
                </div>
                <button type="submit" class="btn btn-primary">Entrar</button>
            </form>
            </div>
        </div>
        </div>
        <% } %>
      
        <% if (res.next()) { 
            
            sesion.setAttribute("username", username);
            
        %>
            
            <jsp:forward page="dashboard.jsp"/>
            
        <% }%>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</body>
</html>