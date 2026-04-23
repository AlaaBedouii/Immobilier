package com.fst.immobilier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.immobilier.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
