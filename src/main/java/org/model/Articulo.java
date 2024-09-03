package org.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer strockAnual;
    private Integer stockMaximo;
    private Imagen imagen;
    private UnidadMedida unidadMedida;
}
