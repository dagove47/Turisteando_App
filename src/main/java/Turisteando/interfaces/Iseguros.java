
package Turisteando.interfaces;


import Turisteando.modelo.seguros;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iseguros extends CrudRepository <seguros,Integer > {
       
}
