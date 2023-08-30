package com.eam.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoriaId ;
	private String nombre;

	public Categoria() {
	}

	public Categoria(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	
}
