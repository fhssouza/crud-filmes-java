package br.com.cinetech.cinetechws.service;

import java.util.List;
import java.util.Optional;

import br.com.cinetech.cinetechws.shared.FilmeDto;

public interface FilmeService {
    List<FilmeDto> listarFilmes(); //metodo para o get
    FilmeDto criarFilme(FilmeDto filme); //metodo para o create
    Optional<FilmeDto> atualizarFilme(String id, FilmeDto filme); //metodo para o delete
    void excluirFilmePorId(String id); //metodo para excluir
}
