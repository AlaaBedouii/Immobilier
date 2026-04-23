package com.fst.immobilier.service;



import com.fst.immobilier.entity.Bien;
import com.fst.immobilier.repository.BienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BienService {

    private final BienRepository repo;

    public BienService(BienRepository repo) {
        this.repo = repo;
    }

    // GET ALL
    public List<Bien> getAll() {
        return repo.findAll();
    }

    // GET BY ID
    public Bien getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Bien introuvable"));
    }

    // CREATE
    public Bien create(Bien bien) {
        return repo.save(bien);
    }

    // UPDATE
    public Bien update(Long id, Bien newBien) {
        Bien b = getById(id);
        b.setTitre(newBien.getTitre());
        b.setVille(newBien.getVille());
        b.setPrix(newBien.getPrix());
        return repo.save(b);
    }

    // DELETE
    public void delete(Long id) {
        repo.deleteById(id);
    }
}