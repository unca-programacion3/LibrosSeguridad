<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Login</title>
</head>
<body>
    <div class="container">
    <g:if test="${message}">
      <div class="message" role="status">${message}</div>
    </g:if>
      <h1>Login de Usuario</h1>
      <g:form controller="login" action="login" method="post">
          <label for='email'>Ingrese su Email registrado:</label>
          <input type='email' id='email' name='email' required/>
          <br><br>
          <label for='password'>Ingrese su Contraseña:</label>
          <input type="password" id='password' name='password' required/>
          <br><br>
          <input type="submit" value="Login"/>
      </g:form>
    </div>

</body>
</html>
