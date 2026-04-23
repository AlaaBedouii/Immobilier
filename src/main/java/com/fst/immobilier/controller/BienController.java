package com.fst.immobilier.controller;


import com.fst.immobilier.entity.Bien;
import com.fst.immobilier.service.BienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biens")
public class BienController {

    private final BienService service;

    public BienController(BienService service) {
        this.service = service;
    }

    // GET ALL
    @GetMapping

    public List<Bien> getAll() {
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Bien getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // CREATE
    @PostMapping
    public Bien create(@RequestBody Bien bien) {
        return service.create(bien);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Bien update(@PathVariable Long id, @RequestBody Bien bien) {
        return service.update(id, bien);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    @GetMapping("/test")
    public String test() {
        return "OK";
    }
}