package com.softtek.presentacion;
import java.time.*;
public class EjerciciosJavaTime {
    public static void main(String[] args) {
        // a Declarar la fecha de inicio del curso y le sumamos 10 días
        LocalDate fechaInicioCurso = LocalDate.of(2023, Month.SEPTEMBER, 10);
        LocalDate fechaSumar = fechaInicioCurso.plusDays(10);
        System.out.println("Fecha inicio curso: " + fechaInicioCurso + " | Fecha sumada: " + fechaSumar);

        // b Declarar la fecha de hoy con la zona horaria por defecto
        LocalDate fechaDefecto = LocalDate.now();
        System.out.println("Fecha por defecto: " + fechaDefecto );

        // c Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
        ZonedDateTime fechaSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Fecha por defecto: " + fechaDefecto + "Fecha Australia: " + fechaSydney);

        // d Cual es el día 100 de 2024
        LocalDate dia100 = LocalDate.ofYearDay(2024, 100);
        System.out.println("Día 100 de 2024: " + dia100);

        // e Definir una fecha para navidad y otra para noche vieja y compararlas con los métodos isBefore isAfter
        LocalDate navidad = LocalDate.of(2024, Month.DECEMBER, 25);
        LocalDate nocheVieja = LocalDate.of(2024, Month.DECEMBER, 31);
        System.out.println("Navidad antes de Nochevieja: " + navidad.isBefore(nocheVieja) + " | Navidad después de Nochevieja: " + navidad.isAfter(nocheVieja));

        // f Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024.
        LocalDate fechaBase = LocalDate.of(2024, Month.MARCH, 15);
        System.out.println("Fecha resultado: " + fechaBase.plusWeeks(35));

        // g Calcular los años trabajados en una empresa de un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate fechaInicio = LocalDate.of(2012, Month.JULY, 6);
        System.out.println("Años trabajados en la empresa: " + Period.between(fechaInicio, fechaDefecto).getYears());


        // h Calcular la edad de una persona que nació el 7 de agosto de 2007

        LocalDate fechaNacimiento = LocalDate.of(2007, Month.AUGUST, 7);
        System.out.println("Edad actual: " + Period.between(fechaNacimiento, fechaDefecto).getYears());

        // i Calcular la fecha en que se tiene que iniciar un proyecto si su duración es 200 días y se tiene que entregar el 2 de octubre de 2024
        LocalDate fechaEntrega = LocalDate.of(2024, Month.OCTOBER, 2);
        LocalDate fechaInicioProyecto = fechaEntrega.minusDays(200);
        LocalDate fechaInicioProyecto2 = LocalDate.of(2024, Month.MARCH, 15);
        System.out.println("Fecha inicio proyecto: " + fechaInicioProyecto);

        // j Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es su periodo.
        LocalDate fechaFinProyecto = LocalDate.of(2024, Month.OCTOBER, 20);
        System.out.println("Duración del proyecto: " + Period.between(fechaInicioProyecto2, fechaFinProyecto));
    }
}
