package org.example;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.*;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TipoPromocion horaFeliz = TipoPromocion.happyHour;

        UnidadMedida unidadMedida = UnidadMedida.builder().denominacion("8 Porciones").id(1L).build();
        UnidadMedida unidadMedida2 = UnidadMedida.builder().denominacion("4 Porciones").id(2L).build();
        UnidadMedida unidadMedida3 = UnidadMedida.builder().denominacion("1Litro").id(3L).build();

        Imagen imagen1 = Imagen.builder().denominacion("Imagen Pizza grande hawaiana").id(1L).build();
        Imagen imagen2 = Imagen.builder().denominacion("Imagen Pizza grande napolitana").id(2L).build();
        Imagen imagen3 = Imagen.builder().denominacion("Imagen Pizza grande muzza").id(3L).build();

        Imagen imagen4 = Imagen.builder().denominacion("Imagen Pizza chica hawaiana").id(4L).build();
        Imagen imagen5 = Imagen.builder().denominacion("Imagen Pizza chica napolitana").id(5L).build();
        Imagen imagen6 = Imagen.builder().denominacion("Imagen Pizza chica muzza").id(6L).build();

        Imagen imagen7 = Imagen.builder().denominacion("Imagen Cerveza Andes").id(7L).build();
        Imagen imagen8 = Imagen.builder().denominacion("Imagen Cerveza Quilmes").id(8L).build();

        Imagen happyhour1 = Imagen.builder().denominacion("Imagen Happy Hour 1").id(9L).build();
        Imagen happyhour2 = Imagen.builder().denominacion("Imagen Happy Hour 2").id(10L).build();

        Imagen verano1 = Imagen.builder().denominacion("Imagen Verano 1").id(11L).build();
        Imagen verano2 = Imagen.builder().denominacion("Imagen Verano 2").id(12L).build();

        Imagen invierno1 = Imagen.builder().denominacion("Imagen Invierno 1").id(13L).build();
        Imagen invierno2 = Imagen.builder().denominacion("Imagen Invierno 2").id(14L).build();


        Articulo grandeHawaiana = Articulo.builder()
                .id(1L).denominacion("Pizza grande Hawaiana").precioVenta(120.0).precioCompra(40.0).stockActual(15).stockMaximo(30).unidadMedida(unidadMedida).imagen(imagen1).build();
        Articulo chicaHawaiana = Articulo.builder()
                .id(2L).denominacion("Pizza chica Hawaiana").precioVenta(70.0).precioCompra(25.0).stockActual(18).stockMaximo(30).unidadMedida(unidadMedida2).imagen(imagen4).build();
        Articulo grandeNapolitana = Articulo.builder()
                .id(3L).denominacion("Pizza grande Napolitana").precioVenta(150.0).precioCompra(60.0).stockActual(10).stockMaximo(20).unidadMedida(unidadMedida).imagen(imagen2).build();
        Articulo chicaNapolitana = Articulo.builder()
                .id(4L).denominacion("Pizza chica Napolitana").precioVenta(80.0).precioCompra(30.0).stockActual(5).stockMaximo(20).unidadMedida(unidadMedida2).imagen(imagen5).build();
        Articulo grandeMuzza = Articulo.builder()
                .id(5L).denominacion("Pizza grande Muzza").precioVenta(140.0).precioCompra(55.0).stockActual(12).stockMaximo(30).unidadMedida(unidadMedida).imagen(imagen3).build();
        Articulo chicaMuzza = Articulo.builder()
                .id(6L).denominacion("Pizza chica Muzza").precioVenta(60.0).precioCompra(25.0).stockActual(8).stockMaximo(25).unidadMedida(unidadMedida2).imagen(imagen6).build();
        Articulo cervezaAndes = Articulo.builder()
                .id(7L).denominacion("Cerveza Andes").precioVenta(35.0).precioCompra(22.0).stockActual(30).stockMaximo(40).unidadMedida(unidadMedida3).imagen(imagen7).build();
        Articulo cervezaQuilmes = Articulo.builder()
                .id(8L).denominacion("Cerveza Quilmes").precioVenta(25.0).precioCompra(15.0).stockActual(20).stockMaximo(30).unidadMedida(unidadMedida3).imagen(imagen8).build();

        //Happy Hour
        HashSet <Articulo> articulosHappyHour = new HashSet<>();
        articulosHappyHour.add(grandeHawaiana);
        articulosHappyHour.add(grandeMuzza);
        articulosHappyHour.add(cervezaQuilmes);
        //Imagen
        HashSet <Imagen> imagenesHappyHour = new HashSet<>();
        imagenesHappyHour.add(happyhour1);
        imagenesHappyHour.add(happyhour2);

        //Verano
        HashSet <Articulo> articulosVerano = new HashSet<>();
        articulosVerano.add(chicaHawaiana);
        articulosVerano.add(grandeNapolitana);
        articulosVerano.add(cervezaQuilmes);
        articulosVerano.add(cervezaAndes);
        //Imagen
        HashSet <Imagen> imagenesVerano = new HashSet<>();
        imagenesVerano.add(verano1);
        imagenesVerano.add(verano2);

        //Invierno
        HashSet <Articulo> articulosInvierno = new HashSet<>();
        articulosInvierno.add(grandeHawaiana);
        articulosInvierno.add(chicaMuzza);
        articulosInvierno.add(cervezaQuilmes);
        //Imagen
        HashSet <Imagen> imagenesInvierno = new HashSet<>();
        imagenesInvierno.add(invierno1);
        imagenesInvierno.add(invierno2);

        Promocion promocionHappyHour = Promocion.builder()
                .id(1L)
                .denominacion("Promocion HappyHour: 1 Pizza grande Hawaiana,  1 Pizza grande Muzza, 1 Cerveza Quilmes")
                .fechaDesde(LocalDate.of(2024,9,2))
                .fechaHasta(LocalDate.of(2024,10,20)).horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .descripcionDescuento("Descuento en los productos del happy hour")
                .precioPromocional(6000.60)
                .tipoPromocion(TipoPromocion.happyHour)
                .imagenPromo(imagenesHappyHour)
                .articulos(articulosHappyHour).build();


        Promocion promocionVerano = Promocion.builder()
                .id(2L)
                .denominacion("Promocion Verano: 1 Pizza chica Hawaiana,  1 Pizza grande Napolitana, 1 Cerveza Quilmes y 1 Cerveza Andes")
                .fechaDesde(LocalDate.of(2024,12,21))
                .fechaHasta(LocalDate.of(2024,3,20))
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .descripcionDescuento("Descuento en la temporada de Verano")
                .precioPromocional(3900.50)
                .tipoPromocion(TipoPromocion.Verano)
                .imagenPromo(imagenesVerano)
                .articulos(articulosVerano).build();

        Promocion promocionInvierno = Promocion.builder()
                .id(3L).denominacion("1 Pizza grande Hawaiana,  1 Pizza chica Muzza, 1 Cerveza Quilmes.")
                .fechaDesde(LocalDate.of(2024,6,21))
                .fechaHasta(LocalDate.of(2024,9,20))
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .descripcionDescuento("Descuento en la promocion 1")
                .precioPromocional(5999.99)
                .tipoPromocion(TipoPromocion.Invierno)
                .imagenPromo(imagenesInvierno)
                .articulos(articulosInvierno).build();


        Scanner leerNum = new Scanner(System.in);
        boolean salir = false;
        List<Articulo> articulos = new ArrayList<>();
        Collections.addAll(articulos,grandeHawaiana,chicaHawaiana,grandeNapolitana,chicaNapolitana,grandeMuzza,chicaMuzza,cervezaAndes,cervezaQuilmes);


        while (!salir){
            System.out.println("*****************************");
            System.out.println("1-Mostrar todas las promociones");
            System.out.println("2-Mostrar todos los articulos");
            System.out.println("3-Mostrar cada promociones por separado y los articulos con su precio");
            System.out.println("4-Mostrar el dia y horario de la promocion de verano");
            System.out.println("5-Mostrar cual es la promocion mas economica de las 3\n");
            System.out.println("Otro- Salir\n");
            int numero = leerNum.nextInt();
            switch (numero){
                case 1:
                    System.out.println("-----------------PROMOCIONES-----------------");
                    System.out.println("-----------------HAPPY HOUR-----------------");
                    System.out.println(promocionHappyHour.toString());

                    System.out.println("-----------------VERANO-----------------");
                    System.out.println(promocionVerano.toString());

                    System.out.println("-----------------INVIERNO-----------------");
                    System.out.println(promocionInvierno.toString());

                    break;
                case 2:
                    System.out.println("-----------------ARTICULOS-----------------");
                    for (Articulo articulo : articulos){
                        System.out.println(articulo);
                        System.out.println("----------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("-----------------PROMOCIONES-----------------");
                    System.out.println("-----------------HAPPY HOUR-----------------");
                    System.out.println("Precio: "+promocionHappyHour.getPrecioPromocional());
                    System.out.println("Descripcion: "+ promocionHappyHour.getDescripcionDescuento());
                    System.out.println("\nArticulos:");
                    int cantidad = 1;
                    for (Articulo art: promocionHappyHour.getArticulos()){
                        System.out.println("**Articulo "+ cantidad+"**");
                        System.out.println(art.toString());
                        cantidad +=1;
                    }
                    cantidad = 1;
                    System.out.println("-----------------VERANO-----------------");
                    System.out.println(promocionVerano.toString());
                    for (Articulo art: promocionVerano.getArticulos()){
                        System.out.println("**Articulo "+ cantidad+"**");
                        System.out.println(art.toString());
                        cantidad +=1;
                    }

                    cantidad = 1;
                    System.out.println("-----------------INVIERNO-----------------");
                    System.out.println(promocionInvierno.toString());
                    for (Articulo art: promocionInvierno.getArticulos()){
                        System.out.println("**Articulo "+ cantidad+"**");
                        System.out.println(art.toString());
                        cantidad +=1;
                    }
                    break;
                case 4:
                    System.out.println("-----------------FECHA Y HORA DE PROMO VERANO-----------------");
                    System.out.println("Desde :"+promocionVerano.getFechaDesde() + "a las "+promocionVerano.getHoraDesde());
                    System.out.println("Hasta :"+promocionVerano.getFechaHasta()+ "a las "+promocionVerano.getHoraHasta());

                    break;
                case 5:
                    Promocion promoMasBarata = promocionHappyHour;
                    if (promoMasBarata.getPrecioPromocional()>promocionInvierno.getPrecioPromocional()){
                        promoMasBarata = promocionInvierno;
                    } else if (promoMasBarata.getPrecioPromocional()>promocionVerano.getPrecioPromocional()){
                        promoMasBarata = promocionVerano;
                    }
                    System.out.println("-----------------PROMOCION MAS BARATA-----------------");
                    System.out.println(promoMasBarata);
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }
}