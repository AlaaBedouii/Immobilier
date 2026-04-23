package com.fst.immobilier.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.ModelAttribute;



import com.fst.immobilier.entity.Bien;
import com.fst.immobilier.service.BienService;

import org.springframework.ui.Model;
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
    
    @GetMapping("/biens-view")
    public String afficherBiens(Model model) {
        model.addAttribute("biens", service.getAll());
        return "biens"; // nom du fichier HTML
    }
    
    @PostMapping("/biens/add")
    public RedirectView addBien(@ModelAttribute Bien bien) {
        service.create(bien);
        return new RedirectView("/biens-view");
    }
    
    @GetMapping("/biens/delete/{id}")
    public RedirectView delete1(@PathVariable Long id) {
        service.delete(id);
        return new RedirectView("/biens-view");
    }
    
    @GetMapping("/biens/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("bien", service.getById(id));
        return "edit-bien";
}
    @PostMapping("/biens/update")
    public RedirectView update(@ModelAttribute Bien bien) {
        service.update(bien.getId(), bien);
        return new RedirectView("/biens-view");
    }
    
    @GetMapping("/biens/search")
    public String search(@RequestParam String ville, Model model) {
        model.addAttribute("biens", service.searchByVille(ville));
        return "biens";
    }
}
    
    
    
    