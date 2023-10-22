package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="libros")
public class Libro {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Column(name="titulo", nullable=false, length=30)
	private String titulo;
	private String autor;
	private String editorial;
	private String fecha;
	private String tematica;
	
	public Libro() {
	}
	
	public Libro(int id, String titulo,
			String autor, String editorial,
			String fecha, String tematica) {
	this.setId(id);
	this.setTitulo(titulo);
	this.setAutor(autor);
	this.setEditorial(editorial);
	this.setFecha(fecha);
	this.setTematica(tematica);
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
}