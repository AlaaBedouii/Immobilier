package com.fst.immobilier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.immobilier.entity.Bien;

public interface BienRepository extends JpaRepository<Bien, Long> {}