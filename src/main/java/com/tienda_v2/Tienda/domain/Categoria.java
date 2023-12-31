package com.tienda_v2.Tienda.domain;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String ruta_imagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
    
    
}
