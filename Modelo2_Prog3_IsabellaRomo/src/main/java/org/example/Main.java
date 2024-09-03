package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //CREACION DE MEDIDAS
        UnidadMedida ochoPorciones = UnidadMedida.builder().id(1L).denominacion("8 Porciones").build();
        UnidadMedida cuatroPorciones = UnidadMedida.builder().id(2L).denominacion("4 Porciones").build();
        UnidadMedida unLitro = UnidadMedida.builder().id(3L).denominacion("1Litro").build();

        //CREACION DE IMAGENES
        Imagen imagen1 = Imagen.builder().id(1L).denominacion("Imagen Pizza Grande Hawaiana").build();
        Imagen imagen2 = Imagen.builder().id(2L).denominacion("Imagen Pizza Grande Napolitana").build();
        Imagen imagen3 = Imagen.builder().id(3L).denominacion("Imagen Pizza Grande Muzzarella").build();
        Imagen imagen4 = Imagen.builder().id(4L).denominacion("Imagen Pizza Chica Hawaiana").build();
        Imagen imagen5 = Imagen.builder().id(5L).denominacion("Imagen Pizza Chica Napolitana").build();
        Imagen imagen6 = Imagen.builder().id(6L).denominacion("Imagen Pizza Chica Muzzarella").build();
        Imagen imagen7 = Imagen.builder().id(7L).denominacion("Imagen Cerveza Andes").build();
        Imagen imagen8 = Imagen.builder().id(8L).denominacion("Imagen Cerveza Quilmes").build();
        Imagen happyhour1 = Imagen.builder().id(9L).denominacion("Imagen Happy Hour 1").build();
        Imagen happyhour2 = Imagen.builder().id(10L).denominacion("Imagen Happy Hour 2").build();
        Imagen verano1 = Imagen.builder().id(11L).denominacion("Imagen Verano 1").build();
        Imagen verano2 = Imagen.builder().id(12L).denominacion("Imagen Verano 2").build();
        Imagen invierno1 = Imagen.builder().id(13L).denominacion("Imagen Invierno 1").build();
        Imagen invierno2 = Imagen.builder().id(14L).denominacion("Imagen Invierno 2").build();
        Imagen cerveza1 = Imagen.builder().id(15L).denominacion("Imagen Cerveza Andes").build();
        Imagen cerveza2 = Imagen.builder().id(16L).denominacion("Imagen Cerveza Quilmes").build();

        //CREACION DE ARTICULOS
        Articulo grandeHawaiana = Articulo.builder()
                .id(1L).denominacion("Pizza Grande Hawaiana").precioVenta(100.0).precioCompra(35.0).stockActual(20).stockMaximo(25).unidadMedida(ochoPorciones).imagen(imagen1).build();
        Articulo chicaHawaiana = Articulo.builder()
                .id(2L).denominacion("Pizza Chica Hawaiana").precioVenta(60.0).precioCompra(20.0).stockActual(20).stockMaximo(25).unidadMedida(cuatroPorciones).imagen(imagen4).build();
        Articulo grandeNapolitana = Articulo.builder()
                .id(3L).denominacion("Pizza Grande Napolitana").precioVenta(135.0).precioCompra(50.0).stockActual(14).stockMaximo(25).unidadMedida(ochoPorciones).imagen(imagen2).build();
        Articulo chicaNapolitana = Articulo.builder()
                .id(4L).denominacion("Pizza Chica Napolitana").precioVenta(75.0).precioCompra(25.0).stockActual(3).stockMaximo(25).unidadMedida(cuatroPorciones).imagen(imagen5).build();
        Articulo grandeMuzza = Articulo.builder()
                .id(5L).denominacion("Pizza Grande Muzzarella").precioVenta(135.0).precioCompra(50.0).stockActual(14).stockMaximo(25).unidadMedida(ochoPorciones).imagen(imagen3).build();
        Articulo chicaMuzza = Articulo.builder()
                .id(6L).denominacion("Pizza Chica Muzzarella").precioVenta(50.0).precioCompra(20.0).stockActual(10).stockMaximo(25).unidadMedida(cuatroPorciones).imagen(imagen6).build();
        Articulo cervezaAndes = Articulo.builder()
                .id(7L).denominacion("Cerveza Andes").precioVenta(30.0).precioCompra(20.0).stockActual(35).stockMaximo(50).unidadMedida(unLitro).imagen(imagen7).build();
        Articulo cervezaQuilmes = Articulo.builder()
                .id(8L).denominacion("Cerveza Quilmes").precioVenta(20.0).precioCompra(12.0).stockActual(22).stockMaximo(35).unidadMedida(unLitro).imagen(imagen8).build();

        HashSet<Articulo> todosLosArticulos = new HashSet<>(Arrays.asList(grandeHawaiana, chicaHawaiana, grandeNapolitana, chicaNapolitana, grandeMuzza, chicaMuzza, cervezaAndes, cervezaQuilmes));


        //CREACION DE PROMOCIONES
        Promocion promoHappyHour = Promocion.builder().id(1L).denominacion("Happy Hour").tipoPromocion(TipoPromocion.HAPPYHOUR)
                .fechaDesde(LocalDate.of(2024, 9,2)).fechaHasta(LocalDate.of(2024, 9, 9))
                .horaDesde(LocalTime.of(17,0)).horaHasta(LocalTime.of(20,0))
                .descripcionDescuento("Aprovechá nuestra promo HAPPY HOUR de [1 Pizza Grande Hawaiana + 1 Pizza Grande Muzza + 1 Cerveza Quilmes] por $230").precioPromocional(230.0)
                .imagenesPromo(Set.of(happyhour1, happyhour2)).articulosPromo(Set.of(grandeHawaiana, grandeMuzza, cervezaQuilmes))
                .build();

        Promocion promoVerano = Promocion.builder().id(2L).denominacion("Verano").tipoPromocion(TipoPromocion.VERANO)
                .fechaDesde(LocalDate.of(2024, 12, 1)).fechaHasta(LocalDate.of(2024, 12, 31))
                .horaDesde(LocalTime.of(12, 0)).horaHasta(LocalTime.of(15, 0))
                .descripcionDescuento("Disfrutá nuestra promo VERANO de [1 Pizza Chica Hawaiana + 1 Pizza Grande Napolitana + 1 Cerveza Quilmes + 1 Cerveza Andes] por $350")
                .precioPromocional(350.0)
                .imagenesPromo(Set.of(verano1, verano2)).articulosPromo(Set.of(chicaHawaiana, grandeNapolitana, cervezaQuilmes, cervezaAndes))
                .build();

        Promocion promoInvierno = Promocion.builder().id(3L).denominacion("Invierno").tipoPromocion(TipoPromocion.INVIERNO)
                .fechaDesde(LocalDate.of(2024, 6, 1)).fechaHasta(LocalDate.of(2024, 6, 30))
                .horaDesde(LocalTime.of(18, 0)).horaHasta(LocalTime.of(21, 0))
                .descripcionDescuento("Aprovechá nuestra promo INVIERNO de [1 Pizza Grande Hawaiana + 1 Pizza Chica Muzza + 1 Cerveza Quilmes] por $280")
                .precioPromocional(280.0)
                .imagenesPromo(Set.of(invierno1, invierno2)).articulosPromo(Set.of(grandeHawaiana, chicaMuzza, cervezaQuilmes))
                .build();

        HashSet<Promocion> todasLasPromos = new HashSet<>(Arrays.asList(promoHappyHour, promoVerano, promoInvierno));

        //MOSTRAR TODAS LAS PROMOCIONES
        System.out.println("-------------------\nTODAS LAS PROMOS\n-------------------");
        for (Promocion promo : todasLasPromos){
            System.out.println(promo.toString());
        }

        //MOSTRAR TODOS LOS ARTICULOS
        System.out.println("-------------------\nTODOS LOS ARTICULOS\n-------------------");
        for (Articulo art : todosLosArticulos){
            System.out.println(art.toString());
        }

        //MOSTRAR CADA PROMO POR SEPARADO
        for (Promocion promo : todasLasPromos){
            System.out.println("-------------------\nPROMO " + promo.getDenominacion().toUpperCase() + "\n-------------------");
            System.out.println(promo.getDescripcionDescuento());
            System.out.println("Artículos:");
            for (Articulo art : promo.getArticulosPromo()){
                System.out.println(art.getDenominacion() + " - $" + art.getPrecioVenta());
            }

            if (promo.getDenominacion().equalsIgnoreCase("VERANO")){
                System.out.println("Desde " + promo.getFechaDesde() + " hasta " + promo.getFechaHasta()
                + "\nDe " + promo.getHoraDesde() + " a " + promo.getHoraHasta());
            }
        }

        //MOSTRAR PROMO MÁS ECONÓMICA
        Promocion promoEconomica = promoHappyHour;
        if (promoInvierno.getPrecioPromocional() < promoEconomica.getPrecioPromocional()){
            promoEconomica = promoInvierno;
        } else if (promoVerano.getPrecioPromocional() < promoEconomica.getPrecioPromocional()){
            promoEconomica = promoVerano;
        }
        System.out.println("-------------------\nPROMO MÁS ECONÓMICA\n-------------------");
        System.out.println(promoEconomica.getDenominacion() + " - $" + promoEconomica.getPrecioPromocional());
    }
}