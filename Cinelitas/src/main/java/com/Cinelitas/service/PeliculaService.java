/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Pelicula;
import com.Cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elena
 */
@Service
public class PeliculaService implements IPeliculaService{
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
    
}
