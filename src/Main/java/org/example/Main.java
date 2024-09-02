package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Creacion Unidades de Medida
        UnidadMedida unidadMedida = UnidadMedida.builder()
                .id(1L)
                .denominacion("8 Porciones")
                .build();
        UnidadMedida unidadMedida2 = UnidadMedida.builder()
                .id(2L)
                .denominacion("4 Porciones")
                .build();
        UnidadMedida unidadMedida3 = UnidadMedida.builder()
                .id(3L)
                .denominacion("1 Litro")
                .build();

        Imagen imagen1 =  Imagen.builder()
                .id(1L).denominacion("Pizza grande hawaiana").build();
        Imagen imagen2 =  Imagen.builder()
                .id(2L).denominacion("Pizza grande napolitana").build();
        Imagen imagen3 = Imagen.builder()
                .id(3L).denominacion("Pizza grande muzza").build();
        Imagen imagen4 =  Imagen.builder()
                .id(4L).denominacion("Pizza chica hawaiana").build();
        Imagen imagen5 = Imagen.builder()
                .id(5L).denominacion("Pizza chica napolitana").build();
        Imagen imagen6 =  Imagen.builder()
                .id(6L).denominacion("Pizza chica muzza").build();
        Imagen imagen7 =  Imagen.builder()
                .id(7L).denominacion("Cerveza Andes").build();
        Imagen imagen8 =  Imagen.builder()
                .id(8L).denominacion("Cerveza Quilmes").build();
        Imagen imahappy1 = Imagen.builder()
                .id(9L).denominacion("Happy Hour").build();
        Imagen imahappy2 = Imagen.builder()
                .id(10L).denominacion("Happy Hour 2").build();
        Imagen verano1 = Imagen.builder()
                .id(11L).denominacion("Promo Verano").build();
        Imagen verano2 = Imagen.builder()
                .id(12L).denominacion("Promo Verano 2").build();
        Imagen invierno1 = Imagen.builder()
                .id(13L).denominacion("Promo invierno").build();
        Imagen invierno2 =  Imagen.builder()
                .id(11L).denominacion("Promo invierno 2").build();
        Articulo grandeHawaiana = Articulo.builder()
                .id(1L).denominacion("Pizza grande Hawaiana,").precioVenta(100.0).precioCompra(35.0).stockActual(20).stockMaximo(25).unidadMedida(unidadMedida).imagen(imagen1).build();
        Articulo chicaHawaiana = Articulo.builder()
                .id(2L).denominacion("Pizza chica Hawaiana,").precioVenta(60.0).precioCompra(20.0).stockActual(20).stockMaximo(25).unidadMedida(unidadMedida2).imagen(imagen4).build();
        Articulo grandeNapolitana = Articulo.builder()
                .id(3L).denominacion("Pizza grande Napolitana,").precioVenta(135.0).precioCompra(50.0).stockActual(14).stockMaximo(25).unidadMedida(unidadMedida).imagen(imagen2).build();
        Articulo chicaNapolitana = Articulo.builder()
                .id(4L).denominacion("Pizza chica Napolitana,").precioVenta(75.0).precioCompra(25.0).stockActual(3).stockMaximo(25).unidadMedida(unidadMedida2).imagen(imagen5).build();
        Articulo grandeMuzza = Articulo.builder()
                .id(1L).denominacion("Pizza grande Muzza,").precioVenta(135.0).precioCompra(50.0).stockActual(14).stockMaximo(25).unidadMedida(unidadMedida).imagen(imagen3).build();
        Articulo chicaMuzza = Articulo.builder()
                .id(1L).denominacion("Pizza chica Muzza,").precioVenta(50.0).precioCompra(20.0).stockActual(10).stockMaximo(25).unidadMedida(unidadMedida2).imagen(imagen6).build();
        Articulo cervezaAndes = Articulo.builder()
                .id(1L).denominacion("Cerveza Andes").precioVenta(30.0).precioCompra(20.0).stockActual(35).stockMaximo(50).unidadMedida(unidadMedida3).imagen(imagen7).build();
        Articulo cervezaQuilmes = Articulo.builder()
                .id(2L).denominacion("Cerveza Quilmes").precioVenta(20.0).precioCompra(12.0).stockActual(22).stockMaximo(35).unidadMedida(unidadMedida3).imagen(imagen8).build();

        HashSet<Articulo> happyArticulos = new HashSet<>();
        happyArticulos.add(grandeHawaiana);
        happyArticulos.add(grandeMuzza);
        happyArticulos.add(cervezaQuilmes);

        HashSet<Articulo> veranoArticulos = new HashSet<>();
        veranoArticulos.add(chicaHawaiana);
        veranoArticulos.add(grandeNapolitana);
        veranoArticulos.add(cervezaAndes);
        veranoArticulos.add(cervezaQuilmes);

        HashSet<Articulo> inviernoArticulos = new HashSet<>();
        inviernoArticulos.add(grandeHawaiana);
        inviernoArticulos.add(chicaMuzza);
        inviernoArticulos.add(cervezaQuilmes);


        Promocion happyHour = Promocion.builder()
                .id(1L).denominacion("Promo Happy Hour").fechaDesde(LocalDate.now()).fechaHasta(LocalDate.of(2024, 10, 1)).horaDesde(LocalTime.of(18,00)).horaHasta(LocalTime.of(23, 59)).descripcionDescuento("Descuento de 18hs a 00hs").precioPromocional(500.0).tipoPromocion(TipoPromocion.HAPPYHOUR).promoImagen(imahappy1).promociones(happyArticulos).build();
        Promocion verano = Promocion.builder()
                .id(2L).denominacion("Promo Verano").fechaDesde(LocalDate.of(2025,1,1)).fechaHasta(LocalDate.of(2024, 3, 1)).horaDesde(LocalTime.of(10,0)).horaHasta(LocalTime.of(23, 59)).descripcionDescuento("Promos de enero a marzo").precioPromocional(600.0).tipoPromocion(TipoPromocion.VERANO).promoImagen(verano1).promociones(veranoArticulos).build();
        Promocion invierno = Promocion.builder()
                .id(3L).denominacion("Promo Invierno").fechaDesde(LocalDate.of(2025,6,20)).fechaHasta(LocalDate.of(2024, 9, 21)).horaDesde(LocalTime.of(10,0)).horaHasta(LocalTime.of(23, 59)).descripcionDescuento("Promos de junio a septiembre").precioPromocional(600.0).tipoPromocion(TipoPromocion.INVIERNO).promoImagen(invierno1).promociones(inviernoArticulos).build();



    }
}