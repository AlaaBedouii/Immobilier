package com.fst.immobilier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.immobilier.entity.Bien;

public interface BienRepository extends JpaRepository<Bien, Long> {List<Bien> findByVilleContaining(String ville);}
