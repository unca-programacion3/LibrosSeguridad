<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
  <g:if test="${session!=null && session.usuario!=null}">
    <div class="nav" role="navigation">
        <ul>
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> Usuario: ${session?.usuario?.nombreUsuario}</a></li>
          <li><g:link controller="login" action="logout" controller="login"><span class="glyphicon glyphicon-log-in"></span> Cerrar Sesion</g:link></li>
        </ul>
    </div>
  </g:if>
  <g:else>
    <div class="nav" role="navigation">
        <ul>
          <li><g:link controller="login" action="login">Login</g:link></li>

        </ul>
    </div>
  </g:else>
  <g:if test="${message}">
    <div class="message" role="status">${message}</div>
  </g:if>
  <div class="container">
    <br><br>
    <div class="row">
      <div class="col-sm-6">
        <div class="panel panel-primary">
          <div class="panel-heading">GESTION AUTORES</div>
          <div class="panel-footer">
            <g:link controller="autor" action="index">lista de Autores</g:link><br>

          </div>
        </div>
      </div>
      <div class="col-sm-6">
        <div class="panel panel-primary">
          <div class="panel-heading">GESTION DE LIBROS</div>
          <div class="panel-footer">
            <g:link controller="libro" action="index">Gestión de Libros</g:link>
          </div>
        </div>
      </div>

    </div>
  </div>

</body>
</html>
