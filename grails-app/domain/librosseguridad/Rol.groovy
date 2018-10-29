package librosseguridad

class Rol implements Serializable {
    private static final long serialVersionUID = 1

	   String authority


  	boolean equals(otro) {
  		is(otro) || (otro instanceof Rol && otro.authority == authority)
  	}

  	static constraints = {
  		authority blank: false, unique: true
  	}
}
