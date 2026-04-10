/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloproducto.Service;

import com.mycompany.moduloproducto.Model.Producto;
import com.mycompany.moduloproducto.Repository.IProductoRepository;
import com.mycompany.moduloproducto.Repository.ProductoRepository;
import java.util.List;
/**
 *
 * @author Windows
 */
public class ProductoService {
    private final IProductoRepository productoRepository;
    
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }
    
    public void IngresarProducto(String codigo, String nombre, String talla, String color, double precio, int stock){
        if (codigo == null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("El codigo es obligatorio.");
        }
        
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        
        if (talla == null || talla.trim().isEmpty()){
            throw new IllegalArgumentException("La talla es obligatoria.");
        }
        
        if (color == null || color.trim().isEmpty()){
            throw new IllegalArgumentException("El color es obligatorio.");
        }
        
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        
        if (stock < 0){
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        
        Producto producto = new Producto(codigo, nombre, talla, color, precio, stock);
        productoRepository.save(producto);
    }
    
    public List<Producto> getAllProductos(){
        return productoRepository.getAllProductos();
    }
}
