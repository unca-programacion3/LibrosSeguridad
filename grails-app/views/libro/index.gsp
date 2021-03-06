<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'libro.label', default: 'Libro')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-libro" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-libro" class="content scaffold-list" role="main">
          <br><br>
          <div class="panel panel-info" >
                  <div class="panel-heading">
                      Busqueda de Libros por Autor
                  </div>
                  <div class="panel-body">
                      <form action="buscarLibros" method="POST">
                          <div class="row">
                              <div class="col-md-6">
                                    <label>Ingrese Nombre completo del Autor</label>
                                    <input type="text" name="autor" id="autor" class="form-control"  value="">
                              </div>

                              <div class="col-md-12">
                                  <br />
                                  <button type="submit" class="btn btn-primary">
                                      <span class="glyphicon glyphicon-search"></span>
                                      Buscar
                                  </button>
                              </div>
                          </div>
                      </form>
                  </div>
              </div>
              <br>
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>


            <f:table collection="${libroList}" />

            <div class="pagination">
                <g:paginate total="${libroCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
