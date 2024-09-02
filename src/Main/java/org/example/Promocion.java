package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

import lombok.*;

@Data
@Builder
public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Imagen promoImagen;
    private HashSet<Articulo> promociones;
}
