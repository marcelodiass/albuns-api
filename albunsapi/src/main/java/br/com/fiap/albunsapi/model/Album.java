package br.com.fiap.albunsapi.model;

public record Album(
		Long id,
		String titulo,
		String artista,
		String genero,
		Integer duracao,
		Integer quantidadeMusicas,
		Double nota
) {}
