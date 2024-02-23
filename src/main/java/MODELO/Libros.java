/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.sql.Date;
/**
 *
 * @author guami
 */
public class Libros {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private int edicion;
    private String editorial;
    private String lugarCiudad;
    private String lugarPais;
    private Date fechaEdicion;

    public Libros() {
    }

    public Libros(String titulo, Persona autor, String isbn, int paginas, int edicion, String editorial, String lugarCiudad, String lugarPais, Date fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugarCiudad = lugarCiudad;
        this.lugarPais = lugarPais;
        this.fechaEdicion = fechaEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugarCiudad() {
        return lugarCiudad;
    }

    public void setLugarCiudad(String lugarCiudad) {
        this.lugarCiudad = lugarCiudad;
    }

    public String getLugarPais() {
        return lugarPais;
    }

    public void setLugarPais(String lugarPais) {
        this.lugarPais = lugarPais;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }
   
}
