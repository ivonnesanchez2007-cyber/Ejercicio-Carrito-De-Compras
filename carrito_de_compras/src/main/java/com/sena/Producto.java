package com.sena;

public class Producto {

    // 1) Atributods privados encapsulados

    private String nombre;
    private double precio;
    private int cantidad;

    // 2) Constructor

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
    }

    // 3) Getters

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // 4) Setters

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }

    // 5) METODO vender

    public void vender(int cantidadVendida) {
        if (cantidadVendida < 0) {
            throw new IllegalArgumentException("La cantidad vendida no puede ser negativa.");
        }
        if (cantidadVendida > cantidad) {
            throw new IllegalArgumentException("No hay suficiente stock para vender esa cantidad.");
        }
        cantidad -= cantidadVendida;
    }

    // 6) toString para mostrar la informacion del producto

    @Override // override para indicar que estamos sobrescribiendo el metodo toString de la
              // clase Object
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

}