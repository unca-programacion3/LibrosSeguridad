package librosseguridad

class UsuarioRol implements Serializable {
    private static final long serialVersionUID = 1

    Usuario usuario
    Rol rol


    boolean equals(otro) {
      if (!(otro instanceof UsuarioRol)) {
        return false
      }

      otro.usuario?.id == usuario?.id && otro.rol?.id == rol?.id
    }

    static UsuarioRol get(long usuarioId, long rolId) {
      return UsuarioRol.executeQuery("from UsuarioRol ur where usuario.id= :usuarioId && rol.id= :rolId",[usuarioId: usuarioId, rolId: rolId])
    }

    static boolean exists(long usuarioId, long rolId) {
      criteriaFor(usuarioId, rolId).count()
    }


    static boolean remove(Usuario u, Rol r, boolean flush = false) {
      if (u == null || r == null) return false

      int rowCount = UsuarioRol.where { usuario == u && rol == r }.deleteAll()

      if (flush) { UsuarioRol.withSession { it.flush() } }

      rowCount
    }

    static void removeAll(Usuario u, boolean flush = false) {
      if (u == null) return

      UsuarioRol.where { usuario == u }.deleteAll()

      if (flush) { UsuarioRol.withSession { it.flush() } }
    }

    static void removeAll(Rol r, boolean flush = false) {
      if (r == null) return

      UsuarioRol.where { rol == r }.deleteAll()

      if (flush) { UsuarioRol.withSession { it.flush() } }
    }

    static constraints = {
      rol validator: { Rol r, UsuarioRol ur ->
          if (ur.usuario == null || ur.usuario.id == null) return
          boolean existing = false
          UsuarioRol.withNewSession {
            existing = UsuarioRol.findByUsuarioAndRol(ur.usuario, r)
          }
          if (existing) {
            return 'userRole.exists'
          }
        }

    }

    static mapping = {
      id composite: ['usuario', 'rol']
      version false
      rol cascade:'all-delete-orphan'
      usuario cascade:'all-delete-orphan'
    }
}
