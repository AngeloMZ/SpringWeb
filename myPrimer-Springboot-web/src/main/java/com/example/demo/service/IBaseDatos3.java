package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.bean.Libro;

public interface IBaseDatos3 {
	public void insertar (Libro libro);
	public void borrar(int id);
	public void modificar(Libro libro);
	public Libro getLibro(int id);
	public ArrayList<Libro> getLibros();
	public boolean compruebaUsuario(String usuario, String password);

}
