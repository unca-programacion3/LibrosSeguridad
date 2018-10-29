package librosseguridad

import grails.gorm.services.Service

@Service(Libro)
abstract class LibroService implements ILibroService{

    @Override
    List<Libro> buscarLibrosPorTitulo(String titulo) {
          titulo='%'+titulo+'%'
          return Libro.findAllByTituloLike(titulo)
    }

    def buscarLibrosInseguro(String autor) {
      return Libro.executeQuery("from Libro as l where l.autor.apellidoNombre = '"+autor+"'")
    }

    def buscarLibrosSeguro(String autor) {
      return Libro.executeQuery("from Libro as l where l.autor.apellidoNombre = :autor",[autor: autor])
    }


}
