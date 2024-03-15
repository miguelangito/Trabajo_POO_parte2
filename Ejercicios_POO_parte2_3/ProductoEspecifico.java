package Ejercicios_POO_parte2_3;

public class ProductoEspecifico extends Producto{

    public ProductoEspecifico(int id, String nombre, double precio, String categoria,String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    private String categoria;
    private String marca;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProductoEspecifico{" +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
