package com.project.ZooApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalApi {

    private AnimalMapper animalMapper;

    @Autowired
    public AnimalApi(AnimalMapper animalMapper) {
        this.animalMapper = animalMapper;
    }

    @GetMapping
    public List<Animal> getAll() {
        return animalMapper.findAll();
    }


    @GetMapping("/id/{id}")
    public Animal getOne(@PathVariable Long id) {
        return animalMapper.findById(id);
    }

    @PostMapping
    public void addAnimal(@RequestBody Animal animal) {
        animalMapper.insert(animal);
    }
}
