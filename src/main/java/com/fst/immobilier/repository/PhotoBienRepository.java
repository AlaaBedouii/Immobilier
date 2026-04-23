package com.fst.immobilier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.immobilier.entity.PhotoBien;

public interface PhotoBienRepository extends JpaRepository<PhotoBien, Long> {

    List<PhotoBien> findByBienId(Long bienId);

    void deleteByBienId(Long bienId);
}
