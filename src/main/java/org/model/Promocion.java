package org.model;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    @Builder.Default
    private Set<Imagen> imagenPromo = new HashSet<>();
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    @Override
    public String toString() {
        return "Promocion " + denominacion + ":"+
                "\nid " + id +
                "\nFechaDesde " + fechaDesde +
                "\nFechaHasta " + fechaHasta +
                "\nHoraDesde " + horaDesde +
                "\nHoraHasta " + horaHasta +
                "\nDescripcionDescuento " + descripcionDescuento +
                "\nPrecioPromocional " + precioPromocional +
                "\nTipoPromocion " + tipoPromocion ;
    }
}