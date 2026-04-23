package com.fst.immobilier.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.fst.immobilier.entity.Bien;
import com.fst.immobilier.service.BienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BienViewController {

    private final BienService service;

    public BienViewController(BienService service) {
        this.service = service;
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
    public RedirectView delete(@PathVariable Long id) {
        service.delete(id);
        return new RedirectView("/biens-view");
    }
}