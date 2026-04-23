package com.fst.immobilier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.immobilier.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {}
