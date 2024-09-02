package org.example;

import org.model.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        UnidadMedida ochoPorciones = new UnidadMedida().builder().id(123123L).denominacion("Ocho porciones permitidas").build();
        UnidadMedida cuatroPorciones = new UnidadMedida().builder().id(123L).denominacion("Cuatro porciones permitidas").build();
        UnidadMedida unLitro = new UnidadMedida();

        Imagen imagen1 = Imagen.builder().denominacion("Pizza grande hawaiana").id(1L).build();
        Imagen imagen2 = Imagen.builder().denominacion("Pizza grande napolitana").id(2L).build();
        Imagen imagen3 = Imagen.builder().denominacion("Pizza grande muzza").id(3L).build();

        Imagen imagen4 = Imagen.builder().denominacion("Pizza chica hawaiana").id(4L).build();
        Imagen imagen5 = Imagen.builder().denominacion("Pizza chica napolitana").id(5L).build();
        Imagen imagen6 = Imagen.builder().denominacion("Pizza chica muzza").id(6L).build();

        Imagen imagen7 = Imagen.builder().denominacion("Cerveza Andes").id(7L).build();
        Imagen imagen8 = Imagen.builder().denominacion("Cerveza Quilmes").id(8L).build();

        Imagen imahappy1 = Imagen.builder().denominacion("Happy hour").id(3L).build();
        Imagen imahappy2 = Imagen.builder().denominacion("Happy hour").id(2L).build();

        Imagen verano1 = Imagen.builder().denominacion("Verano").id(3L).build();
        Imagen verano2 = Imagen.builder().denominacion("Verano").id(3L).build();
        Imagen invierno1 = Imagen.builder().denominacion("Invierno").id(3L).build();
        Imagen invierno2 = Imagen.builder().denominacion("Invierno").id(3L).build();

        Imagen cerveza1 = Imagen.builder().denominacion("Cerveza Andes").id(3L).build();
        Imagen cerveza2 = Imagen.builder().denominacion("Cerveza Quilmes").id(3L).build();



        //Elementos de Verano 1
        Imagen Imagen1Articulo1Verano1 = new Imagen();
        UnidadMedida cervezaVerano1 = new UnidadMedida().builder()
                .id(123213L)
                .denominacion("Cerveza 1 Verano")
                .build();
        Articulo articulo1 = new Articulo().builder()
                .denominacion("Cerveza de verano 1")
                .id(2133L)
                .precioCompra(1500.00)
                .imagen(Imagen1Articulo1Verano1)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(cervezaVerano1)
                .build();

        //PROMOCION VERANO 1
        Promocion veran01 = new Promocion().builder()
                .denominacion("Verano 1")
                .descripcionDescuento("Descuento verano")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now())
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .id(123L)
                .precioPromocional(2000.00)
                .tipoPromocion(TipoPromocion.VERANO)
                .build();
    }

}