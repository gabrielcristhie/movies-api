package com.movies.api.controller;

import com.movies.api.entities.ImdbEntity;
import com.movies.api.repository.ImdbRepository;
import com.movies.api.responses.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ImdbController {
    private final ImdbRepository imdbRepository;

    ImdbController(ImdbRepository imdbRepository){
        this.imdbRepository = imdbRepository;
    }

    @RequestMapping(value = "/imdb", method = RequestMethod.GET)
    public List<ImdbEntity> Get(){
        return imdbRepository.findAll();
    }

    @RequestMapping(value = "/imdb/{id}", method = RequestMethod.GET)
    public ResponseEntity<ImdbEntity> GetById(@PathVariable(value = "id") long id ){
        Optional<ImdbEntity> imdb = imdbRepository.findById(id);
        if(imdb.isPresent())
            return new ResponseEntity<ImdbEntity>(imdb.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/imdb", method = RequestMethod.POST)
    public ResponseEntity<Response<ImdbEntity>> Post( @RequestBody ImdbEntity movie, BindingResult result) {
        Response<ImdbEntity> response = new Response<ImdbEntity>();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }
        imdbRepository.save(movie);
        response.setData(movie);
        return ResponseEntity.ok(response);
    }
}
