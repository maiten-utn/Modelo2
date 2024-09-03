package org.example;

import org.model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UnidadMedida ochoPorciones = new UnidadMedida().builder().id(123123L).denominacion("Ocho porciones permitidas").build();
        UnidadMedida cuatroPorciones = new UnidadMedida().builder().id(123L).denominacion("Cuatro porciones permitidas").build();
        UnidadMedida unLitro = new UnidadMedida().builder()
                .denominacion("Un litro")
                .id(12312L)
                .build();

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

        //ARTICULOS
        Articulo pizzaGrandeHawaiana = new Articulo().builder()
                .denominacion("Pizza Grande Hawaiana")
                .id(2133L)
                .precioCompra(1500.00)
                .imagen(imagen1)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(ochoPorciones)
                .build();

        Articulo pizzaChicaHawaina = new Articulo().builder()
                .denominacion("Pizza Chica Hawaiana")
                .id(1232L)
                .precioCompra(1500.00)
                .imagen(imagen4)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(cuatroPorciones)
                .build();

        Articulo pizzaGrandeNapolitana = new Articulo().builder()
                .denominacion("Pizza Grande Napolitana")
                .id(1232L)
                .precioCompra(1500.00)
                .imagen(imagen2)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(ochoPorciones)
                .build();

        Articulo pizzaChicaNapolitana = new Articulo().builder()
                .denominacion("Pizza Chica Napolitana")
                .id(1232L)
                .imagen(imagen5)
                .precioCompra(1500.00)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(cuatroPorciones)
                .build();

        Articulo pizzaGrandeMuzza = new Articulo().builder()
                .denominacion("Pizza Grande Muzza")
                .id(1232L)
                .precioCompra(1500.00)
                .imagen(imagen3)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(ochoPorciones)
                .build();

        Articulo pizzaChicaMuzza = new Articulo().builder()
                .denominacion("Pizza Chica Muzza")
                .id(1232L)
                .imagen(imagen6)
                .precioCompra(1500.00)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(cuatroPorciones)
                .build();

        Articulo cervezaAndes = new Articulo().builder()
                .denominacion("Cerveza Andes")
                .id(1232L)
                .imagen(imagen7)
                .precioCompra(1500.00)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(unLitro)
                .build();

        Articulo cervezaQuilmes = new Articulo().builder()
                .denominacion("Cerveza Quilmes")
                .id(1232L)
                .imagen(imagen8)
                .precioCompra(1500.00)
                .precioVenta(2300.00)
                .stockMaximo(200)
                .strockAnual(900)
                .unidadMedida(unLitro)
                .build();

        Promocion happyHour = new Promocion().builder()
                .id(213123L)
                .denominacion("Happy Hour")
                .descripcionDescuento("1 Pizza grande Hawaiana,  1 Pizza grande Muzza, 1 Cerveza Quilmes")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now())
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .precioPromocional(10.00)
                .build();

        happyHour.getPromociones().add(pizzaGrandeHawaiana);
        happyHour.getPromociones().add(pizzaChicaMuzza);
        happyHour.getPromociones().add(cervezaQuilmes);
        happyHour.getImagenes().add(imahappy1);
        happyHour.getImagenes().add(imahappy2);

        Promocion verano = new Promocion().builder()
                .id(2131223L)
                .denominacion("Verano")
                .descripcionDescuento("1 Pizza chica Hawaiana,  1 Pizza grande Napolitana, 1 Cerveza Quilmes y 1 Cerveza Andes")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now())
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .precioPromocional(9.00)
                .build();

        verano.getPromociones().add(pizzaChicaHawaina);
        verano.getPromociones().add(pizzaGrandeNapolitana);
        verano.getPromociones().add(cervezaQuilmes);
        verano.getPromociones().add(cervezaAndes);
        verano.getImagenes().add(verano1);
        verano.getImagenes().add(verano2);

        Promocion invierno = new Promocion().builder()
                .id(2131223L)
                .denominacion("Invierno")
                .descripcionDescuento("1 Pizza grande Hawaiana,  1 Pizza chica Muzza, 1 Cerveza Quilmes.")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now())
                .horaDesde(LocalTime.now())
                .horaHasta(LocalTime.now())
                .precioPromocional(120.00)
                .build();

        invierno.getPromociones().add(pizzaGrandeHawaiana);
        invierno.getPromociones().add(pizzaChicaMuzza);
        invierno.getPromociones().add(cervezaQuilmes);
        invierno.getImagenes().add(invierno1);
        invierno.getImagenes().add(invierno2);

        //Muestra de Promociones
        System.out.println("****PROMOCIONES****");
        List<Promocion> promociones = new ArrayList<>();
        Collections.addAll(promociones,happyHour,verano,invierno);
        for (Promocion promocion : promociones){
            System.out.println(promocion);
        }

        //Muestra de Articulos
        List<Articulo> articulos = new ArrayList<>();
        Collections.addAll(articulos,pizzaChicaNapolitana,pizzaGrandeNapolitana,pizzaChicaHawaina,pizzaGrandeHawaiana,pizzaChicaMuzza,pizzaGrandeMuzza,cervezaQuilmes,cervezaAndes);

        System.out.println();
        System.out.println("****ARTICULOS****");
        for (Articulo articulo : articulos){
            System.out.println(articulo);
        }

        //Muestra de Promomociones
        System.out.println();
        System.out.println("PROMOCIONES");
        for (Promocion promocion : promociones){
            System.out.println(promocion.getDenominacion()+ ": ");
            for(Articulo articulo : promocion.getPromociones()){
                System.out.println("Imagen: " + articulo.getImagen().getDenominacion());
                System.out.println("Nombre: " + articulo.getDenominacion());
                System.out.println("Precio: " + articulo.getPrecioCompra());
                System.out.println("Unidad: " + articulo.getUnidadMedida().getDenominacion());
                System.out.println();
            }
        }

        //Muestra de Promocion de Verano
        System.out.println();
        System.out.println("INFORMACION DE PROMOCION VERANO");
        System.out.println("DESDE " + verano.getFechaDesde() + ", HASTA " + verano.getFechaHasta());
        System.out.println("Hora Inicio: " +  verano.getHoraDesde() + ", Hora Cierre: " + verano.getHoraHasta());

        //Culculo de la promocion mas barata
        System.out.println();
        System.out.println("PROMOCION MAS BARATA");
        Promocion promoBarata = new Promocion();
        Double menorValor = promociones.get(0).getPrecioPromocional();
        for (Promocion promocion : promociones){
            if (promocion.getPrecioPromocional() < menorValor){
                promoBarata = promocion;
            }
        }
        System.out.println(promoBarata.getDenominacion());
        System.out.println("Precio: " + promoBarata.getPrecioPromocional());

    }

}