/*package domain;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SuenioTests {
    //Inmuebles
    private Casa casa1;

    @Before
    public void Init(){
        //Zona
        this.palermo = new Zona(40000, "Palermo");
    }

    @Test
    public void CalcularComisionTest(){
        this.emp1.ConcretarOperacion(depto1, alquiler1, cliente1);
        Assert.assertEquals(alquiler1.calcularComision(depto1), emp1.getComision(),0);
    }


    @Test
    public void MejorEmpleadoTest(){
        List<Empleado> empleados = new ArrayList<>();
        this.emp1.ConcretarOperacion(depto1, alquiler1, cliente1);
        this.emp2.ConcretarOperacion(ph2, venta3, cliente3);
        this.emp3.ConcretarOperacion(casa1, venta1, cliente4);
        this.emp4.ConcretarOperacion(depto3, alquiler3, cliente2);
        this.emp1.ConcretarOperacion(ph3, alquiler2, cliente1);
        this.emp4.ConcretarOperacion(casa3, venta2, cliente2);
        this.emp2.ConcretarOperacion(depto2, alquiler1, cliente4);
        this.emp3.ConcretarOperacion(casa2, venta3, cliente2);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);


        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getComision())));
        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getCantOperacionesReservadas())));
        Assert.assertEquals(emp4, Collections.max(empleados, Comparator.comparing(e -> e.getCantOperacionesConcretadas())));



    }

}*/
