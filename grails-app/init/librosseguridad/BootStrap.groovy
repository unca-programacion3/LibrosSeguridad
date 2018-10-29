package librosseguridad

class BootStrap {

    def init = { servletContext ->
      /*def usu= new Usuario(nombreUsuario: 'Cecilia', password: 'viewsonic', email: 'cecyga@yahoo.com.ar')
      if(!usu.save(flush: true)) {
        usu.errors.each{
          println it
        }
      }

      def rol = new Rol(authority: 'ADMIN')
      if(!rol.save(flush: true)) {
        rol.errors.each{
          println it
        }
      }

      def usuarioRol = new UsuarioRol(usuario: usu, rol: rol)
      if(!usuarioRol.save(flush: true)) {
        usuarioRol.errors.each{
          println it
        }
      }

      def usu2= new Usuario(nombreUsuario: 'Un-autor', password: '123', email: 'aa@yahoo.com.ar')
      if(!usu2.save(flush: true)) {
        usu2.errors.each{
          println it
        }
      }

      def rol2 = new Rol(authority: 'AUTOR')
      if(!rol2.save(flush: true)) {
        rol2.errors.each{
          println it
        }
      }

      def usuarioRol2 = new UsuarioRol(usuario: usu2, rol: rol2)
      if(!usuarioRol2.save(flush: true)) {
        usuarioRol2.errors.each{
          println it
        }
      }*/

    }
    def destroy = {
    }
}
