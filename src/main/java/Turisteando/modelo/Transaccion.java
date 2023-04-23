
package Turisteando.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    
    @Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    

    

    // constructores, getters y setters

    public Transaccion() {
    }

    public Transaccion(Long id, String tipo, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

   
}