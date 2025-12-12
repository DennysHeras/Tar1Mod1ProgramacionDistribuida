package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LibroTestUnitaria {

    private Libro libro;

    @BeforeEach
    public void setUp() {
        libro = new Libro(
                1,                                      // idLibro
                "Cien años de soledad",                 // titulo
                "Sudamericana",                         // editorial
                471,                                    // numPaginas
                "Primera",                              // edicion
                "Español",                              // idioma
                LocalDateTime.of(1967, 5, 30, 0, 0),    // fechaPublicacion
                "Novela icónica del realismo mágico",   // descripcion
                "Dura",                                 // tipoPasta
                "978-3-16-148410-0",                    // ISBN
                10,                                     // numEjemplares
                "portada.jpg",                          // portada
                "Tapa dura con sobrecubierta",          // presentacion
                19.99f,                                 // precio
                3,                                      // idCategoria
                1                                       // idAutor
        );
    }

    @Test
    public void testLibroConstructor() {
        assertAll("Validar datos del Libro - constructor",
                () -> assertEquals(1, libro.getIdLibro()),
                () -> assertEquals("Cien años de soledad", libro.getTitulo()),
                () -> assertEquals("Sudamericana", libro.getEditorial()),
                () -> assertEquals(471, libro.getNumPaginas()),
                () -> assertEquals("Primera", libro.getEdicion()),
                () -> assertEquals("Español", libro.getIdioma()),
                () -> assertEquals(LocalDateTime.of(1967, 5,
                        30, 0, 0), libro.getFechaPublicacion()),
                () -> assertEquals("Novela icónica del realismo mágico", libro.getDescripcion()),
                () -> assertEquals("Dura", libro.getTipoPasta()),
                () -> assertEquals("978-3-16-148410-0", libro.getISBN()),
                () -> assertEquals(10, libro.getNumEjemplares()),
                () -> assertEquals("portada.jpg", libro.getPortada()),
                () -> assertEquals("Tapa dura con sobrecubierta", libro.getPresentacion()),
                () -> assertEquals(19.99f, libro.getPrecio()),
                () -> assertEquals(3, libro.getIdCategoria()),
                () -> assertEquals(1, libro.getIdAutor())
        );
    }

    @Test
    public void testLibroSetters() {
        // Ojo: no hay setIdLibro, así que no lo tocamos
        libro.setTitulo("El otoño del patriarca");
        libro.setEditorial("Random House");
        libro.setNumPaginas(320);
        libro.setEdicion("Segunda");
        libro.setIdioma("Inglés");
        libro.setFechaPublicacion(LocalDateTime.of(1975, 1, 1, 0, 0));
        libro.setDescripcion("Novela de dictador latinoamericano");
        libro.setTipoPasta("Blanda");
        libro.setISBN("978-0-123-45678-9");
        libro.setNumEjemplares(5);
        libro.setPortada("portada2.jpg");
        libro.setPresentacion("Rústica");
        libro.setPrecio(24.50f);
        libro.setIdCategoria(4);
        libro.setIdAutor(2);

        assertAll("Validar datos del Libro - setters",
                () -> assertEquals("El otoño del patriarca", libro.getTitulo()),
                () -> assertEquals("Random House", libro.getEditorial()),
                () -> assertEquals(320, libro.getNumPaginas()),
                () -> assertEquals("Segunda", libro.getEdicion()),
                () -> assertEquals("Inglés", libro.getIdioma()),
                () -> assertEquals(LocalDateTime.of(1975, 1, 1, 0, 0), libro.getFechaPublicacion()),
                () -> assertEquals("Novela de dictador latinoamericano", libro.getDescripcion()),
                () -> assertEquals("Blanda", libro.getTipoPasta()),
                () -> assertEquals("978-0-123-45678-9", libro.getISBN()),
                () -> assertEquals(5, libro.getNumEjemplares()),
                () -> assertEquals("portada2.jpg", libro.getPortada()),
                () -> assertEquals("Rústica", libro.getPresentacion()),
                () -> assertEquals(24.50f, libro.getPrecio()),
                () -> assertEquals(4, libro.getIdCategoria()),
                () -> assertEquals(2, libro.getIdAutor())
        );
    }

    @Test
    public void testLibroToString() {
        String str = libro.toString();

        assertAll("Validar datos del Libro - toString",
                () -> assertTrue(str.contains(String.valueOf(libro.getIdLibro()))),
                () -> assertTrue(str.contains(libro.getTitulo())),
                () -> assertTrue(str.contains(libro.getEditorial())),
                () -> assertTrue(str.contains(libro.getIdioma())),
                () -> assertTrue(str.contains(libro.getISBN())),
                () -> assertTrue(str.contains(String.valueOf(libro.getPrecio()))),
                () -> assertTrue(str.contains(String.valueOf(libro.getIdCategoria()))),
                () -> assertTrue(str.contains(String.valueOf(libro.getIdAutor())))
        );
    }
}
