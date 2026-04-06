package com.sena;

import java.util.ArrayList;

public class Carrito {

    // 1) Atributo list d productos
    private ArrayList<Producto> productos;

    // 2) Constructor
    public Carrito() {
        productos = new ArrayList<>();// []
    }

    // 3 Agregar producto al carrito
    public void agregarProducto(Producto producto) { // producto es un objeto de la clase Producto
        productos.add(producto);
    }

    // 4 Calcular total del carrito
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    // 5 listar productos del carrito
    public void listarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }


    

}