
package com.tienda_v2.Tienda.service;

import com.tienda_v2.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //Se obtiene un listado de productos en un list
    public List<Producto> getProductos(boolean activos);

   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}


