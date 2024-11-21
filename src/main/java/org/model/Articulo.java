package org.model;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedida;
    private Imagen imagen;
    // Getters and setters

    @Override
    public String toString() {
        return
                "Id " + id +
                "\nDenominacion " + denominacion + '\'' +
                "\nPrecioVenta " + precioVenta +
                "\nPrecioCompra " + precioCompra +
                "\nStockActual " + stockActual +
                "\nStockMaximo " + stockMaximo +
                "\nUnidadMedida " + unidadMedida +
                "\nImagen: " + imagen ;
    }
}