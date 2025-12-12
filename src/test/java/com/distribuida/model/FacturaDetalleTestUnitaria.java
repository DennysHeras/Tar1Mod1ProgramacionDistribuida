package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaDetalleTestUnitaria {

    private FacturaDetalle detalle;

    @BeforeEach
    public void setUp() {
        detalle = new FacturaDetalle(
                1,      // idFacturaDetalle
                2,      // cantidad
                50.0f,  // subtotal
                10,     // idFactura
                100     // idLibro
        );
    }

    @Test
    public void testFacturaDetalleConstructor() {
        assertAll("Validar datos de FacturaDetalle - constructor",
                () -> assertEquals(1, detalle.getIdFacturaDetalle()),
                () -> assertEquals(2, detalle.getCantidad()),
                () -> assertEquals(50.0f, detalle.getSubtotal()),
                () -> assertEquals(10, detalle.getIdFactura()),
                () -> assertEquals(100, detalle.getIdLibro())
        );
    }

    @Test
    public void testFacturaDetalleSetters() {
        // Ojo: NO hay setIdFacturaDetalle, así que no lo tocamos
        detalle.setCantidad(5);
        detalle.setSubtotal(125.0f);
        detalle.setIdFactura(20);
        detalle.setIdLibro(200);

        assertAll("Validar datos de FacturaDetalle - setters",
                () -> assertEquals(5, detalle.getCantidad()),
                () -> assertEquals(125.0f, detalle.getSubtotal()),
                () -> assertEquals(20, detalle.getIdFactura()),
                () -> assertEquals(200, detalle.getIdLibro())
        );
    }

    @Test
    public void testFacturaDetalleToString() {
        String str = detalle.toString();

        assertAll("Validar datos de FacturaDetalle - toString",
                () -> assertTrue(str.contains(String.valueOf(detalle.getIdFacturaDetalle()))),
                () -> assertTrue(str.contains(String.valueOf(detalle.getCantidad()))),
                () -> assertTrue(str.contains(String.valueOf(detalle.getSubtotal()))),
                () -> assertTrue(str.contains(String.valueOf(detalle.getIdFactura()))),
                () -> assertTrue(str.contains(String.valueOf(detalle.getIdLibro())))
        );
    }
}
