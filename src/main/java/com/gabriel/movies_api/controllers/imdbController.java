package com.gabriel.movies_api.controllers;

import com.gabriel.movies_api.entities.imdb;
import com.gabriel.movies_api.repository.ImdbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class imdbController {
    @Autowired
    private ImdbRepository imdbRepository;

    @RequestMapping(value = "/imbd", method = RequestMethod.GET)
    public List<imdb> Get(){
        return imdbRepository.findAll();
    }

    @RequestMapping(value = "/imbd/{id}", method = RequestMethod.GET)
    public ResponseEntity<imdb> GetById(@PathVariable(value = "id") long id ){
        Optional<imdb> imdb = imdbRepository.findById(id);
        if(imdb.isPresent())
            return new ResponseEntity<imdb>(imdb.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
