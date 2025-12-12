package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaTestUnitaria {

    private Factura factura;

    @BeforeEach
    public void setUp() {
        factura = new Factura(
                1,
                "F-001",
                LocalDateTime.of(2024, 1, 15, 10, 30),
                100.0f,
                12.0f,
                112.0f,
                5
        );
    }

    @Test
    public void testFacturaConstructor() {
        assertAll("Validar datos de la Factura - constructor",
                () -> assertEquals(1, factura.getIdFactura()),
                () -> assertEquals("F-001", factura.getNumFactura()),
                () -> assertEquals(LocalDateTime.of(2024, 1, 15, 10, 30), factura.getFecha()),
                () -> assertEquals(100.0f, factura.getTotalNeto()),
                () -> assertEquals(12.0f, factura.getIva()),
                () -> assertEquals(112.0f, factura.getTotal()),
                () -> assertEquals(5, factura.getIdCliente())
        );
    }

    @Test
    public void testFacturaSetters() {
        factura.setNumFactura("F-002");
        factura.setFecha(LocalDateTime.of(2024, 2, 10, 12, 0));
        factura.setTotalNeto(200.0f);
        factura.setIva(24.0f);
        factura.setTotal(224.0f);
        factura.setIdCliente(10);

        assertAll("Validar datos de la Factura - setters",
                () -> assertEquals("F-002", factura.getNumFactura()),
                () -> assertEquals(LocalDateTime.of(2024, 2, 10, 12, 0), factura.getFecha()),
                () -> assertEquals(200.0f, factura.getTotalNeto()),
                () -> assertEquals(24.0f, factura.getIva()),
                () -> assertEquals(224.0f, factura.getTotal()),
                () -> assertEquals(10, factura.getIdCliente())
        );
    }

    @Test
    public void testFacturaToString() {
        String str = factura.toString();

        assertAll("Validar datos de la Factura - toString",
                () -> assertTrue(str.contains(String.valueOf(factura.getIdFactura()))),
                () -> assertTrue(str.contains(factura.getNumFactura())),
                () -> assertTrue(str.contains(factura.getFecha().toString())),
                () -> assertTrue(str.contains(String.valueOf(factura.getTotalNeto()))),
                () -> assertTrue(str.contains(String.valueOf(factura.getIva()))),
                () -> assertTrue(str.contains(String.valueOf(factura.getTotal()))),
                () -> assertTrue(str.contains(String.valueOf(factura.getIdCliente())))
        );
    }
}
