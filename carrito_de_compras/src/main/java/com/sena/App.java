package com.sena;

public class App {
    public static void main(String[] args) {

        // crear productos
        Producto producto1 = new Producto("Laptop", 1500.00, 2);
        Producto producto2 = new Producto("Smartphone", 800.00, 3);
        Producto producto3 = new Producto("Tablet", 400.00, 1);
        Producto producto4 = new Producto("Auriculares", 150.00, 5);

        // crear carrito
        Carrito carrito = new Carrito();

        // agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);

        // listar productos del carrito
        carrito.listarProductos();

        // calcular total del carrito
        double total = carrito.calcularTotal();
        System.out.println("Total del carrito: $" + total);

        // cambiar precio y cantidad de un producto
        producto1.setPrecio(1400.00);
        producto1.setCantidad(3);
        System.out.println("Precio actualizado de " + producto1.getNombre() + ": $" + producto1.getPrecio()
                + ", Cantidad: " + producto1.getCantidad());
        // vender un producto
        producto2.vender(1);    
        System.out.println("Cantidad restante de " + producto2.getNombre() + ": " + producto2.getCantidad());

        // validar error al vender más de lo disponible
        try {     producto3.vender(2);
            System.out.println("Cantidad restante de " + producto3.getNombre() + ": " + producto3.getCantidad());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al vender: " + e.getMessage());
        }

    }
}